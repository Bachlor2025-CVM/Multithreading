package com.multithreading.examples;

public class Runable {

    public static void main(String[] args) {
        // Erstes Runnable: zählt von 1 bis 5 
        Runnable aufgabe1 = () -> {//
            for (int i = 1; i <= 5; i++) {
                System.out.println(" Thread 1 Schritt " + i);// Ausgabe des aktuellen Schritts
               
            }
        };

        // Zweites Runnable: zählt von A bis E mit kurzer Pause
        Runnable aufgabe2 = () -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Thread 2 Buchstabe " + c);// Ausgabe des aktuellen Buchstabens
                
            }
        };

        // Threads erzeugen und starten
        Thread thread1 = new Thread(aufgabe1);// Erzeugung des ersten Threads mit der Aufgabe 1
        Thread thread2 = new Thread(aufgabe2);// Erzeugung des zweiten Threads mit der Aufgabe 2

        thread1.start();// Start des ersten Threads
        thread2.start();// Start des zweiten Threads

        System.out.println(" Beide Threads wurden gestartet!");// Ausgabe, dass beide Threads gestartet wurden
    }
}
