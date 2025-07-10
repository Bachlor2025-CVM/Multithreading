public class Wait {
    private static final Object sperre = new Object();

    public static void main(String[] args) {
        Thread wartenderThread = new Thread(() -> {
            synchronized (sperre) {// Snchroninsation mit sperre 
                System.out.println(" Thread 1 wartet...");// Ausgae dass der Thread ausführbar wäre
                try {
                    sperre.wait(); // Thread wartet, bis notify() ihn aufweckt
                } catch (InterruptedException e) {
                    System.out.println(" Thread wurde unterbrochen!");// Fehlerausgabe falls Thread unterbrochen
                }
                System.out.println(" Thread 1 wurde benachrichtigt und macht weiter!");
                // Ausgabe wenn Thread 1 von sperre banchrichtigit wurde und weiter ausführen darf
            }
        });

        Thread benachrichtigerThread = new Thread(() -> {
            try {
                Thread.sleep(2000); // kurze Pause vor der Benachrichtigung
            } catch (InterruptedException e) {
                e.printStackTrace();// Fehlkermeldung falls Sleeep nciht funktioniert 
            }

            synchronized (sperre) {
                System.out.println(" Thread 2 benachrichtigt...");// Ausgane wenn Threat 2 benachrichtigt wurde
                sperre.notify(); // Weckt Thread 1 auf
            }
        });

        wartenderThread.start();
        benachrichtigerThread.start();
    }
}
