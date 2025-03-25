/** Classe per definire un'eccezione personalizzata */
class EtaNonValidaException extends Exception {
    public EtaNonValidaException(String messaggio) {
        super(messaggio);
    }
}

/** Classe per definire un'altra eccezione personalizzata */
class SaldoInsufficienteException extends RuntimeException {
    public SaldoInsufficienteException(String messaggio) {
        super(messaggio);
    }
}

public class CustomException {
    /** Metodo che verifica se l'età è valida */
    public static void verificaEta(int eta) throws EtaNonValidaException {
        if (eta < 18) {
            throw new EtaNonValidaException("Età inferiore a 18 non consentita!");
        }
        System.out.println("Età valida.");
    }
    
    /** Metodo che verifica se un prelievo è possibile */
    public static void preleva(double saldo, double importo) {
        if (importo > saldo) {
            throw new SaldoInsufficienteException("Fondi insufficienti per il prelievo!");
        }
        System.out.println("Prelievo di " + importo + " effettuato con successo.");
    }
    
    public static void main(String[] args) {
        /** Esempio di gestione di un'eccezione checked */
        try {
            verificaEta(16);
        } catch (EtaNonValidaException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        /** Esempio di eccezione unchecked */
        try {
            preleva(500, 600);
        } catch (SaldoInsufficienteException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        /** Esecuzione con parametri validi */
        try {
            verificaEta(20);
            preleva(1000, 200);
        } catch (Exception e) {
            System.out.println("Errore inaspettato: " + e.getMessage());
        }
    }
}