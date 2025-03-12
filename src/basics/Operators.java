public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;
        double x = 10.5, y = 3.2;

        /** Operatori Aritmetici */
        System.out.println("Somma: " + (a + b));
        System.out.println("Differenza: " + (a - b));
        System.out.println("Moltiplicazione: " + (a * b));
        System.out.println("Divisione: " + (a / b));
        System.out.println("Modulo: " + (a % b));

        /** Operatori Aritmetici con double */
        System.out.println("Somma Double: " + (x + y));
        System.out.println("Divisione Double: " + (x / y));

        /** Operatori Relazionali */
        System.out.println("a è maggiore di b? " + (a > b));
        System.out.println("a è minore o uguale a b? " + (a <= b));
        System.out.println("a è uguale a b? " + (a == b));
        System.out.println("a è diverso da b? " + (a != b));

        /** Operatori Logici */
        boolean condizione1 = (a > 0);
        boolean condizione2 = (b < 10);
        System.out.println("AND: " + (condizione1 && condizione2));
        System.out.println("OR: " + (condizione1 || condizione2));
        System.out.println("NOT condizione1: " + (!condizione1));

        /** Operatori di Assegnazione */
        int c = 10;
        c += 5;  // Equivalente a c = c + 5;
        System.out.println("Assegnazione con += : " + c);
        c *= 2;  // Equivalente a c = c * 2;
        System.out.println("Assegnazione con *= : " + c);

        /** Operatori di Incremento e Decremento */
        int d = 3;
        System.out.println("Post-Incremento: " + (d++)); // Usa d, poi incrementa
        System.out.println("Dopo il Post-Incremento: " + d);
        System.out.println("Pre-Incremento: " + (++d)); // Incrementa e poi usa
        
        /** Operatore ternario */
        int numero = -10;
        String risultato = (numero >= 0) ? "Positivo" : "Negativo";
        System.out.println("Il numero è " + risultato);
        
        /** Operatori Bitwise (a livello di bit) */
        int e = 5;  // 0101 in binario
        int f = 3;  // 0011 in binario
        System.out.println("e & f (AND bitwise): " + (e & f)); // 0001 (1)
        System.out.println("e | f (OR bitwise): " + (e | f));  // 0111 (7)
        System.out.println("e ^ f (XOR bitwise): " + (e ^ f)); // 0110 (6)
        System.out.println("~e (NOT bitwise): " + (~e));      // Dipende dalla rappresentazione
        
        /** Differenza tra && e & */
        int x1 = 5, y1 = 10;
        System.out.println("(x1 > 0) && (y1 > 5): " + ((x1 > 0) && (y1 > 5)));  // true → valutazione logica
        System.out.println("x1 & y1 (bitwise AND): " + (x1 & y1));  // 0 → valutazione bitwise (0101 & 1010 = 0000)
    }
}
