package com.minhle.tools.creational.builder;

public class AndroidBuilder extends Builder {
    @Override
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
        System.out.println("set cpu for android: " + this.cpu);
    }
    @Override
    public void setRam(Integer ram) {
        this.ram = ram;
        System.out.println("set ram for android: " + this.ram);
    }
    @Override
    public void setDisk(Integer disk) {
        this.disk = disk;
        System.out.println("set disk for android: " + this.disk);
    }
}
