/**
 * Esempio di Singleton Pattern in Java
 * Garantisce che una classe abbia una sola istanza e fornisce un punto di accesso globale.
 */

class Configurazione {
    /** Istanza privata e statica */
    private static Configurazione istanza;

    /** Attributo di esempio */
    private String ambiente;

    /** Costruttore privato per impedire istanziazione esterna */
    private Configurazione() {
        this.ambiente = "Produzione";
    }

    /** Metodo pubblico e statico per ottenere l'unica istanza */
    public static Configurazione getInstance() {
        if (istanza == null) {
            istanza = new Configurazione();
        }
        return istanza;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }
}

public class SingletonPattern {
    public static void main(String[] args) {
        Configurazione c1 = Configurazione.getInstance();
        Configurazione c2 = Configurazione.getInstance();

        System.out.println("Ambiente (c1): " + c1.getAmbiente());

        c2.setAmbiente("Test");
        System.out.println("Ambiente (c2): " + c2.getAmbiente());
        System.out.println("Ambiente (c1): " + c1.getAmbiente());

        System.out.println("Stessa istanza? " + (c1 == c2));
    }
}