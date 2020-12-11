
package com.pouyaheydari.learning.sematecandroidbasicmehr99.pojo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Vehicle {

    @SerializedName("vehicles")
    @Expose
    private List<Vehicle_> vehicles = null;

    public List<Vehicle_> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle_> vehicles) {
        this.vehicles = vehicles;
    }

}
