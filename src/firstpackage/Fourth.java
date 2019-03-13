package firstpackage;

public class Fourth {

	public static void main(String[] args) {
		String String1 = "Reddy Kundur";
		String String2 = "Kundur";
		
		if(String1.isEmpty())
		{
		System.out.println("Yes it is Empty");		
		}
		else {
			System.out.println("it is not Empty");
		}
		if(String1.equals(String2))
		{
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
		if(String1.equalsIgnoreCase(String2))
		{
			System.out.println("Both are equal");
		}
		else{
			System.out.println("Both are not equal");
		}
		if(String1.contains(String2))
		{
			System.out.println("String1 contains String2");
		}
		else{
			System.out.println("String1 do not contain String2");
		}	
		System.out.println(String1.charAt(8));
		System.out.println(String2.charAt(5));
		
		System.out.println(String2.split("  "));
		System.out.println(String2.replace("u", "a"));
		System.out.println(String1.substring(5));
		}
      
}
