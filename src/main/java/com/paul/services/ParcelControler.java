package com.paul.services;

import com.paul.models.Parcel;
import com.paul.services.ParcelService;

import spark.Spark;

public class ParcelControler {
    public ParcelControler(final ParcelService parcelService) {

        Spark.get("parcel/:id", (request, response) -> {
            Integer id = Integer.parseInt(request.params("id"));
            return parcelService.getParcel(id);
        });

        Spark.get("/parcelsLoc/:loc", (request, response) -> {
            String location = request.params("loc");
            return parcelService.getAllLoc(location);
        });

    }
}