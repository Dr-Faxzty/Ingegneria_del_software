public class ControlFlow {
    public static void main(String[] args) {
        int numero = 10;

        /** Struttura if-else */
        if (numero > 0) {
            System.out.println("Numero positivo");
        } else if (numero < 0) {
            System.out.println("Numero negativo");
        } else {
            System.out.println("Numero zero");
        }

        /** Esempio con più condizioni */
        int eta = 20;
        if (eta < 18) {
            System.out.println("Minorenne");
        } else if (eta >= 18 && eta < 65) {
            System.out.println("Adulto");
        } else {
            System.out.println("Anziano");
        }

        /** Switch-case base */
        int giorno = 3;
        switch (giorno) {
            case 1:
                System.out.println("Lunedì");
                break;
            case 2:
                System.out.println("Martedì");
                break;
            case 3:
                System.out.println("Mercoledì");
                break;
            case 4:
                System.out.println("Giovedì");
                break;
            case 5:
                System.out.println("Venerdì");
                break;
            case 6:
                System.out.println("Sabato");
                break;
            case 7:
                System.out.println("Domenica");
                break;
            default:
                System.out.println("Giorno non valido");
        }

        /** Switch con stringhe */
        String colore = "rosso";
        switch (colore) {
            case "rosso":
                System.out.println("Il colore è rosso");
                break;
            case "blu":
                System.out.println("Il colore è blu");
                break;
            default:
                System.out.println("Colore sconosciuto");
        }

        /** Uso di switch con lambda (Java 14+) */
        int voto = 8;
        String risultato = switch (voto) {
            case 10, 9 -> "Ottimo";
            case 8, 7 -> "Buono";
            case 6 -> "Sufficiente";
            default -> "Insufficiente";
        };
        System.out.println("Valutazione: " + risultato);
    }
}
