package com.paul.services;

import com.paul.models.Parcel;
import com.paul.database.ParcelStore;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class ParcelService implements AbstractService<Parcel> {
    private static final Logger logger = Logger.getLogger(ParcelStore.class.getSimpleName());

    private final ParcelStore parcelStore;

    public ParcelService(ParcelStore parcelStore) {
        this.parcelStore = parcelStore;
        logger.setLevel(Level.ALL);
    }

    @Override
    public Object add(Parcel parcel) {
        if (parcel != null &&
                parcel.getId() != null &&
                parcel.getCustomer() !=null &&
                parcel.getRetailer() !=null &&
                parcel.getLocation() !=null &&
                parcel.getDropOffCode() !=null &&
                parcel.getPickUpCode() !=null &&
                parcel.getReturnCode() !=null) {
        return parcel;
        } else {
            logger.info("Some fields were null");
            return null;
        }

    }

    @Override
    public Parcel getParcel(Integer id) {
        return parcelStore.getParcel(id);
    }

    @Override
    public List<Parcel> getAllLoc(String location) {
        return parcelStore.getParcelsAtLoc(location);
    }

    @Override
    public List<Parcel> getAllRet(String retailer) {
        return parcelStore.getParcelsOfRetailer(retailer);
    }

    @Override
    public Parcel updateParcelLocation(Integer id, String location, Integer lockerBox) {
        return parcelStore.updateParcelLocation(id, location, lockerBox);
    }

}