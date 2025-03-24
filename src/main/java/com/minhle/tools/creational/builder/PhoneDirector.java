package com.minhle.tools.creational.builder;

public class PhoneDirector {
    public void buildPhone(Builder builder) {
        builder.setCpu(8);
        builder.setRam(128);
        builder.setDisk(256);
    }
}
