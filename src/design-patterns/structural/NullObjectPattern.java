/**
 * Esempio di Null Object Pattern in Java con oggetti di tipo Indirizzo.
 * Invece di usare null, si utilizza una sottoclasse che rappresenta un "null object" sicuro.
 */

class Indirizzo {
    private String via;
    private String citta;

    public Indirizzo(String via, String citta) {
        this.via = via;
        this.citta = citta;
    }

    public void stampaIndirizzo() {
        System.out.println("Via: " + via + ", Città: " + citta);
    }
}

/** Classe Null che rappresenta un indirizzo non disponibile */
class NullIndirizzo extends Indirizzo {
    public NullIndirizzo() {
        super("", "");
    }

    @Override
    public void stampaIndirizzo() {
        System.out.println("Indirizzo non disponibile");
    }
}

/** Classe Cliente che utilizza Null Object per gestire assenza di indirizzo */
class Cliente {
    private String nome;
    private Indirizzo indirizzo;

    public Cliente(String nome, Indirizzo indirizzo) {
        this.nome = nome;
        this.indirizzo = (indirizzo == null) ? new NullIndirizzo() : indirizzo;
    }

    public Indirizzo getIndirizzo() {
        return indirizzo;
    }
}

public class NullObjectPattern {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Mario Rossi", null); // Indirizzo mancante
        Cliente cliente2 = new Cliente("Lucia Bianchi", new Indirizzo("Via Roma 10", "Milano"));

        cliente1.getIndirizzo().stampaIndirizzo();
        cliente2.getIndirizzo().stampaIndirizzo();
    }
}
