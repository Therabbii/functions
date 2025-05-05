
import java.util.Scanner;

public class EvenDriver {

	public static void main(String[] arg){

	Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int number = scanner.nextInt();

		Kata kata = new Kata();

		System.out.println(kata.even(number));

	}

}
