package com.minhle.tools.creational.builder;

public abstract class Builder {
    protected Integer cpu;
    protected Integer ram;
    protected Integer disk;

    abstract void setCpu(Integer cpu);
    abstract void setRam(Integer ram);
    abstract void setDisk(Integer disk);
}
