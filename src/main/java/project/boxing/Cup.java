package main.java.project.boxing;

import main.java.project.material.Material;
import main.java.project.material.Transformable;

public class Cup extends Vessel implements Containable {

    public Cup(double volume, double diameter, int weight, Material material) {
        super(volume, diameter, weight, material);
    }

    //Constructor with defalt values
    public Cup() {
        super(1, 2, 3, new Material(1,"Red",10){});
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
