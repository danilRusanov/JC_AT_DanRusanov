package main.java.project.run;

import main.java.project.boxing.Bottle;
import main.java.project.boxing.Cup;
import main.java.project.boxing.Vessel;
import main.java.project.boxing.VesselBox;
import main.java.project.factory_buildings.WareHouse;
import main.java.project.material.Material;
import main.java.project.material.Plastic;
import main.java.project.water.SparklingWater;

import java.lang.reflect.Array;

public class Runner {
    private static Object Cup;

    public static void main(String[] args) throws InterruptedException {
        Bottle bottle = new Bottle(1);
        bottle.warm(5);
        bottle.isHasWarmed();
        bottle.open();
        bottle.warm(25);
        Thread.sleep(3000);
        bottle.close();
        bottle.open();
        VesselBox<Cup> cupVesselBox = new VesselBox<>( 9);
        cupVesselBox.add(new Cup());
        cupVesselBox.add(new Cup(), 10);
        cupVesselBox.print();
        VesselBox<Bottle> bottleVesselBox = new VesselBox<>(25);
        bottleVesselBox.print();

        WareHouse wareHouse = new WareHouse();
        wareHouse.add(cupVesselBox);
        wareHouse.add(bottleVesselBox);


        VesselBox<Bottle> vesselBox = new VesselBox<>(25);
        vesselBox.add(new Bottle(1, 2,3, new Plastic(), false   ), 25);


        vesselBox.getVesselBoxContainer()[0];
        bottle2.fillWaterOrGas();
        bottle2.fillWaterOrGas();
        bottle2.open();
        Thread.sleep(3000);
        bottle2.close();
        bottle2.fillWaterOrGas();








    }
}
