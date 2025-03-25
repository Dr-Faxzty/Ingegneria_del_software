/** Definizione di un enum per i giorni della settimana */
enum Giorno {
    LUNEDI("Inizio settimana"),
    MARTEDI("Secondo giorno"),
    MERCOLEDI("Metà settimana"),
    GIOVEDI("Quasi fine settimana"),
    VENERDI("Ultimo giorno lavorativo"),
    SABATO("Weekend!"),
    DOMENICA("Relax");
    
    private final String descrizione;
    
    /** Costruttore dell'enum */
    Giorno(String descrizione) {
        this.descrizione = descrizione;
    }
    
    /** Metodo per ottenere la descrizione */
    public String getDescrizione() {
        return descrizione;
    }
}

/** Definizione di un enum con comportamento personalizzato */
enum StatoOrdine {
    NUOVO {
        @Override
        public String getMessaggio() {
            return "L'ordine è stato creato.";
        }
    },
    IN_PROCESSO {
        @Override
        public String getMessaggio() {
            return "L'ordine è in lavorazione.";
        }
    },
    SPEDITO {
        @Override
        public String getMessaggio() {
            return "L'ordine è stato spedito.";
        }
    },
    CONSEGNATO {
        @Override
        public String getMessaggio() {
            return "L'ordine è stato consegnato.";
        }
    };
    
    /** Metodo astratto da implementare per ogni stato */
    public abstract String getMessaggio();
}

public class EnumExample {
    public static void main(String[] args) {
        /** Uso dell'enum Giorno */
        Giorno oggi = Giorno.VENERDI;
        System.out.println("Oggi è " + oggi + ": " + oggi.getDescrizione());
        
        /** Iterazione sugli elementi dell'enum */
        System.out.println("Lista giorni della settimana:");
        for (Giorno g : Giorno.values()) {
            System.out.println(g + " - " + g.getDescrizione());
        }
        
        /** Uso dell'enum StatoOrdine */
        StatoOrdine stato = StatoOrdine.SPEDITO;
        System.out.println("Stato dell'ordine: " + stato.getMessaggio());
    }
}
