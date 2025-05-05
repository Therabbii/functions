import java.util.Scanner;

	public class SquareDriver{

		public static void main(String[] arg){

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		KataSquare kata = new KataSquare();
		System.out.println(kata.square(number));

		}

	}