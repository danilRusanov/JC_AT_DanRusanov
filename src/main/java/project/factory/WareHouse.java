package main.java.project.factory;

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<VesselBox> vesselBoxList;

    public WareHouse() {
        this.vesselBoxList = new ArrayList<>();
    }

    public void add(VesselBox vesselBox) {
        vesselBoxList.add(vesselBox);
    }

    public List<VesselBox> getVesselBoxList() {
        return vesselBoxList;
    }
}
