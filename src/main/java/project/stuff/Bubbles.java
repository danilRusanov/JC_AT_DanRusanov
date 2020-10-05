package main.java.project.stuff;

public class Bubbles {
    private static final double bubbleVolume = 0.3;
    private String gazComposition = "undefined";


    public Bubbles (String gazComposition) {
        this.gazComposition = gazComposition;
    }

    public static double getBubbleVolume() {
        return bubbleVolume;
    }

    public void cramp() {
        //который в консоль выводит слово "Cramp!"
        System.out.println("Cramp");
    }

}