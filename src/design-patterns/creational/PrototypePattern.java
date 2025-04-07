/**
 * Esempio di Prototype Pattern in Java
 * Permette la creazione di oggetti clonati (shallow e deep copy).
 */

// Interfaccia Prototype
interface Documento extends Cloneable {
    Documento clone();
}

// Implementazione semplice (shallow copy)
class Report implements Documento {
    private String titolo;
    private String contenuto;

    public Report(String titolo, String contenuto) {
        this.titolo = titolo;
        this.contenuto = contenuto;
    }

    public void stampa() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Contenuto: " + contenuto);
    }

    public Documento clone() {
        return new Report(titolo, contenuto); // shallow copy
    }
}

// Classe annidata per deep copy
class Allegato {
    private String nomeFile;

    public Allegato(String nomeFile) {
        this.nomeFile = nomeFile;
    }

    public String getNomeFile() {
        return nomeFile;
    }

    public Allegato clone() {
        return new Allegato(nomeFile);
    }
}

// Implementazione con deep copy
class ReportConAllegato implements Documento {
    private String titolo;
    private Allegato allegato;

    public ReportConAllegato(String titolo, Allegato allegato) {
        this.titolo = titolo;
        this.allegato = allegato;
    }

    public void stampa() {
        System.out.println("Titolo: " + titolo);
        System.out.println("Allegato: " + allegato.getNomeFile());
    }

    public Documento clone() {
        return new ReportConAllegato(titolo, allegato.clone()); // deep copy
    }
}

// Client
public class PrototypePattern {
    public static void main(String[] args) {
        // Shallow copy
        Report originale = new Report("Rapporto 2025", "Contenuto iniziale...");
        Report copia = (Report) originale.clone();

        System.out.println("--- Shallow Copy ---");
        copia.stampa();

        // Deep copy
        Allegato allegato = new Allegato("documento.pdf");
        ReportConAllegato originaleDeep = new ReportConAllegato("Rapporto 2025", allegato);
        ReportConAllegato copiaDeep = (ReportConAllegato) originaleDeep.clone();

        System.out.println("--- Deep Copy ---");
        originaleDeep.stampa();
        System.out.println("---");
        copiaDeep.stampa();
    }
}