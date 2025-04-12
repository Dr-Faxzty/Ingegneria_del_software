/**
 * Esempio di Template Method Pattern in Java.
 * Definisce lo scheletro di un algoritmo in una superclasse, delegando alle sottoclassi alcuni passaggi.
 */

// Classe astratta con metodo template
abstract class OrdineOnline {
    public final void processaOrdine() {
        selezionaArticolo();
        effettuaPagamento();
        consegna();
    }

    protected abstract void selezionaArticolo();
    protected abstract void effettuaPagamento();
    protected void consegna() {
        System.out.println("L'articolo sarà consegnato all'indirizzo fornito.");
    }
}

// Sottoclasse per un ordine Amazon
class OrdineAmazon extends OrdineOnline {
    @Override
    protected void selezionaArticolo() {
        System.out.println("Articolo selezionato da Amazon.it");
    }

    @Override
    protected void effettuaPagamento() {
        System.out.println("Pagamento con carta di credito su Amazon");
    }
}

// Sottoclasse per un ordine eBay
class OrdineEbay extends OrdineOnline {
    @Override
    protected void selezionaArticolo() {
        System.out.println("Articolo selezionato da eBay.it");
    }

    @Override
    protected void effettuaPagamento() {
        System.out.println("Pagamento tramite PayPal su eBay");
    }
}

// Classe principale
public class TemplatePattern {
    public static void main(String[] args) {
        OrdineOnline ordine1 = new OrdineAmazon();
        OrdineOnline ordine2 = new OrdineEbay();

        System.out.println("\n--- Processo ordine Amazon ---");
        ordine1.processaOrdine();

        System.out.println("\n--- Processo ordine eBay ---");
        ordine2.processaOrdine();
    }
}
