public class SleepDemo {

    public static void main(String[] args) {
        System.out.println(" Starte Countdown...");// Start des 'Coundoun bis zum Aufwachen

        for (int i = 5; i >= 1; i--) {
            System.out.println(+ i + " Sekunden verbleiben...");// Ausgabe der verbleibenden Sekunden zum Aufwachehen

            try {
                Thread.sleep(1000); // Pause von 1000 ms = 1 Sekunde
            } catch (InterruptedException e) {
                System.out.println("❗ Der Schlaf wurde unterbrochen.");// Ausgabe das schlafen unterbrochen wurde
            }
        }

        System.out.println(" Start erfolgt!");// Rückmeldung das Threat wider läuft
    }
}
