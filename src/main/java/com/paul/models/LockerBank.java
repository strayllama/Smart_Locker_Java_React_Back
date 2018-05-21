package com.paul.models;

import org.eclipse.jetty.util.thread.Locker;

public class LockerBank {
    private String name;

    public LockerBank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
