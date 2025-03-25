/** Classe che dimostra l'override dei metodi della classe Object */
class Persona {
    private String nome;
    private int eta;
    
    /** Costruttore */
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }
    
    /** Override del metodo toString */
    @Override
    public String toString() {
        return "Persona{nome='" + nome + "', eta=" + eta + "}";
    }
    
    /** Override del metodo equals */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Persona persona = (Persona) obj;
        return eta == persona.eta && nome.equals(persona.nome);
    }
    
    /** Override del metodo hashCode */
    @Override
    public int hashCode() {
        return nome.hashCode() * 31 + eta;
    }
    
    /** Metodo per clonare l'oggetto (deep copy) */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Persona(this.nome, this.eta);
    }
}

public class ObjectClassMethods {
    public static void main(String[] args) throws CloneNotSupportedException {
        /** Creazione di due oggetti Persona */
        Persona p1 = new Persona("Mario", 30);
        Persona p2 = new Persona("Mario", 30);
        Persona p3 = new Persona("Luigi", 25);
        
        /** Uso di toString */
        System.out.println("p1: " + p1.toString());
        System.out.println("p2: " + p2);
        
        /** Uso di equals */
        System.out.println("p1 è uguale a p2? " + p1.equals(p2));
        System.out.println("p1 è uguale a p3? " + p1.equals(p3));
        
        /** Uso di hashCode */
        System.out.println("HashCode di p1: " + p1.hashCode());
        System.out.println("HashCode di p2: " + p2.hashCode());
        System.out.println("HashCode di p3: " + p3.hashCode());
        
        /** Uso di clone */
        Persona p4 = (Persona) p1.clone();
        System.out.println("p4 (clonato da p1): " + p4);
        System.out.println("p1 è uguale a p4? " + p1.equals(p4));
    }
}
