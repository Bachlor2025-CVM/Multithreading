package com.multithreading.examples;

class My extends Thread {
    // Override the run method to define thread behavior
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + Thread.currentThread().getName() + " is running: " + i);
            
        }
    }
}

public class Thread_Beispiel {
    public static void main(String[] args) {
        My thread1 = new My(); // Create thread instance
        My thread2 = new My(); // Create another thread instance
        
        thread1.start(); // Start the first thread
        thread2.start(); // Start the second thread
    }
}
