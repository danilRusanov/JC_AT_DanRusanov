package main.java.project.boxing;

public class VesselBox<T> {

    private T[] vesselBoxContainer;
    private int position = 0;

    public VesselBox(int size) {
        this.vesselBoxContainer = (T[]) new Object[size];
        System.out.println("VesselBox object has been created with length is " + vesselBoxContainer.length + " " + vesselBoxContainer.getClass().getTypeName());
    }

    public void add(T object) {

        if (position == vesselBoxContainer.length) {
            System.out.println("This is vesselBox has already fulled by " + vesselBoxContainer.getClass());
            return;
        }
        vesselBoxContainer[position++] = object;
    }

    public void add(T object, int size) {
        if (position == vesselBoxContainer.length) {
            System.out.println("This is vesselBox has already fulled by " + vesselBoxContainer.getClass());
            return;
        }
        while(position < vesselBoxContainer.length && size > 0) {
            vesselBoxContainer[position++] = object;
            size--;
        }

    }

    public void print() {
        if (this.vesselBoxContainer[0] == null) {
            System.out.println("This vesselbox is empty");
            return;
        }
        System.out.printf("I'm vesselbox with %s %s", position, getVesselBoxContainer()[0].getClass());
        for (T object: vesselBoxContainer) {
            System.out.println(" hashcode is " + object);
        }
    }

    public T[] getVesselBoxContainer() {
        return vesselBoxContainer;
    }

}
