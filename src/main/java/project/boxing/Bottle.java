package main.java.project.boxing;

import main.java.project.additive.Bubbles;
import main.java.project.water.SparklingWater;

public class Bottle {
    public double volume;
    public SparklingWater sparklingWater;

    public Bottle(double volume) {
        int countBubbles = (int) (volume * 10000);
        SparklingWater sparklingWater = new SparklingWater();
        sparklingWater.pump(new Bubbles[countBubbles]);
        this.sparklingWater = sparklingWater;
        this.volume = volume;
    }

    public void open() throws InterruptedException {
        sparklingWater.statusIsOpened = true;
        if (sparklingWater.hasBubbles == true) {
            sparklingWater.isOpened(sparklingWater.bubbles);
        } else System.out.println("bottle has not bubbles yet");
    }

}
