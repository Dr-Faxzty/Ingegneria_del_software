public class Loops {
    public static void main(String[] args) {
        /** Ciclo for */
        System.out.println("Ciclo for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Iterazione: " + i);
        }

        /** Ciclo for con step personalizzato */
        System.out.println("For con step di 2:");
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }

        /** For-each per iterare sugli array */
        System.out.println("For-each su un array:");
        int[] numeri = {1, 2, 3, 4, 5};
        for (int num : numeri) {
            System.out.println(num);
        }

        /** Ciclo while */
        System.out.println("Ciclo while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j: " + j);
            j++;
        }

        /** Ciclo do-while */
        System.out.println("Ciclo do-while:");
        int k = 0;
        do {
            System.out.println("k: " + k);
            k++;
        } while (k < 5);

        /** Uso di break per interrompere un ciclo */
        System.out.println("Uso di break:");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Interruzione del ciclo a i = " + i);
                break;
            }
            System.out.println("i: " + i);
        }

        /** Uso di continue per saltare un'iterazione */
        System.out.println("Uso di continue:");
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue; // Salta i numeri pari
            }
            System.out.println("i: " + i);
        }

        /** Loop annidati */
        System.out.println("Loop annidati:");
        for (int i = 1; i <= 3; i++) {
            for (int l = 1; l <= 3; l++) {
                System.out.println("i: " + i + ", l: " + l);
            }
        }
    }
}
