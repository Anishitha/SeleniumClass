package secondpackage;

public class Aray2 {

	public static void main(String[] args) {
		String[][] str = new String[4][3];
		
		str[0][0] = "Red";
		str [0][1]= "Rose";
		str [0][2] ="Beautiful";
		str [1][0] = "Cute";
		str [1][1] = "Pug";
		str [1][2] = "Dog";
		
		for(int i = 0; i < 4; i++){
			for( int j =0; j < 3; j++) {
				System.out.println(str[i][j]);
			}
		}
			
		
		
		
		
		

	}

}
