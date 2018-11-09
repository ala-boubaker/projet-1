import com.sdz.exception.NomVilleException;
import com.sdz.exception.NombreHabitantException;

public class VilleTest {

	public static void main(String[] args) {

        

	    Ville[] tableau = new Ville[6];

	    String[] tab = {"Marseille", "li", "caen", "lyon", "paris", "nantes"};

	    int[] tab2 = {123456, -78456, 654987, 75832165, 1594, 213};


	    for(int i = 0; i < 6; i++){

	      if (i <3){

	        Ville V = null;
			try {
				V = new Ville(tab[i], tab2[i], "france");
			}
				catch (NombreHabitantException | NomVilleException e2){ 

				    System.out.println(e2.getMessage());             

				  } finally{

			    if(V == null)
			    V = new Ville();
                
			    tableau[i] = V;
			  }
	        

	      }

	                

	      else{

	        Capitale C = null;
			try {
				C = new Capitale(tab[i], tab2[i], "france", "la tour Eiffel");
				tableau[i] = C;
			} catch (NombreHabitantException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NomVilleException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
			
			    if(C == null)
			    C = new Capitale();
                
			     tableau[i] = C;
			  }

	        

	      }

	    }


	    //Il ne nous reste plus qu'à décrire tout notre tableau !

	    for(Object v : tableau){

	      System.out.println(((Ville) v).decrisToi()+"\n");

	    }

	  }
}
