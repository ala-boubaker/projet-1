import com.sdz.exception.NomVilleException;
import com.sdz.exception.NombreHabitantException;

public class Capitale extends Ville {
     
  private String monument;
    
  //Constructeur par d�faut
  public Capitale(){
    //Ce mot cl� appelle le constructeur de la classe m�re
    super();
    monument = "aucun";
  }    
      
  //Constructeur d'initialisation de capitale
  public Capitale(String nom, int hab, String pays, String monument) throws NombreHabitantException, NomVilleException{
    super(nom, hab, pays);
    this.monument = monument;
  }    
     
  /**
    * Description d'une capitale
    * @return String retourne la description de l'objet
  */
  public String decrisToi(){
    String str = super.decrisToi() + "\n \t ==>>" + this.monument + " est un monument";

    return str;
    } 

  /**
    * @return le nom du monument
  */
  public String getMonument() {
    return monument;
  } 

  //D�finit le nom du monument
  public void setMonument(String monument) {
    this.monument = monument;
  }   
}