package main.java.project.material;

public class Plastic extends Material {
    public Plastic(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    //Constructor with defalt values
    public Plastic() {
        super(0.5, "white", 12);
    }

}
