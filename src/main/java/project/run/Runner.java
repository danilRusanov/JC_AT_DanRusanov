package main.java.project.run;

import main.java.project.vessels.Bottle;
import main.java.project.vessels.Cup;
import main.java.project.factory.VesselBox;
import main.java.project.factory.WareHouse;
import main.java.project.material.Plastic;

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
//        VesselBox<Cup> cupVesselBox = new   <>( 9);
//        cupVesselBox.add(new Cup());
//        cupVesselBox.add(new Cup(), 10);
//        cupVesselBox.print();
        VesselBox<Bottle> bottleVesselBox = new VesselBox<>(25);
        bottleVesselBox.print();

        WareHouse wareHouse = new WareHouse();
//        wareHouse.add(cupVesselBox);
        wareHouse.add(bottleVesselBox);


        VesselBox<Bottle> vesselBox = new VesselBox<>(25);
        vesselBox.add(new Bottle(1, 2,3, new Plastic(), false   ), 25);


//        vesselBox.getVesselBoxContainer()[0];
//        bottle2.fillWaterOrGas();
//        bottle2.fillWaterOrGas();
//        bottle2.open();
//        Thread.sleep(3000);
//        bottle2.close();
//        bottle2.fillWaterOrGas();








    }
}
