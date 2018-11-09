import java.lang.reflect.Method;

public class Reflex {

	public static void main(String[] args) {                        

		  //On récupère un objet Class

		  Class c = new String().getClass();

		  Method[] m = c.getMethods();

          

		  System.out.println("Il y a " + m.length + " méthodes dans cette classe");

		  //On parcourt le tableau de méthodes

		  for(int i = 0; i < m.length; i++)

		  {

		    System.out.println(m[i]);


		    Class[] p = m[i].getParameterTypes();

		    for(int j = 0; j < p.length; j++)

		      System.out.println(p[j].getName());


		    System.out.println("----------------------------------\n");

		  }
		  
		  //Class c = String.class; est équivalent


		  //La méthode getInterfaces retourne un tableau de Class

		  Class[] faces = c.getInterfaces();

		  //Pour voir le nombre d'interfaces

		  System.out.println("Il y a " + faces.length + " interfaces implémentées");

		  //On parcourt le tableau d'interfaces

		  for(int i = 0; i < faces.length; i++)

		    System.out.println(faces[i]);

		}

}
