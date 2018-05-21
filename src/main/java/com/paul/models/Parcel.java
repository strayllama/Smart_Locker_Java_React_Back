package com.paul.models;

public class Parcel {
    private Integer id;
    private String customer;
    private String retailer;
    private String location;
    private Integer lockerBox;
    private String dropOffCode;
    private String pickUpCode;
    private String returnCode;


    public Parcel(Integer id, String customer, String retailer, String location, Integer lockerBox, String dropOffCode, String pickUpCode, String returnCode){
        this.id = id;
        this.customer = customer;
        this.retailer = retailer;
        this.location = location;
        this.lockerBox = lockerBox;
        this.dropOffCode = dropOffCode;
        this.pickUpCode = pickUpCode;
        this.returnCode = returnCode;
    }

    public Integer getId() {
        return id;
    }

    public String getCustomer() {
        return customer;
    }

    public String getRetailer() {
        return retailer;
    }

    public String getLocation() {
        return location;
    }

    public Integer getLockerBox() {
        return lockerBox;
    }

    public String getDropOffCode() {
        return dropOffCode;
    }

    public String getPickUpCode() {
        return pickUpCode;
    }

    public String getReturnCode() {
        return returnCode;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLockerBox(Integer lockerBox) {
        this.lockerBox = lockerBox;
    }
}
