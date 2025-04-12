/**
 * Esempio di State Pattern in Java.
 * Permette a un oggetto di cambiare comportamento in base al suo stato interno.
 */

// Interfaccia stato
interface Stato {
    void gestisci();
}

// Stati concreti
class StatoAcceso implements Stato {
    public void gestisci() {
        System.out.println("Il dispositivo è acceso.");
    }
}

class StatoSpento implements Stato {
    public void gestisci() {
        System.out.println("Il dispositivo è spento.");
    }
}

class StatoInPausa implements Stato {
    public void gestisci() {
        System.out.println("Il dispositivo è in pausa.");
    }
}

// Contesto
class Dispositivo {
    private Stato stato;

    public Dispositivo() {
        this.stato = new StatoSpento(); // stato iniziale
    }

    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public void azione() {
        stato.gestisci();
    }
}

// Utilizzo
public class StatePattern {
    public static void main(String[] args) {
        Dispositivo d = new Dispositivo();

        d.azione(); // Spento

        d.setStato(new StatoAcceso());
        d.azione(); // Acceso

        d.setStato(new StatoInPausa());
        d.azione(); // Pausa
    }
}
