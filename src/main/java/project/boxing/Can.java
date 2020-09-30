package main.java.project.boxing;

import main.java.project.material.Material;
import main.java.project.material.Transformable;

public class Can extends Vessel implements Containable {

    public Can(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    //Constructor with defalt values
    public Can() {
        super(15, 20, 30, new Material(71,"Red",1000){});
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
    public void open() {

    }

    @Override
    public void close() {

    }
}
