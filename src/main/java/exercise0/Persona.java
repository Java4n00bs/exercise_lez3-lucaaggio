package exercise0;


public class Persona {

  String nome, cognome;
  int eta;
  int anno;
  int mese;


public Persona(){
  this.nome="n";
  this.cognome="";
}

public Persona (String nome,String cognome ,int eta, int anno){
  this.nome= nome;
  this.cognome= cognome;
  this.eta=eta;
  this.anno=anno;
}

  public String dettagli(){

    String d = "la persona si chiama " + this.nome + " " + this.cognome + ", ha " + this.eta + " anni, è nata nell'anno: " + this.anno;
    return d;
  }

}