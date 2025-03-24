package com.minhle.tools.creational.builder;

public class IPhoneBuilder extends Builder {
    @Override
    public void setCpu(Integer cpuCore) {
        this.cpu = cpuCore;
        System.out.println("set cpu for iphone: " + this.cpu);
    }

    @Override
    public void setRam(Integer ram) {
        this.ram = ram;
        System.out.println("set ram for iphone: " + this.ram);
    }

    @Override
    public void setDisk(Integer disk) {
        this.disk = disk;
        System.out.println("set disk for iphone: " + this.disk);
    }
}
