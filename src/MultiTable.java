
public class MultiTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int premiersNombres[][] = { {0,2,4,6,8},{1,3,5,7,9} }, i = 0, j = 0;
		 
		while (i < 2)
		{
		  j = 0;
		  while(j < 5)
		  {
		    System.out.println("premiersNombres["+i+"]["+j+"]"+ premiersNombres[i][j]);
		    j++;
		  }
		  System.out.println("");
		  i++;
		}
		
		for(int k = 0; k < 2; k++)

		{    

		  for(int l = 0; l < 5; l++)

		  {

			  System.out.println("premiersNombres["+k+"]["+l+"]"+ premiersNombres[k][l]);
		  }

		  System.out.println("");     

		}

	}

}
