import java.util.HashMap;
import java.util.Map;

public class TypeCasting {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 String s1 = new String ("Pankaj");
	 String s2 = new String ("Pankaj");
	 
	 if (s1==s2) {
		 System.out.println("s1==s2 ");
	 }else {
		 System.out.println("s1 not ==s2 ");
	 }
	 
	 if (s1.equals(s2)) {
		 System.out.println("s1 eq s2" );
	 }else {
		 System.out.println("s1 not eq s2 ");
		 
		 
		 
	 }
	 
	 Map<String, String> myMap =  new HashMap<>();
	 myMap.put("Pankaj", "1000");
	 
	 myMap.get("Pankaj");
	
	 
	}

}
