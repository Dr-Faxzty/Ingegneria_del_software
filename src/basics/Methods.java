public class Methods {
    public static void main(String[] args) {
        Methods obj = new Methods(); // Creazione di un'istanza della classe
        
        /** Chiamata di metodi non statici */
        int risultato = obj.somma(5, 10);
        System.out.println("Somma: " + risultato);

        obj.stampaMessaggio("Ciao, Java!");

        int maxValore = obj.max(8, 12);
        System.out.println("Valore massimo: " + maxValore);

        System.out.println("Fattoriale di 5: " + obj.fattoriale(5));
        System.out.println("Numero pari? " + obj.isPari(10));
        
        /** Chiamata di metodi statici */
        System.out.println("Differenza: " + differenza(15, 5));
        System.out.println("Numero dispari? " + isDispari(7));
    }

    /** Metodo non statico con parametri e valore di ritorno */
    public int somma(int a, int b) {
        return a + b;
    }

    /** Metodo statico con parametri e valore di ritorno */
    public static int differenza(int a, int b) {
        return a - b;
    }

    /** Metodo void non statico senza valore di ritorno */
    public void stampaMessaggio(String messaggio) {
        System.out.println("Messaggio: " + messaggio);
    }

    /** Metodo non statico che restituisce il massimo tra due numeri */
    public int max(int a, int b) {
        return (a > b) ? a : b;
    }

    /** Metodo ricorsivo non statico per calcolare il fattoriale */
    public int fattoriale(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fattoriale(n - 1);
    }

    /** Metodo booleano non statico che verifica se un numero è pari */
    public boolean isPari(int numero) {
        return numero % 2 == 0;
    }
    
    /** Metodo booleano statico che verifica se un numero è dispari */
    public static boolean isDispari(int numero) {
        return numero % 2 != 0;
    }
}
