import java.util.Scanner;

public class Sdz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
		
		try {
			
			Scanner sc = new Scanner(System.in);

		    System.out.println("Saisissez un entier : ");

		    int i = sc.nextInt();

		    System.out.println("Saisissez une chaîne : ");

		    //On vide la ligne avant d'en lire une autre

		    sc.nextLine();

		    String str = sc.nextLine();      

		    System.out.println("FIN ! ");
		    System.out.println((9/5));

		} catch (Exception e) {
	          System.out.println(e.getMessage());
		}

	}

}
