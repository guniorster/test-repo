package org.example;

public class Thredsy extends Thread {
    public static void main(String[] args) {
        Thredsy thredsy = new Thredsy();
        thredsy.start();
        System.out.println("This code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");
    }
}
