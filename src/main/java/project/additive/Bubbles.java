package main.java.project.additive;

public class Bubbles {
    public static final double bubbleVolume = 0.3;
    String gazComposition = "undefined";

    public Bubbles(String gazComposition) {
        this.gazComposition = gazComposition;
    }

    public void boom() {
        System.out.println("Cramp!");
    }

}