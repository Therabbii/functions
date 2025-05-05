import java.util.Scanner;

	public class DifferenceDriver{

		public static void main(String[] arg){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter second number: ");
		int num2 = scanner.nextInt();

		KataDiff kata = new KataDiff();
		System.out.println(kata.minus(num1, num2));

		}

	}