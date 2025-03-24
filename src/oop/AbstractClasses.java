/** Classe astratta che rappresenta una forma geometrica */
abstract class Forma {
    protected String colore;
    
    /** Costruttore della classe astratta */
    public Forma(String colore) {
        this.colore = colore;
    }
    
    /** Metodo astratto che deve essere implementato nelle sottoclassi */
    public abstract double calcolaArea();
    
    /** Metodo concreto */
    public void mostraColore() {
        System.out.println("Colore della forma: " + colore);
    }
}

/** Classe concreta che estende Forma */
class Cerchio extends Forma {
    private double raggio;
    
    /** Costruttore per inizializzare il cerchio */
    public Cerchio(String colore, double raggio) {
        super(colore);
        this.raggio = raggio;
    }
    
    /** Implementazione del metodo astratto */
    @Override
    public double calcolaArea() {
        return Math.PI * raggio * raggio;
    }
}

/** Classe concreta che estende Forma */
class Rettangolo extends Forma {
    private double larghezza, altezza;
    
    /** Costruttore per inizializzare il rettangolo */
    public Rettangolo(String colore, double larghezza, double altezza) {
        super(colore);
        this.larghezza = larghezza;
        this.altezza = altezza;
    }
    
    /** Implementazione del metodo astratto */
    @Override
    public double calcolaArea() {
        return larghezza * altezza;
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        /** Creazione di oggetti delle classi concrete */
        Forma cerchio = new Cerchio("Rosso", 5.0);
        Forma rettangolo = new Rettangolo("Blu", 4.0, 6.0);
        
        /** Mostra il colore delle forme */
        cerchio.mostraColore();
        rettangolo.mostraColore();
        
        /** Calcola e stampa le aree */
        System.out.println("Area del cerchio: " + cerchio.calcolaArea());
        System.out.println("Area del rettangolo: " + rettangolo.calcolaArea());
    }
}