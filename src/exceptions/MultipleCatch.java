public class MultipleCatch {
    public static void main(String[] args) {
        /** Try-catch con più tipi di eccezioni */
        try {
            int[] numeri = {1, 2, 3};
            int risultato = 10 / 0; // Genera ArithmeticException
            System.out.println(numeri[5]); // Genera ArrayIndexOutOfBoundsException
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Errore: Indice fuori dai limiti dell'array!");
        } catch (Exception e) {
            System.out.println("Errore generico catturato: " + e.getMessage());
        }
        
        /** Try-catch multiplo con una singola catch usando | */
        try {
            String str = null;
            System.out.println(str.length()); // Genera NullPointerException
        } catch (NullPointerException | IllegalArgumentException e) {
            System.out.println("Errore: Eccezione gestita con catch multiplo!");
        }
        
    }
}
