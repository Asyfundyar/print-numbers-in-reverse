public class numbersInReverse {

	public static void main(String[] args) {	  
		int number = 28362139; 

		while (number > 0) {
			System.out.println( number % 10);
			number = number / 10;
	   	}
	}

}
