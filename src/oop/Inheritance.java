/** Classe base (superclasse) */
class Animale {
    private String nome; // Accessibile solo all'interno della classe
    protected int eta; // Accessibile nelle sottoclassi
    public String tipo; // Accessibile ovunque
    
    /** Costruttore della superclasse */
    public Animale(String nome, int eta, String tipo) {
        this.nome = nome;
        this.eta = eta;
        this.tipo = tipo;
    }
    
    /** Metodo per fare un verso (da sovrascrivere) */
    public void faiVerso() {
        System.out.println("L'animale emette un suono generico.");
    }
    
    /** Metodo per ottenere il nome (getter per il campo privato) */
    public String getNome() {
        return nome;
    }
    
    /** Metodo per stampare le informazioni */
    public void stampaInfo() {
        System.out.println("Tipo: " + tipo + ", Nome: " + nome + ", Età: " + eta);
    }
}

/** Classe derivata (sottoclasse) */
class Cane extends Animale {
    private String razza;
    
    /** Costruttore della sottoclasse */
    public Cane(String nome, int eta, String razza) {
        super(nome, eta, "Cane"); // Richiama il costruttore della superclasse
        this.razza = razza;
    }
    
    /** Override del metodo faiVerso */
    @Override
    public void faiVerso() {
        System.out.println("Bau Bau!");
    }
    
    /** Metodo aggiuntivo */
    public void mostraRazza() {
        System.out.println("Razza: " + razza);
    }
    
    /** Metodo per accedere alla variabile protected */
    public void incrementaEta() {
        this.eta += 1;
        System.out.println(getNome() + " ora ha " + this.eta + " anni.");
    }
}

/** Classe derivata ulteriore */
class Gatto extends Animale {
    protected String colore;
    
    /** Costruttore della sottoclasse */
    public Gatto(String nome, int eta, String colore) {
        super(nome, eta, "Gatto");
        this.colore = colore;
    }
    
    /** Override del metodo faiVerso */
    @Override
    public void faiVerso() {
        System.out.println("Miao Miao!");
    }
    
    /** Metodo aggiuntivo */
    public void mostraColore() {
        System.out.println("Colore: " + colore);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        /** Creazione di un oggetto Cane */
        Cane cane = new Cane("Fido", 3, "Labrador");
        cane.stampaInfo();
        cane.faiVerso();
        cane.mostraRazza();
        cane.incrementaEta();
        
        /** Creazione di un oggetto Gatto */
        Gatto gatto = new Gatto("Whiskers", 2, "Nero");
        gatto.stampaInfo();
        gatto.faiVerso();
        gatto.mostraColore();
    }
}
