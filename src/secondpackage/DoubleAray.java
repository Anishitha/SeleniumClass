package secondpackage;

public class DoubleAray {

	public static void main(String[] args) {
		
		String[][] doubleDimension = {{"Kundur","Ani","Reddy","Dolly"},{"Kundur", "Alekya","Reddy","Laddu"}};
		
       for(int i = 0; i < doubleDimension.length; i++) 
       {
    	   for(int j = 0; j < doubleDimension[i].length; j++)
    	   {
    		
    		   System.out.println(doubleDimension[i][j]);
    	   }
       }
	}

}
