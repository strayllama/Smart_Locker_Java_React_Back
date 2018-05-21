package com.paul.database;
import com.paul.models.Parcel;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ParcelStore {
    private List<Parcel> parcels;
    public Parcel parcel1;
    public Parcel parcel2;
    public Parcel parcel3;

    ParcelStore() {
        parcel1 = new Parcel(
                1001,"Bob", "Maplins",
                "Liberton", 1,
                "9991","8881",
                "7771");
        parcel2 = new Parcel(
                1002,"Steve", "Maplins",
                "Liberton", 2,
                "9992","8882",
                "7772");
        parcel3 = new Parcel(
                1003,"Joe", "Maplins",
                "Liberton", 3,
                "9993","8883",
                "7773");

        parcels = new LinkedList<>();
        parcels.add(parcel1);
        parcels.add(parcel2);
        parcels.add(parcel3);
    }


    public Parcel getParcel(Integer id) {
        return this.parcels.stream()
                .filter(parcel ->
                        parcel.getId().equals(id)
                )
                .findFirst()
                .orElse(null);
    }

    public List<Parcel> getParcelsAtLoc(String location) {
        return Collections.unmodifiableList(
                this.parcels.stream()
                    .filter(parcel -> parcel.getLocation().equals(location))
                    .collect(Collectors.toList())
        );
    }

    public List<Parcel> getParcelsOfRetailer(String retailer) {
        return Collections.unmodifiableList(
                this.parcels.stream()
                        .filter(parcel -> parcel.getRetailer().equals(retailer))
                        .collect(Collectors.toList())
        );
    }

    public void updateParcelLocation(Integer id, String location, Integer lockerBox) {
        Parcel oldParcel = this.getParcel(id);
        if (this.parcels.contains(oldParcel)) {
            this.parcels.remove(oldParcel);
            Parcel updatedParcel = oldParcel;
            updatedParcel.setLocation(location);
            updatedParcel.setLockerBox(lockerBox);
            this.parcels.add(updatedParcel);
        }

    }


}
