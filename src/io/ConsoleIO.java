/**
 * Classe che dimostra la gestione dell'input e dell'output da console in Java.
 */
import java.util.Scanner;

public class ConsoleIO {
    
    /** Metodo per leggere l'input da console usando Scanner */
    public static void leggiConScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.println("Ciao, " + nome + "!");
        
        System.out.print("Inserisci la tua età: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Errore: Inserisci un numero valido.");
            scanner.next(); // Scarta l'input errato
        }
        int eta = scanner.nextInt();
        System.out.println("Hai " + eta + " anni.");
        
        scanner.close();
    }
    
    /** Metodo per stampare output su console */
    public static void stampaOutput() {
        System.out.println("Esempio di stampa su console.");
        System.out.printf("Questo è un numero formattato: %.2f\n", 123.456);
    }
    
    /** Metodo per leggere input da console usando System.console() */
    public static void leggiConConsole() {
        java.io.Console console = System.console();
        if (console != null) {
            String utente = console.readLine("Inserisci il tuo username: ");
            char[] password = console.readPassword("Inserisci la tua password: ");
            System.out.println("Ciao, " + utente + "! (La password non verrà mostrata)");
        } else {
            System.out.println("Console non disponibile.");
        }
    }
    
    public static void main(String[] args) {
        /** Esegue i metodi di esempio */
        stampaOutput();
        leggiConScanner();
        leggiConConsole();
    }
}
