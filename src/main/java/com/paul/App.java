package com.paul;

import com.paul.database.ParcelStore;
import com.paul.services.ParcelControler;
import com.paul.services.ParcelService;

/**
 * Smart Locker Parcel Info storage!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        System.out.println("Starting Server...");

        Config config = new Config();

        new ParcelControler(new ParcelService(new ParcelStore()));

        System.out.println("Open : " + config.getHost() + ":" + config.getPort());
        System.out.println("Server started Successfully");
    }


}
