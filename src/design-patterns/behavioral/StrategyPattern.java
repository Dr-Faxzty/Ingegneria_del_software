/**
 * Esempio di Strategy Pattern in Java.
 * Mostra come implementare una calcolatrice che può cambiare dinamicamente strategia di calcolo.
 */

// Interfaccia strategia
interface Operazione {
    double esegui(double a, double b);
}

// Strategie concrete
class Somma implements Operazione {
    public double esegui(double a, double b) {
        return a + b;
    }
}

class Sottrazione implements Operazione {
    public double esegui(double a, double b) {
        return a - b;
    }
}

class Moltiplicazione implements Operazione {
    public double esegui(double a, double b) {
        return a * b;
    }
}

class Divisione implements Operazione {
    public double esegui(double a, double b) {
        if (b == 0) throw new ArithmeticException("Divisione per zero");
        return a / b;
    }
}

// Context
class Calcolatrice {
    private Operazione strategia;

    public void setStrategia(Operazione strategia) {
        this.strategia = strategia;
    }

    public double calcola(double a, double b) {
        if (strategia == null) throw new IllegalStateException("Strategia non impostata");
        return strategia.esegui(a, b);
    }
}

// Utilizzo
public class StrategyPattern {
    public static void main(String[] args) {
        Calcolatrice calc = new Calcolatrice();

        calc.setStrategia(new Somma());
        System.out.println("5 + 3 = " + calc.calcola(5, 3));

        calc.setStrategia(new Sottrazione());
        System.out.println("5 - 3 = " + calc.calcola(5, 3));

        calc.setStrategia(new Moltiplicazione());
        System.out.println("5 * 3 = " + calc.calcola(5, 3));

        calc.setStrategia(new Divisione());
        System.out.println("5 / 3 = " + calc.calcola(5, 3));
    }
}