/** Classe che dimostra l'uso di final con variabili, metodi e classi */
class Costanti {
    /** Variabili finali di istanza */
    private final String nome;
    private final int eta;
    
    /** Variabile statica finale (costante di classe) */
    public static final double PI = 3.14159;
    
    /** Costruttore per inizializzare le variabili finali */
    public Costanti(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    /** Getter per le variabili finali */
    public String getNome() {
        return nome;
    }
    
    public int getEta() {
        return eta;
    }
}

/** Classe con un metodo finale */
class ClasseBase {
    /** Metodo finale che non può essere sovrascritto */
    public final void metodoFinale() {
        System.out.println("Questo metodo finale non può essere sovrascritto.");
    }
    
    /** Metodo normale */
    public void metodoNormale() {
        System.out.println("Metodo normale che può essere sovrascritto.");
    }
}

/** Classe derivata che cerca di sovrascrivere un metodo finale (causerà errore) */
class ClasseDerivata extends ClasseBase {
    @Override
    public void metodoNormale() {
        System.out.println("Metodo normale sovrascritto.");
    }
    
    // ❌ ERRORE: Un metodo finale non può essere sovrascritto
    // @Override
    // public void metodoFinale() {}
}

/** Classe finale che non può essere estesa */
final class ClasseFinale {
    public void mostraMessaggio() {
        System.out.println("Questa è una classe finale e non può avere sottoclassi.");
    }
}

public class FinalKeyword {
    public static void main(String[] args) {
        /** Creazione di un oggetto con variabili finali */
        Costanti c = new Costanti("Mario", 25);
        System.out.println("Nome: " + c.getNome() + ", Età: " + c.getEta());
        
        /** Accesso a una costante statica finale */
        System.out.println("Valore di PI: " + Costanti.PI);
        
        /** Uso di metodi finali */
        ClasseBase base = new ClasseBase();
        base.metodoFinale();
        
        /** Uso di una classe finale */
        ClasseFinale finale = new ClasseFinale();
        finale.mostraMessaggio();
    }
}
