package main.java.project.material;

public class Glass extends Material {

    public Glass(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    //Constructor with defalt values
    public Glass() {
        super(10, "Green", 101);
    }



}
