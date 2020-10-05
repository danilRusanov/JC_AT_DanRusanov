package main.java.project.vessels;

import main.java.project.stuff.Transformable;

public interface Containable {
    void addStuff();
    //(Transformable stuff) - adds some stuff (e.g. water, sand) to Containable object
    Transformable removeStuff();
    //removes all stuff away
    boolean isEmpty();
    //returns true if there is no stuff inside
    int getFreeSpace();
    //returns an integer value of free millilitres
    void open();
    //forces Containable to be opened
    void close();
    //forces Containable to be closed
}
