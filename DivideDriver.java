import java.util.Scanner;

	public class DivideDriver{

		public static void main(String[] arg){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		float num1 = scanner.nextFloat();
		System.out.print("Enter second number: ");
		float num2 = scanner.nextFloat();

		KataDivide kata = new KataDivide();
		System.out.println(kata.divide(num1, num2));

		}

	}