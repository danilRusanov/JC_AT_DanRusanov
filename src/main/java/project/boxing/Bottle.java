package main.java.project.boxing;

import main.java.project.additive.Bubbles;
import main.java.project.water.SparklingWater;

public class Bottle {
    private double volume;
    private SparklingWater sparklingWater;


    public Bottle(double volume) {
        //в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
        this.volume = volume;
        Bubbles[] bubbles = new Bubbles[(int) (volume * 10000)];
        this.sparklingWater = new SparklingWater();
        this.sparklingWater.pump(bubbles);

    }


    public void open() {
        //который меняет состояние воды в "открытое" (приблизительно, как this.water.setOpened(true);)
        System.out.print("меняет состояние воды в \"открытое\"");
        this.sparklingWater.setOpened(true);
    }

    public void warm(int temperature) {
        //который устанавливает температуру воды в бутылке
        System.out.println(String.format("устанавливает температуру воды в бутылке равную %s ", temperature));
        this.sparklingWater.setTemperature(temperature);
    }

    public void isHasWarmed() {
        this.sparklingWater.setHasWarmed(true);
    }


    public SparklingWater getSparklingWater() {
        return sparklingWater;
    }

    public void setSparklingWater(SparklingWater sparklingWater) {
        this.sparklingWater = sparklingWater;
    }

}
