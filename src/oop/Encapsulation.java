class Studente {
    /** Variabili di istanza private per incapsulamento */
    private String nome;
    private int eta;
    private String corso;
    
    /** Costruttore */
    public Studente(String nome, int eta, String corso) {
        this.nome = nome;
        this.eta = eta;
        this.corso = corso;
    }
    
    /** Metodo getter per ottenere il nome */
    public String getNome() {
        return nome;
    }
    
    /** Metodo setter per impostare il nome */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    /** Metodo getter per ottenere l'età */
    public int getEta() {
        return eta;
    }
    
    /** Metodo setter per impostare l'età */
    public void setEta(int eta) {
        if (eta > 0) {
            this.eta = eta;
        } else {
            System.out.println("L'età deve essere positiva.");
        }
    }
    
    /** Metodo getter per ottenere il corso */
    public String getCorso() {
        return corso;
    }
    
    /** Metodo setter per impostare il corso */
    public void setCorso(String corso) {
        this.corso = corso;
    }
    
    /** Metodo per stampare le informazioni */
    public void stampaInfo() {
        System.out.println("Nome: " + nome + ", Età: " + eta + ", Corso: " + corso);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        /** Creazione di un oggetto Studente */
        Studente studente = new Studente("Alice", 22, "Informatica");
        studente.stampaInfo();
        
        /** Modifica delle proprietà con i metodi setter */
        studente.setNome("Luca");
        studente.setEta(25);
        studente.setCorso("Ingegneria del Software");
        
        /** Stampa delle informazioni aggiornate */
        studente.stampaInfo();
    }
}
