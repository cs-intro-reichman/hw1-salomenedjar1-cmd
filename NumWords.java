// Prints a given number using a hundreds, tens, and units notation.

import java.util.Scanner; 
public class NumWords {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number= Integer.parseInt(args[0]);
		int hundreds= (number/100)%10;
		int tens= (number/10)%10;
		int units= (number%10);

		System.out.println(hundreds+ " hundreds,"+ tens+" tens and "+units+" units");
	    
	}
}
