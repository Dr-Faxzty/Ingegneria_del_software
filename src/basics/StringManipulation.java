public class StringManipulation {
    public static void main(String[] args) {
        String testo = "  Java è fantastico!  ";
        
        /** Lunghezza della stringa */
        System.out.println("Lunghezza: " + testo.length());
        
        /** Conversione in maiuscolo e minuscolo */
        System.out.println("Maiuscolo: " + testo.toUpperCase());
        System.out.println("Minuscolo: " + testo.toLowerCase());
        
        /** Eliminazione degli spazi iniziali e finali */
        System.out.println("Trim: '" + testo.trim() + "'");
        
        /** Sottostringa */
        System.out.println("Sottostringa (0-4): " + testo.substring(0, 4));
        
        /** Sostituzione di caratteri e parole */
        System.out.println("Sostituzione: " + testo.replace("fantastico", "potente"));
        
        /** Controllo se contiene una parola */
        System.out.println("Contiene 'Java'? " + testo.contains("Java"));
        
        /** Controllo se inizia o finisce con una parola specifica */
        System.out.println("Inizia con 'Java'? " + testo.trim().startsWith("Java"));
        System.out.println("Finisce con 'fantastico!'? " + testo.trim().endsWith("fantastico!"));
        
        /** Confronto di stringhe */
        String s1 = "ciao";
        String s2 = "Ciao";
        System.out.println("Uguali? " + s1.equals(s2));
        System.out.println("Uguali ignorando maiuscole? " + s1.equalsIgnoreCase(s2));
        
        /** Concatena stringhe */
        String nome = "Mario";
        System.out.println("Concatenazione: " + "Ciao, ".concat(nome));
        
        /** Suddivisione di una stringa in array */
        String frase = "Java,Python,C++,JavaScript";
        String[] linguaggi = frase.split(",");
        System.out.println("Suddivisione della stringa:");
        for (String linguaggio : linguaggi) {
            System.out.println(linguaggio);
        }
        
        /** Conversione da numero a stringa e viceversa */
        int numero = 100;
        String numeroStringa = String.valueOf(numero);
        int numeroConvertito = Integer.parseInt(numeroStringa);
        System.out.println("Numero convertito: " + numeroConvertito);
        
        /** Rimozione di caratteri specifici */
        String sporco = "***Java***";
        System.out.println("Rimozione caratteri: " + sporco.replace("*", ""));
        
        /** Costruzione efficiente di stringhe con StringBuilder */
        StringBuilder sb = new StringBuilder("Ciao");
        sb.append(" a tutti!");
        sb.insert(5, "Java ");
        sb.replace(0, 4, "Salve");
        sb.delete(6, 11);
        System.out.println("StringBuilder modificato: " + sb.toString());
    }
}
