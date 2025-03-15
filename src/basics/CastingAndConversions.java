public class CastingAndConversions {
    public static void main(String[] args) {
        /** Conversioni tra tipi primitivi */
        int numeroIntero = 10;
        double numeroDouble = numeroIntero; /** Conversione implicita (widening) */
        System.out.println("Conversione implicita: " + numeroDouble);
        
        double valore = 9.99;
        int valoreIntero = (int) valore; /** Conversione esplicita (narrowing) */
        System.out.println("Conversione esplicita: " + valoreIntero);
        
        /** Conversione tra tipi wrapper */
        Integer interoWrapper = Integer.valueOf(numeroIntero);
        Double doubleWrapper = Double.valueOf(numeroDouble);
        System.out.println("Integer Wrapper: " + interoWrapper);
        System.out.println("Double Wrapper: " + doubleWrapper);
        
        /** Conversione da String a numero */
        String numeroStringa = "123";
        int numeroConvertito = Integer.parseInt(numeroStringa);
        double numeroDoubleConvertito = Double.parseDouble("45.67");
        System.out.println("Numero convertito da stringa: " + numeroConvertito);
        System.out.println("Double convertito da stringa: " + numeroDoubleConvertito);
        
        /** Conversione da numero a stringa */
        String daIntAStringa = String.valueOf(numeroIntero);
        String daDoubleAStringa = Double.toString(numeroDouble);
        System.out.println("Da int a stringa: " + daIntAStringa);
        System.out.println("Da double a stringa: " + daDoubleAStringa);
        
        /** Conversione char a int */
        char carattere = 'A';
        int codiceAscii = (int) carattere;
        System.out.println("Codice ASCII di 'A': " + codiceAscii);
        
        /** Conversione int a char */
        char carattereDaInt = (char) 66;
        System.out.println("Carattere con codice ASCII 66: " + carattereDaInt);
        
        /** Autoboxing e Unboxing */
        Integer autoboxing = numeroIntero; /** Autoboxing */
        int unboxing = autoboxing; /** Unboxing */
        System.out.println("Autoboxing: " + autoboxing);
        System.out.println("Unboxing: " + unboxing);
        
        /** Conversione da boolean a stringa */
        boolean stato = true;
        String booleanString = Boolean.toString(stato);
        System.out.println("Boolean convertito in stringa: " + booleanString);
        
        /** Conversione da stringa a boolean */
        boolean stringToBoolean = Boolean.parseBoolean("true");
        System.out.println("Stringa convertita in boolean: " + stringToBoolean);
        
        /** Conversione da float a int con arrotondamento */
        float valoreFloat = 7.8f;
        int arrotondato = Math.round(valoreFloat);
        System.out.println("Float arrotondato: " + arrotondato);
    }
}
