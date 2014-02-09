import java.util.Scanner;

class PieSharing {
	public static void main( String[] args ) {
		int numSlicesInPie = 14;

		Scanner in = new Scanner( System.in );
		System.out.print( "How many guests are at the party? " );
		int numGuests = in.nextInt();

		System.out.println( "Each guest gets " + numSlicesInPie / numGuests + " pieces of pie." );
		System.out.println( "There are " + numSlicesInPie % numGuests + " pieces left over." );
	}
}
