import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /** Lettura di una stringa */
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.nextLine();
        System.out.println("Ciao, " + nome + "!");
        
        /** Lettura di un numero intero */
        System.out.print("Inserisci un numero intero: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Errore: Inserisci un numero valido!");
            scanner.next();
        }
        int numero = scanner.nextInt();
        System.out.println("Hai inserito il numero: " + numero);
        
        /** Lettura di un numero decimale */
        System.out.print("Inserisci un numero decimale: ");
        while (!scanner.hasNextDouble()) {
            System.out.println("Errore: Inserisci un numero decimale valido!");
            scanner.next();
        }
        double decimale = scanner.nextDouble();
        System.out.println("Hai inserito il numero decimale: " + decimale);
        
        /** Pulizia del buffer dopo nextInt() o nextDouble() */
        scanner.nextLine();
        
        /** Lettura di un carattere */
        System.out.print("Inserisci un carattere: ");
        String inputChar = scanner.nextLine();
        while (inputChar.length() != 1) {
            System.out.println("Errore: Inserisci un solo carattere!");
            inputChar = scanner.nextLine();
        }
        char carattere = inputChar.charAt(0);
        System.out.println("Hai inserito il carattere: " + carattere);
        
        /** Lettura di un valore booleano */
        System.out.print("Inserisci true o false: ");
        while (!scanner.hasNextBoolean()) {
            System.out.println("Errore: Inserisci true o false!");
            scanner.next();
        }
        boolean valoreBooleano = scanner.nextBoolean();
        System.out.println("Hai inserito: " + valoreBooleano);
        
        /** Chiusura dello scanner */
        scanner.close();
    }
}
