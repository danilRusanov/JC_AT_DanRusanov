package main.java.project.material;

public class Metal extends Material {

    public Metal(double thermalConductivity, String color, double density) {
        super(thermalConductivity, color, density);
    }

    //Constructor with defalt values
    public Metal() {
        super(1000, "Grey", 199);
    }

}
