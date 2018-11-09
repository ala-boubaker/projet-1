import java.util.Scanner;

public class Conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char modeConversion;
        char reponse = 'O';
        double temperature;
        Scanner sc = new Scanner(System.in);
        
		
        System.out.println("CONVERTISSEUR DEGRES CELSIUS ET DEGRES FAHRENHEIT");
		
	while(reponse=='O') 
	{	
      do 
		{ 	
		 
			 System.out.println("Choisissez le mode de conversion:");
			 System.out.println("1 - Convertisseur Celsius - Fahrenheit");
			 System.out.println("2 - Convertisseur Fahrenheit - Celsius");
			 modeConversion = sc.nextLine().charAt(0);
			
		 
		
		     System.out.println("Temperature a convertir");
		     temperature=sc.nextDouble();
		     convert(temperature,modeConversion);
		     sc.nextLine();
		
		        //On vide la ligne avant d'en lire une autre
		     do 
		      {
 
            		 System.out.println("Souhaitez-vous convertir une autre temperature ?(O/N)");
            		 reponse=sc.nextLine().charAt(0);
			
		       }
		     
		     while(reponse!='O' && reponse!='N');
		
		}
		 while(modeConversion!='1' && modeConversion!='2');
		
	}	
	System.out.println("Au revoir!");
	}

	public static void convert (double temp, char mode) {
		
		double calcul=0;
		
		if (mode=='1') 
		{
			calcul=((9/5)*temp)+32;
			System.out.println( temp+" C coresspond a" + calcul);
		}
		else
		{
			calcul=(temp-32)*5/9;
			System.out.println( temp+" F corespond a" + calcul);
		}	
		
		
	}
	public static double arrondi(double A, int B) {

		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);

		}
}
