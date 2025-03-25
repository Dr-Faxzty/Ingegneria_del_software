public class ConstantsAndFinal {
    /** Definizione di una costante con final */
    public static final double PI = 3.14159;
    public static final int MAX_STUDENTI = 30;
    public static final String UNIVERSITA = "Politecnico di Milano";
    
    /** Variabile finale di istanza */
    private final String nomeClasse;
    private final int codiceCorso;
    
    /** Inizializzazione tramite costruttore */
    public ConstantsAndFinal(String nomeClasse, int codiceCorso) {
        this.nomeClasse = nomeClasse;
        this.codiceCorso = codiceCorso;
    }
    
    public void stampaDettagli() {
        System.out.println("Nome della classe: " + nomeClasse);
        System.out.println("Codice del corso: " + codiceCorso);
        System.out.println("Università: " + UNIVERSITA);
        System.out.println("Valore di PI: " + PI);
        System.out.println("Numero massimo di studenti: " + MAX_STUDENTI);
    }
    
    public static void main(String[] args) {
        /** Creazione di un'istanza con valore finale assegnato */
        ConstantsAndFinal esempio = new ConstantsAndFinal("Matematica", 101);
        esempio.stampaDettagli();
        
        /** Uso di final con array */
        final int[] numeri = {1, 2, 3, 4, 5};
        System.out.println("Array originale: ");
        for (int num : numeri) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        /** È possibile modificare gli elementi di un array final */
        numeri[0] = 10;
        System.out.println("Array modificato: ");
        for (int num : numeri) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        /** Uso di una classe finale */
        ClasseFinale classeFinale = new ClasseFinale();
        classeFinale.mostraMessaggio();
        
        /** Uso di un metodo finale */
        ClasseDerivata classeDerivata = new ClasseDerivata();
        classeDerivata.metodoNormale();
        classeDerivata.metodoFinale();
    }
}

/** Una classe finale non può essere estesa */
final class ClasseFinale {
    public void mostraMessaggio() {
        System.out.println("Questo è un metodo di una classe finale.");
    }
}

/** Una classe con un metodo finale */
class ClasseBase {
    public final void metodoFinale() {
        System.out.println("Questo è un metodo finale e non può essere sovrascritto.");
    }
    
    public void metodoNormale() {
        System.out.println("Questo è un metodo normale e può essere sovrascritto.");
    }
}

class ClasseDerivata extends ClasseBase {
    // public void metodoFinale() {} // ❌ ERRORE: un metodo finale non può essere sovrascritto
    @Override
    public void metodoNormale() {
        System.out.println("Metodo normale sovrascritto nella classe derivata.");
    }
}
