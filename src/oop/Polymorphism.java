/** Classe base (superclasse) */
class Veicolo {
    /** Metodo che verrà sovrascritto */
    public void muovi() {
        System.out.println("Il veicolo si sta muovendo.");
    }
}

/** Classe derivata che sovrascrive il metodo */
class Auto extends Veicolo {
    @Override
    public void muovi() {
        System.out.println("L'auto sta viaggiando su strada.");
    }
}

/** Classe derivata che sovrascrive il metodo */
class Barca extends Veicolo {
    @Override
    public void muovi() {
        System.out.println("La barca sta navigando sull'acqua.");
    }
}

/** Classe derivata che sovrascrive il metodo */
class Aereo extends Veicolo {
    @Override
    public void muovi() {
        System.out.println("L'aereo sta volando nel cielo.");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        /** Uso del polimorfismo */
        Veicolo veicolo1 = new Auto();
        Veicolo veicolo2 = new Barca();
        Veicolo veicolo3 = new Aereo();
        
        veicolo1.muovi();
        veicolo2.muovi();
        veicolo3.muovi();
        
        /** Polimorfismo con metodi sovraccaricati */
        Calcolatrice calc = new Calcolatrice();
        System.out.println("Somma interi: " + calc.somma(5, 10));
        System.out.println("Somma double: " + calc.somma(5.5, 2.3));
        System.out.println("Somma tre numeri: " + calc.somma(2, 3, 4));
    }
}

/** Classe che dimostra il polimorfismo con overloading */
class Calcolatrice {
    /** Metodo sovraccaricato per sommare due interi */
    public int somma(int a, int b) {
        return a + b;
    }
    
    /** Metodo sovraccaricato per sommare due double */
    public double somma(double a, double b) {
        return a + b;
    }
    
    /** Metodo sovraccaricato per sommare tre numeri */
    public int somma(int a, int b, int c) {
        return a + b + c;
    }
}
