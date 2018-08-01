
public class PalindromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  String word = "Adam madam";
		  String reverse ="";
		  
		  for(int i=word.length()-1;i>=0;--i) {
			  reverse += word.charAt(i);
		  }
		  System.out.println(reverse);
		  
		  if(word.equalsIgnoreCase(reverse)) {
			  System.out.println("String is panlindrom");
		  }else {
			  System.out.println("String is not palindrom");
		  }
	}

}
