package main.java.project.run;

import main.java.project.boxing.Bottle;

public class Runner {
    public static void main(String[] args) throws InterruptedException {
        Bottle bottle = new Bottle(1);
        bottle.warm(5);
        bottle.isHasWarmed();
        bottle.open();
    }
}
