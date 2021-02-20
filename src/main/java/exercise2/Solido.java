package exercise2;


public class Solido {
    int altezza,larghezza,profondita;

    public Solido(int altezza, int larghezza, int profondita){
        //qui il corpo
      this.altezza=altezza;
      this.larghezza=larghezza;
      this.profondita=profondita;

    }
    
    public String dettagli(){
      String dati ="altezza: " + this.altezza + " larghezza: " + this.larghezza + " profondita: " + profondita;

      return dati;
    }


    public String equals(int a, int b, int c){
      boolean e = false;
      String s = " I solidi non sono uguali";
      if(this.altezza == a){
        e = true;
        if(e == true){
          if(this.larghezza == b){
          e = true;
            if(e == true){
              if(this.profondita == c){
              e = true;
              s = " I solidi sono uguali";
              }
            }
          }
        }
      }
      
      return s;
    }

}
