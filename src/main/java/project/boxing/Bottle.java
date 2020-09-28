package main.java.project.boxing;

import main.java.project.additive.Bubbles;
import main.java.project.material.Material;
import main.java.project.material.Transformable;
import main.java.project.water.SparklingWater;

import java.util.ArrayList;
import java.util.List;

public class Bottle extends Vessel implements Containable {
    private SparklingWater sparklingWater;


    public Bottle(double volume) {

        //в котором бутылка заполняется массивом из пузырьков из рассчета 10000 на каждый литр
        super(volume);
        int size = (int) (volume * 10000);
        List<Bubbles> list = new ArrayList();
        this.sparklingWater = new SparklingWater();
        this.sparklingWater.pump(list, size);
        System.out.println(sparklingWater.getBubbles().size() + "ArraylistSize");
    }

    //Constructor with defalt values
    public Bottle() {
        super(1);
        this.sparklingWater = sparklingWater;
    }

    public Bottle(double volume, double diameter, int weight, Material material, SparklingWater sparklingWater) {
        super(volume, diameter, weight, material);
        this.sparklingWater = sparklingWater;
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

    @Override
    public void addStuff() {

    }

    @Override
    public Transformable removeStuff() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getFreeSpace() {
        return 0;
    }

    @Override
    public void close() {
        this.sparklingWater.setOpened(false);
    }
}
