package exercise2;

public class Cubo extends Solido {
    int volume;

    public Cubo(int altezza, int larghezza, int profondita){
      super(altezza,larghezza,profondita);
      this.volume=0;
    }
    public int getVolume(){
      return altezza*larghezza*profondita;
    }
}
