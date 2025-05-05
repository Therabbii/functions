	public class Kata {

		public static int even(int number){
			int even = number % 2;
			if ( even == 0 ){
				System.out.print("This number is an even number.");
			}
			else {
				System.out.println("This number is not even number.");
				}

			return even;
		}
	}

		public static int minus (int num1, int num2){
			int difference = num1 - num2;
			int differenceFormatted;
			if (difference < 0){
			differenceFormatted = difference * -1;
			}
			else if (difference > 0){
			differenceFormatted = difference * 1;
			}

		return differenceFormatted;




		}
		
		
		