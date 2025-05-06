public class Kata {

		public static boolean even(int number){
			boolean even = true; 

			int evenNumber = number % 2;

			if ( evenNumber == 0 ){
				even = true; 
			}
			else {
				even = false;
				}

			return even;
		}
	

		public static int minus (int num1, int num2){
			int difference = num1 - num2;
			int differenceFormatted = 0;
			if (difference < 0){
			differenceFormatted = difference * -1;
			}
			else if (difference > 0){
			differenceFormatted = difference * 1;
			}

		return differenceFormatted;

		}
		
		public static boolean prime (int number){

			boolean prime = true;

		if (number <= 1) prime = false;
		
			for(int i = 2; i <= number / 2; i++){
				if (number % i == 0){
				prime = false;
				} else{
				prime = true;
				}
			} 
		return prime;
	
		}


		public static float divide (float num1, float num2){
			float quotient = num1 / num2;

		if ( num2 == 0)
		quotient = 0;

		return quotient;
	
		}



		public static int factorCounter(int number){

		int factorCounter = 0;	
		int count = 1;

		while(count <= number){
			if(number % count == 0)
			factorCounter ++;
			count ++;

		}

		return factorCounter;

		}


		public static long factorial (long number){
			long factorial = 1;

		for(int i = 1; i <= number; i++){
		factorial *= i;
		//System.out.println(" " + i);
		}
		//System.out.printf("%n%d! is %d", number, factorial);

		return factorial;
	
		}

	
		public static int square (int number){
			int square = number * number;

		return square;

		}





}
		
		