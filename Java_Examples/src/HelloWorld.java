
import java.util.Arrays;
import java.util.List;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println("Hello Java 8"); 
      
      
      // Stream examples
      List <String>people =  Arrays.asList("Pankaj Saraf","Shobhita Soni","Armaan Saraf");
      people.stream().map(String::toLowerCase)
      .filter(x->x.startsWith("a"))
      .forEach(System.out::println);
	}

}
