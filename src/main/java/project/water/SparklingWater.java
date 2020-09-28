package main.java.project.water;

import main.java.project.additive.Bubbles;

import java.util.List;

public class SparklingWater extends Water {

    private Boolean isOpened = false;
    private List<Bubbles> bubbles;
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

    public void pump(List<Bubbles> bubbles, int size) {
        //который сетает массив из пузырьков в воду
        System.out.print("Метод сетает массив из пузырьков в воду");
        this.bubbles = bubbles;
        for (int i = 0; i < size; i++) {
            this.bubbles.add(new Bubbles("O2"));
        }
        System.out.println("length in pump " + bubbles.size());
    }

    public List<Bubbles> getBubbles() {
        return bubbles;
    }

    public void setBubbles(List<Bubbles> bubbles) {
        this.bubbles = bubbles;
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
        while (this.bubbles.size() > 0 && this.isOpened) {
            if (this.hasWarmed && this.getTemperature() <= 40) {
                time++;
                if (time % 60 == 0) {
                    int temperature = this.getTemperature();
                    temperature++;
                    this.setTemperature(temperature);
                    System.out.println("Temperature is set to: " + temperature);
                }
            }
            int count = 0;
            if (((this.getTemperature() * 5) + 10) > this.bubbles.size()) {
                while (this.bubbles.size() != 0) {
                    count++;
                    this.bubbles.get(this.bubbles.size() -1).cramp();
                    this.bubbles.remove(this.bubbles.size() -1);
                }
            }
            if (((this.getTemperature() * 5 + 10))  <= this.bubbles.size()) {
                for (int i = 0; i < ((this.getTemperature() * 5 + 10)); i++) {
                    count++;
                    this.bubbles.get(this.bubbles.size() -1).cramp();
                    this.bubbles.remove(this.bubbles.size() -1);
                }
            }
            if (this.bubbles.size() > 0) {
                isSparkle();
            }
            System.out.println("Bubbles were pumped in bottle №" + " : " + count);
            System.out.println("Bubbles left in bottle №" + " : " + this.bubbles.size());
            System.out.println("Temperature is " + this.getTemperature());
            System.out.println("Time is " + time);
            Thread.sleep(1000);
        }
    }

    public boolean isSparkle() {
        return true;
    }
}
