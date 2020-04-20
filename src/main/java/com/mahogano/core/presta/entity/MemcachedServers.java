package com.mahogano.core.presta.entity;


public class MemcachedServers {

    private Integer idMemcachedServer;

    private String ip;

    private Integer port;

    private Integer weight;

    public Integer getIdMemcachedServer() {
        return idMemcachedServer;
    }

    public void setIdMemcachedServer(Integer idMemcachedServer) {
        this.idMemcachedServer = idMemcachedServer;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

}

