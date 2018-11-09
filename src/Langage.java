

public enum Langage {
  //Objets directement construits
  JAVA("Langage JAVA", "Eclipse"),
  C ("Lanage C", "Code Block"),
  CPlus ("Langage C++", "Visual studio"),
  PHP ("Langage PHP", "PS Pad");

  private String name = "";
  private String editor = "";
   
  //Constructeur
  Langage(String name, String editor){
    this.name = name;
    this.editor = editor;
  }
   
  public void getEditor(){
    System.out.println("Editeur : " + editor);
  }
   
  public String toString(){
    return name;
  }
   
  public static void main(String args[]){
	  
	  for(Langage lang : Langage.values()){
		  lang.getEditor();

	      if(Langage.JAVA.equals(lang))

	        System.out.println("J'aime le : " + lang);

	      else

	        System.out.println(lang);

	    }
  }
}