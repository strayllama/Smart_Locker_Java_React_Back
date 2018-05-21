package com.paul.database;

public final class AppDatabase {
    private static AppDatabase ourInstance = new AppDatabase();

    public static AppDatabase getInstance() {
        return ourInstance;
    }

    private com.paul.database.ParcelStore parcelStore;

    private AppDatabase() {
        parcelStore = new ParcelStore();
    }

    public ParcelStore getParcelsStore() {
        return parcelStore;
    }

}