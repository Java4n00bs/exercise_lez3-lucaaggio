package exercise1;


public class Impiegato {
    String nome,cognome;
    int salario;

    public Impiegato(String nome, String cognome, int salario){
        //qui il corpo
      this.nome=nome;
      this.cognome=cognome;
      this.salario=salario;

    }
    
    public String dettagli(){
      String dati ="nome: " + this.nome + " cognome: " + this.cognome + "cash: " + salario;

      return dati;
    }


    public void aumentaSalario(int percentuale){
      this.salario = this.salario/100*(100+percentuale);

      //la percentuale sarà un numero tra 0 e 1, dato che è un intero c'è da fare qualche operazione in più

      //in realtà ci fotte poco della matematica lol
      //ahahaha apposto allora :)
      //lo tengo come ricordo
    }

}
