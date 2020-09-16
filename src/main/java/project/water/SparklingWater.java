package main.java.project.water;

import main.java.project.additive.Bubbles;

public class SparklingWater extends Water {

    private Boolean isOpened = false;
    private Bubbles[] bubbles;
    private boolean hasWarmed;


    public SparklingWater() {
        checkIsOpened();
    }


    public void setOpened(Boolean opened) {
        isOpened = opened;
    }

    public void setHasWarmed(boolean hasWarmed) {
        this.hasWarmed = hasWarmed;
    }

    public void pump(Bubbles[] bubbles) {
        //который сетает массив из пузырьков в воду
        System.out.print("Метод сетает массив из пузырьков в воду");
        this.bubbles = bubbles;
        for (int i = 0; i < bubbles.length; i++) {
            this.bubbles[i] = new Bubbles("O2");
        }
        System.out.println("length in pump " + bubbles.length);
    }

    public void setBubbles(Bubbles[] bubbles) {
        this.bubbles = bubbles;
    }

    public Bubbles[] getBubbles() {
        return bubbles;
    }

    public void checkIsOpened() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                while (!isOpened) {
                    System.out.println("Bottle is closed");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException interruptedException) {
                        interruptedException.printStackTrace();
                    }
                }
                System.out.println("Открыли бутылку");
                try {
                    degas();
                } catch (Exception interruptedException) {
                    interruptedException.printStackTrace();
                }
            }
        };
        thread.start();
    }

    private void degas() throws InterruptedException {
        int time = 0;
        while (this.bubbles.length > 0 && this.isOpened) {
            if (this.hasWarmed && this.getTemperature() < 41) {
                time++;
                if (time > 3) {
                    int temperature = this.getTemperature();
                    temperature++;
                    this.setTemperature(temperature);
                    System.out.println("Temperature is set to: " + temperature);
                    time = 0;
                }
            }
            int count = 0;
            for (double i = 0; i < ((this.getTemperature() * 5 + 10)) && i < this.bubbles.length; i++) {
                count++;
                new Bubbles("CO2").cramp();
                this.bubbles = new Bubbles[this.bubbles.length - 1];
            }
            if (this.bubbles.length > 0) {
                isSparkle();
            }
            System.out.println("Bubbles were pumped in bottle №" + " : " + count);
            System.out.println("Bubbles left in bottle №" + " : " + this.bubbles.length);
            Thread.sleep(1000);
        }
    }

    public boolean isSparkle() {
        return true;
    }
}
