package exercise0;


public class Persona {

  String nome, cognome;
  int eta;
  int anno;
  int mese;


public Persona(){
  this.name="n";
  this.cognome="";
}

public Persona (String nome,String cognome ,int eta){
  this.nome= nome;
  this.cognome= cognome;
  this.eta=eta;
}

  public String dettagli(){

    String d = "la persona chiama" + this.nome + " " + this.cognome "e ha" + this.eta + "è nata nell'anno" + this.anno;
  }

}