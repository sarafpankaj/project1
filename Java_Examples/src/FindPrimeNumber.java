import java.util.Scanner;

public class FindPrimeNumber {

	String word = new String("abba");

	private static void findPrimeNumber(int number) {
		
		
		
		
		boolean flag =false;
		for (int i=2; i<=number/2;i++) {
			if(number%i==0) {
				flag=true;
				continue;
			}
		}
		
		if (flag) {
			System.out.println("Number "+number+" is Not Prime Number");
		}else {
			System.out.println("Number "+number+" is Prime Number");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Enter a number: ");
		int n = reader.nextInt(); // Scans the next token of the input as an int.
		//once finished
		reader.close();
		findPrimeNumber(n);
		
	}

}
