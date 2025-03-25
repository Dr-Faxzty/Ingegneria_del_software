/** Interfaccia che definisce un comportamento di movimento */
interface Movibile {
    void muovi();
}

/** Interfaccia aggiuntiva per oggetti che possono essere riparati */
interface Riparabile {
    void ripara();
}

/** Classe che implementa l'interfaccia Movibile */
class Auto implements Movibile, Riparabile {
    @Override
    public void muovi() {
        System.out.println("L'auto sta viaggiando su strada.");
    }
    
    @Override
    public void ripara() {
        System.out.println("L'auto è stata riparata.");
    }
}

/** Classe che implementa solo l'interfaccia Movibile */
class Barca implements Movibile {
    @Override
    public void muovi() {
        System.out.println("La barca sta navigando sull'acqua.");
    }
}

/** Classe che implementa solo l'interfaccia Riparabile */
class Computer implements Riparabile {
    @Override
    public void ripara() {
        System.out.println("Il computer è stato riparato.");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        /** Uso del polimorfismo con le interfacce */
        Movibile veicolo1 = new Auto();
        Movibile veicolo2 = new Barca();
        Riparabile oggetto1 = new Auto();
        Riparabile oggetto2 = new Computer();
        
        veicolo1.muovi();
        veicolo2.muovi();
        
        oggetto1.ripara();
        oggetto2.ripara();
    }
}
