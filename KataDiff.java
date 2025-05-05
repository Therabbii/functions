
public class KataDiff {
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
}