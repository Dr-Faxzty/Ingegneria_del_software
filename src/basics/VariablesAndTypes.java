public class VariablesAndTypes {
    public static void main(String[] args) {
        /** Dichiarazione e assegnazione di variabili di tipo primitivo */
        int numero = 10;
        double prezzo = 19.99;
        boolean attivo = true;
        char iniziale = 'J';
        float decimale = 5.75f;
        long grandeNumero = 10000000000L;
        short piccoloNumero = 32000;
        byte byteValue = 127;

        /** Stampa delle variabili primitive */
        System.out.println("Numero: " + numero);
        System.out.println("Prezzo: " + prezzo);
        System.out.println("Attivo: " + attivo);
        System.out.println("Iniziale: " + iniziale);
        System.out.println("Decimale: " + decimale);
        System.out.println("Grande Numero: " + grandeNumero);
        System.out.println("Piccolo Numero: " + piccoloNumero);
        System.out.println("Byte Value: " + byteValue);
        
        /** Dichiarazione e utilizzo di tipi riferimento */
        String messaggio = "Ciao, Java!";
        Integer numeroOggetto = 42;
        Double prezzoOggetto = 29.99;
        Boolean statoOggetto = Boolean.TRUE;
        
        System.out.println("Messaggio: " + messaggio);
        System.out.println("Numero Oggetto: " + numeroOggetto);
        System.out.println("Prezzo Oggetto: " + prezzoOggetto);
        System.out.println("Stato Oggetto: " + statoOggetto);
        
        /** Conversioni di tipo */
        int numeroConvertito = (int) prezzo; // Conversione esplicita (cast)
        double numeroImplicito = numero; // Conversione implicita
        String numeroStringa = Integer.toString(numero);

        System.out.println("Numero Convertito: " + numeroConvertito);
        System.out.println("Numero Implicito: " + numeroImplicito);
        System.out.println("Numero come Stringa: " + numeroStringa);
        
        /** Costanti con "final" */
        final double PI = 3.14159;
        System.out.println("Valore di PI: " + PI);
    }
}
