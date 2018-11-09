

public class Duo<T, S> { 
  //Variable d'instance de type T
  private T valeur1;

  //Variable d'instance de type S
  private S valeur2;
        
  //Constructeur par d�faut
  public Duo(){
    this.valeur1 = null;
    this.valeur2 = null;
    
  }        

  //Constructeur avec param�tres
  public Duo(T val1, S val2){
    this.valeur1 = val1;
    this.valeur2 = val2;
}
}