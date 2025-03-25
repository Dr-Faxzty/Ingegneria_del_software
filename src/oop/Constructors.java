/** Classe che dimostra l'uso dei costruttori in Java */
class Persona {
    private String nome;
    private int eta;
    private String città;
    
    /** Costruttore senza parametri (valori di default) */
    public Persona() {
        this.nome = "Sconosciuto";
        this.eta = 0;
        this.città = "Non specificata";
        System.out.println("Costruttore di default chiamato.");
    }
    
    /** Costruttore con parametri */
    public Persona(String nome, int eta, String città) {
        this.nome = nome;
        this.eta = eta;
        this.città = città;
        System.out.println("Costruttore parametrizzato chiamato.");
    }
    
    /** Costruttore che usa un altro costruttore con this() */
    public Persona(String nome) {
        this(nome, 18, "Non specificata");
        System.out.println("Costruttore con un solo parametro chiamato.");
    }
    
    /** Metodo per stampare i dettagli */
    public void stampaDettagli() {
        System.out.println("Nome: " + nome + ", Età: " + eta + ", Città: " + città);
    }
}

/** Classe che dimostra i costruttori nelle classi derivate */
class Studente extends Persona {
    private String corso;
    
    /** Costruttore della sottoclasse */
    public Studente(String nome, int eta, String città, String corso) {
        super(nome, eta, città); // Chiamata al costruttore della superclasse
        this.corso = corso;
        System.out.println("Costruttore della classe Studente chiamato.");
    }
    
    /** Metodo per stampare i dettagli dello studente */
    public void stampaDettagliStudente() {
        stampaDettagli(); // Chiamata al metodo della superclasse
        System.out.println("Corso: " + corso);
    }
}

public class Constructors {
    public static void main(String[] args) {
        /** Uso del costruttore di default */
        Persona p1 = new Persona();
        p1.stampaDettagli();
        
        /** Uso del costruttore parametrizzato */
        Persona p2 = new Persona("Luca", 25, "Roma");
        p2.stampaDettagli();
        
        /** Uso del costruttore con un solo parametro */
        Persona p3 = new Persona("Anna");
        p3.stampaDettagli();
        
        /** Uso del costruttore nella classe derivata */
        Studente s1 = new Studente("Marco", 22, "Milano", "Informatica");
        s1.stampaDettagliStudente();
    }
}