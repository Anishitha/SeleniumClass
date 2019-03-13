package secondpackage;

public class Loop {

	

	public static void main(String[] args) {
		String Loop1 = "Hi, I am Reddy";
		String Loop2 = "I am not Reddy";
		
		System.out.println(Loop1.split(" "));
		
		for(int i = 0; i < Loop1.split(" ").length; i++){
		
		System.out.println(Loop1.split(" ")[i]);	
		}
		
		for(String str:Loop1.split(" ")){
			System.out.println(str);
		}
        
	}

}
