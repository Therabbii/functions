import java.util.Scanner;

	public class FactorialDriver{

		public static void main(String[] arg){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		KataFactorial kata = new KataFactorial();
		System.out.println(kata.factorial(number));

		}

	}