package exercise2;

public class SMain {
    public static void main(String[] args) {
      Solido primo = new Solido(5,5,5);
      Solido secondo = primo;
      Solido terzo = new Solido(4,4,4);

    System.out.println(primo.dettagli());
    System.out.println(secondo.dettagli());
    System.out.println(terzo.dettagli());

    System.out.println(primo.equals(secondo.altezza,secondo.larghezza,secondo.profondita));
    System.out.println(terzo.equals(secondo.altezza,secondo.larghezza,secondo.profondita));
    
    }
}


