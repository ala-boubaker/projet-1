import java.lang.reflect.Method;

public class Reflex {

	public static void main(String[] args) {                        

		  //On r�cup�re un objet Class

		  Class c = new String().getClass();

		  Method[] m = c.getMethods();

          

		  System.out.println("Il y a " + m.length + " m�thodes dans cette classe");

		  //On parcourt le tableau de m�thodes

		  for(int i = 0; i < m.length; i++)

		  {

		    System.out.println(m[i]);


		    Class[] p = m[i].getParameterTypes();

		    for(int j = 0; j < p.length; j++)

		      System.out.println(p[j].getName());


		    System.out.println("----------------------------------\n");

		  }
		  
		  //Class c = String.class; est �quivalent


		  //La m�thode getInterfaces retourne un tableau de Class

		  Class[] faces = c.getInterfaces();

		  //Pour voir le nombre d'interfaces

		  System.out.println("Il y a " + faces.length + " interfaces impl�ment�es");

		  //On parcourt le tableau d'interfaces

		  for(int i = 0; i < faces.length; i++)

		    System.out.println(faces[i]);

		}

}
