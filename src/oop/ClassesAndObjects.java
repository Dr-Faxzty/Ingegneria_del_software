class Studente {
    /** Variabili di istanza */
    String nome;
    int eta;
    String corso;
    
    /** Costruttore senza parametri */
    public Studente() {
        this.nome = "Sconosciuto";
        this.eta = 0;
        this.corso = "Non assegnato";
    }
    
    /** Costruttore con parametri */
    public Studente(String nome, int eta, String corso) {
        this.nome = nome;
        this.eta = eta;
        this.corso = corso;
    }
    
    /** Metodo per stampare le informazioni */
    void stampaInfo() {
        System.out.println("Nome: " + nome + ", Età: " + eta + ", Corso: " + corso);
    }
    
    /** Metodo per cambiare corso */
    void cambiaCorso(String nuovoCorso) {
        this.corso = nuovoCorso;
        System.out.println(nome + " ha cambiato corso in " + nuovoCorso);
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        /** Creazione di un oggetto con costruttore senza parametri */
        Studente studente1 = new Studente();
        studente1.stampaInfo();
        
        /** Creazione di un oggetto con costruttore parametrizzato */
        Studente studente2 = new Studente("Marco", 20, "Informatica");
        studente2.stampaInfo();
        
        /** Modifica del corso di studio */
        studente2.cambiaCorso("Ingegneria del Software");
        studente2.stampaInfo();
    }
}
