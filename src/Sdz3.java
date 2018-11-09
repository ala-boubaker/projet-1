import java.util.Scanner;

public class Sdz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String prenom;

		char reponse ;

		Scanner sc = new Scanner(System.in);


		 do
	       {
				System.out.println("Donnez un prénom : ");
				prenom = sc.nextLine();
				System.out.println("Bonjour " +prenom+ ", comment vas-tu ?");                        
  
				//Sans ça, nous n'entrerions pas dans la deuxième boucle
				reponse = ' ';
                        

				//Tant que la réponse n'est pas O ou N, on repose la question
				while(reponse != 'O' && reponse != 'N')
				  {
					//On demande si la personne veut faire un autre essai
                    System.out.println("Voulez-vous réessayer ? (O/N)");
                   reponse = sc.nextLine().charAt(0);
                  }
          }
          while (reponse == 'O');
		  System.out.println("Au revoir…");


}
}
