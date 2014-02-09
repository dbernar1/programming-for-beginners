/*
CountMoney - Calculates how much your change is worth.
By: Sara Arenson and class
*/

import java.util.Scanner;

class CountMoney {
	public static int askForInt( String prompt ) {
		System.out.print( prompt + " " );
		return CountMoney.in.nextInt();
	}

	private static Scanner in;

	public static void main( String[] args ) {
		// Declare variables to hold coin counts
		int twoonieCount, loonieCount, quarterCount, dimeCount, nickelCount;

		int totalCents;
		double dollarAmount;

		CountMoney.in = new Scanner( System.in );

		twoonieCount = CountMoney.askForInt( "How many twonies?" );
		loonieCount = CountMoney.askForInt( "How many loonies?" );
		quarterCount = CountMoney.askForInt( "How many quarters?" );
		dimeCount = CountMoney.askForInt( "How many dimes?" );
		nickelCount = CountMoney.askForInt( "How many nickels?" );

		totalCents =
			twoonieCount * 200
			+ loonieCount * 100
			+ quarterCount * 25
			+ dimeCount * 10
			+ nickelCount * 5
		;

		dollarAmount = totalCents / 100.0;

		System.out.println( "Amount in dollars is: $" + dollarAmount );
	}
}
