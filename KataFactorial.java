
public class KataFactorial {
		public static long factorial (long number){
			long factorial = 1;

		for(int i = 1; i <= number; i++){
		factorial *= i;
		//System.out.println(" " + i);
		}
		//System.out.printf("%n%d! is %d", number, factorial);

		return factorial;
	
		}

}