/** Classe che dimostra l'uso di variabili e metodi statici */
class Contatore {
    /** Variabile statica condivisa tra tutte le istanze */
    private static int conteggio = 0;
    
    /** Variabile di istanza */
    private String nome;
    
    /** Costruttore che incrementa il conteggio ogni volta che viene creata una nuova istanza */
    public Contatore(String nome) {
        this.nome = nome;
        conteggio++;
    }
    
    /** Metodo statico per ottenere il valore del conteggio */
    public static int getConteggio() {
        return conteggio;
    }
    
    /** Metodo di istanza per ottenere il nome dell'oggetto */
    public String getNome() {
        return nome;
    }
    
    /** Metodo statico di utilità */
    public static void mostraMessaggio() {
        System.out.println("Metodo statico chiamato senza creare un'istanza.");
    }
}

/** Classe con blocco statico */
class Configurazione {
    /** Variabile statica */
    public static final String VERSIONE;
    
    /** Blocco statico per inizializzare le variabili statiche */
    static {
        VERSIONE = "1.0.0";
        System.out.println("Blocco statico eseguito. Versione inizializzata.");
    }
    
    /** Metodo statico */
    public static void mostraVersione() {
        System.out.println("Versione del software: " + VERSIONE);
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        /** Chiamata di un metodo statico senza creare un'istanza */
        Contatore.mostraMessaggio();
        
        /** Creazione di oggetti Contatore */
        Contatore obj1 = new Contatore("Oggetto1");
        Contatore obj2 = new Contatore("Oggetto2");
        Contatore obj3 = new Contatore("Oggetto3");
        
        /** Visualizzazione del conteggio statico */
        System.out.println("Numero di istanze create: " + Contatore.getConteggio());
        
        /** Chiamata al metodo statico della classe Configurazione */
        Configurazione.mostraVersione();
    }
}
