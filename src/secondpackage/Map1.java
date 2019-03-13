package secondpackage;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



public class Map1 {

	public static void main(String[] args) {
		
		ArrayList<String> str = new ArrayList<String>();
		 
		str.add("Reddy");
		
		str.add("506370");
		
		str.add("India");
		
		for(int i = 0; i < str.size(); i++)
		{
			
			//System.out.println(str.get(i));
		}
		
		Map<String, String> map = new HashMap<String, String>();
		map.put("Name", "Reddy");
		map.put("Pincode", "506370");
		map.put("Place", "India");
		
		System.out.println(map.get("Place"));
		
	}

}
