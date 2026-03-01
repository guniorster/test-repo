package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Główny wątek aplikaci: " + Thread.currentThread().getName());
        Thread thread = new MyThtread("My-thread-name");
        thread.start();
        Runnable runnable = () -> {
            System.out.println("Główny wątek aplikaci: " + Thread.currentThread().getName());
for (int i = 0; i < 10; i++) {
    try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    }
    System.out.println(i);
}
        };
        Thread anotherThred = new Thread(
                runnable, "My runable - 1"
        );
        Thread anotherThred1 = anotherThred;
        anotherThred1.start();
    }
}
