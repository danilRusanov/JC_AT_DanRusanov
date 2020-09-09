package main.java.project.water;

import main.java.project.additive.Bubbles;

public class SparklingWater extends Water {

    public Boolean statusIsOpened = false;
    public Bubbles[] bubbles;
    public Boolean hasBubbles = false;

    public void pump(Bubbles[] bubbles) {
        this.bubbles = bubbles;
        if (bubbles.length > 0) {
            this.hasBubbles = true;
        }
    }

    public Bubbles[] isOpened(Bubbles[] bubbles) throws InterruptedException {
        while (this.hasBubbles) {
            for (int i = 0; i < bubbles.length; i++) {
                degas();
                Thread.sleep(2000);
                if (statusIsOpened == false) {
                    return new Bubbles[bubbles.length - i];
                }
            }
            this.hasBubbles = false;
        }
        return new Bubbles[0];
    }

    public void setStatusIsOpened(Boolean b){
        statusIsOpened = b;
    }
    public void degas() {
        Bubbles bubbles = new Bubbles("CO2");
        bubbles.boom();
    }

}
