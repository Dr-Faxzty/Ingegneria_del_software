/** Classe che dimostra l'uso di throw e throws */
public class ThrowAndThrowsExample {
    
    /** Metodo che lancia un'eccezione con throw (unchecked) */
    public static void validaNumero(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("Numero negativo non consentito!");
        }
        System.out.println("Numero valido: " + numero);
    }
    
    /** Metodo che usa throws per propagare un'eccezione checked */
    public static void leggiFile(String nomeFile) throws Exception {
        if (nomeFile == null || nomeFile.isEmpty()) {
            throw new Exception("Nome file non valido!");
        }
        System.out.println("Lettura del file: " + nomeFile);
    }
    
    /** Metodo che usa throws per dichiarare una possibile eccezione */
    public static void dividi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisione per zero non consentita!");
        }
        System.out.println("Risultato: " + (a / b));
    }
    
    public static void main(String[] args) {
        /** Esempio con throw (unchecked) */
        try {
            validaNumero(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        /** Esempio con throws (checked) */
        try {
            leggiFile("");
        } catch (Exception e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        /** Esempio con throws (unchecked - ArithmeticException) */
        try {
            dividi(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Errore: " + e.getMessage());
        }
        
        /** Esecuzione con parametri validi */
        try {
            validaNumero(10);
            leggiFile("documento.txt");
            dividi(10, 2);
        } catch (Exception e) {
            System.out.println("Errore inaspettato: " + e.getMessage());
        }
    }
}
