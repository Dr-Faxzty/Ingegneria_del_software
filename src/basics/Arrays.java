import java.util.Arrays;
import java.util.ArrayList;

public class ArraysExample {
    public static void main(String[] args) {
        /** Dichiarazione e inizializzazione di un array */
        int[] numeri = {1, 2, 3, 4, 5};
        System.out.println("Array originale: " + Arrays.toString(numeri));

        /** Accesso agli elementi */
        System.out.println("Primo elemento: " + numeri[0]);
        System.out.println("Ultimo elemento: " + numeri[numeri.length - 1]);

        /** Modifica di un elemento */
        numeri[2] = 10;
        System.out.println("Array modificato: " + Arrays.toString(numeri));

        /** Iterazione con un ciclo for */
        System.out.println("Iterazione con for:");
        for (int i = 0; i < numeri.length; i++) {
            System.out.println("Elemento " + i + ": " + numeri[i]);
        }

        /** Iterazione con for-each */
        System.out.println("Iterazione con for-each:");
        for (int num : numeri) {
            System.out.println(num);
        }

        /** Ordinamento di un array */
        Arrays.sort(numeri);
        System.out.println("Array ordinato: " + Arrays.toString(numeri));

        /** Array multidimensionale */
        int[][] matrice = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Elemento matrice [1][2]: " + matrice[1][2]);

        /** Iterazione su un array bidimensionale */
        System.out.println("Iterazione sulla matrice:");
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }

        /** Copia di un array */
        int[] copiaNumeri = Arrays.copyOf(numeri, numeri.length);
        System.out.println("Copia dell'array: " + Arrays.toString(copiaNumeri));

        /** Riempire un array con un valore */
        Arrays.fill(numeri, 0);
        System.out.println("Array riempito con 0: " + Arrays.toString(numeri));

        /** Inizializzazione automatica a 0 */
        int[] autoZero = new int[5]; // {0, 0, 0, 0, 0} automaticamente
        System.out.println("Array inizializzato automaticamente a 0: " + Arrays.toString(autoZero));

        /** Inizializzazione esplicita come in C */
        int[] manualZero = {0, 0, 0, 0, 0};
        System.out.println("Array inizializzato esplicitamente a 0: " + Arrays.toString(manualZero));

        /** Array di oggetti */
        String[] nomi = new String[3];
        nomi[0] = "Alice";
        nomi[1] = "Bob";
        nomi[2] = "Charlie";
        System.out.println("Array di nomi: " + Arrays.toString(nomi));

        /** ArrayList (array di lunghezza variabile) */
        ArrayList<Integer> numeriDinamici = new ArrayList<>();
        numeriDinamici.add(10);
        numeriDinamici.add(20);
        numeriDinamici.add(30);
        System.out.println("ArrayList: " + numeriDinamici);

        /** Metodi della classe Arrays */
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        System.out.println("Array1 e Array2 sono uguali? " + Arrays.equals(array1, array2));

        int[] arrayOrdinato = {1, 3, 5, 7, 9};
        int indice = Arrays.binarySearch(arrayOrdinato, 5);
        System.out.println("Indice di 5 nell'array ordinato: " + indice);

        /** Jagged array (array multidimensionale irregolare) */
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println("Jagged array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println(Arrays.toString(jaggedArray[i]));
        }

        /** Copia di array con System.arraycopy() */
        int[] arrayOriginale = {1, 2, 3, 4, 5};
        int[] arrayCopia = new int[arrayOriginale.length];
        System.arraycopy(arrayOriginale, 0, arrayCopia, 0, arrayOriginale.length);
        System.out.println("Copia dell'array con System.arraycopy(): " + Arrays.toString(arrayCopia));

        /** Stream API (esempio di filtraggio) */
        int[] numeriStream = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] numeriPari = Arrays.stream(numeriStream)
                                .filter(n -> n % 2 == 0)
                                .toArray();
        System.out.println("Numeri pari con Stream API: " + Arrays.toString(numeriPari));
    }
}