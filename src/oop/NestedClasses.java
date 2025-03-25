/** Classe esterna che dimostra l'uso delle classi annidate */
class Esterna {
    private String messaggio = "Ciao dal mondo esterno!";
    
    /** Classe interna non statica */
    class Interna {
        public void stampaMessaggio() {
            System.out.println("Messaggio dalla classe interna: " + messaggio);
        }
    }
    
    /** Classe interna statica */
    static class InternaStatica {
        public void stampaMessaggio() {
            System.out.println("Messaggio dalla classe interna statica.");
        }
    }
    
    /** Metodo per creare una classe locale */
    public void metodoConClasseLocale() {
        class ClasseLocale {
            public void mostra() {
                System.out.println("Messaggio dalla classe locale dentro un metodo.");
            }
        }
        
        ClasseLocale locale = new ClasseLocale();
        locale.mostra();
    }
    
    /** Metodo con classe anonima */
    public void usaClasseAnonima() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Messaggio dalla classe anonima che implementa Runnable.");
            }
        };
        new Thread(runnable).start();
    }
}

public class NestedClasses {
    public static void main(String[] args) {
        /** Uso della classe interna non statica */
        Esterna esterna = new Esterna();
        Esterna.Interna interna = esterna.new Interna();
        interna.stampaMessaggio();
        
        /** Uso della classe interna statica */
        Esterna.InternaStatica internaStatica = new Esterna.InternaStatica();
        internaStatica.stampaMessaggio();
        
        /** Uso di una classe locale dentro un metodo */
        esterna.metodoConClasseLocale();
        
        /** Uso di una classe anonima */
        esterna.usaClasseAnonima();
    }
}