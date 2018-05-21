package com.paul;

import com.paul.models.Parcel;
import spark.Spark;

/**
 * Smart Locker Parcel Info storage!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println("Starting Server...");

        Config config = new Config();

        Spark.get("parcel/:id", (request, response) -> {
            Integer id = request.params("id");
            parcelService.getP
        })

        Spark.get("/parcelsLoc/:loc", (request, response) -> {
            String location = request.params("loc");
            Parcel
        });

        System.out.println("Open : " + config.getHost() + ":" + config.getPort());
        System.out.println("Server started Successfully");
    }


}
