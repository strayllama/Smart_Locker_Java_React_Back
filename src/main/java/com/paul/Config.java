package com.paul;

import spark.Spark;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Config {
    private final int HTTP_PORT = 9090;

    public Config() {
        Spark.port(HTTP_PORT);
    }

    public int getPort() {
        return this.HTTP_PORT;
    }

    public String getHost() {
        try {
            return Inet4Address.getLocalHost().getHostAddress();
        } catch (UnknownHostException e) {
            return "http://localhost";
        }
    }

}
