package main.java.project.vessels;

import main.java.project.stuff.Bubbles;
import main.java.project.material.Material;
import main.java.project.stuff.Transformable;
import main.java.project.stuff.SparklingWater;

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
        System.out.println(sparklingWater.getBubbles().size() + " ArraylistSize");
    }

    //Constructor with defalt values
    public Bottle(double volume, double diameter, int weight, Material material, boolean withSparklingWater) {
        super(volume, diameter, weight, material);
        if (withSparklingWater == true) {
            List<Bubbles> list = new ArrayList();
            this.sparklingWater = new SparklingWater();
        }
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

    public void fillWaterOrGas() {

        if (this.sparklingWater.getBubbles().size() == (int) (this.getVolume() * 10000)) {
            System.out.println("This bottle is full");
        }

        if (sparklingWater.getBubbles().size() > 0) {

            int size = (int) (this.getVolume() * 10000);
            List<Bubbles> list = new ArrayList<>();
            this.sparklingWater.pump(list, size);
            System.out.println("This bottle has been fill bubbles as new");

        } else {

            int size = (int) (super.getVolume() * 10000);
            List<Bubbles> list = new ArrayList<>();
            this.sparklingWater = new SparklingWater();
            this.sparklingWater.pump(list, size);
            System.out.println("This bottle has just been fulled by sparkling water");
        }
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
