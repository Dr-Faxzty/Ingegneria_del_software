public class TryCatchExample {
    public static void main(String[] args) {
        /** Gestione di un'eccezione con try-catch */
        try {
            int result = 10 / 0; // Genera ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Errore: divisione per zero!");
        }
        
        /** Try-catch con più istruzioni */
        try {
            int[] numeri = {1, 2, 3};
            System.out.println(numeri[5]); // Genera ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice fuori dai limiti!");
        }
        
        /** Try-catch con gestione generica */
        try {
            String str = null;
            System.out.println(str.length()); // Genera NullPointerException
        } catch (Exception e) {
            System.out.println("Eccezione generica catturata: " + e.getMessage());
        }
    }
}
