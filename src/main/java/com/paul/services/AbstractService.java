package com.paul.services;

import com.paul.models.Parcel;

import java.util.List;

    public interface AbstractService<E> {
        Object add(E e);

//    void delete(E e);

//    List<E> getAll();

        Parcel getParcel(Integer id);

        List<E> getAllLoc(String location);

        List<E> getAllRet(String retailer);

        void updateParcelLocation(Integer id, String location, Integer lockerBox);

    }


