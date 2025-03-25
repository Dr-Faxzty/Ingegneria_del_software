public class FinallyBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Provo a eseguire il codice...");
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Eccezione catturata.");
        } finally {
            System.out.println("Blocco finally eseguito sempre.");
        }
    }
}