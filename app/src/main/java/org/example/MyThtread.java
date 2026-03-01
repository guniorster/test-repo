package org.example;

public class MyThtread extends Thread {

    public MyThtread(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println("Wykonywany wątek: " + Thread.currentThread().getName());
    }
}
