package com.minhle.tools.creational.builder;

public class Main extends Thread {
    public void run() {
        PhoneDirector director = new PhoneDirector();
        director.buildPhone(new AndroidBuilder());
    }

    public static void main(String[] args) {
        new Main().start();
    }
}
