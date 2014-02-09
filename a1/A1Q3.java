import java.util.Scanner;

class A1Q3 {
  public static void main( String[] args ) {
    Scanner in = new Scanner( System.in );

    System.out.print( "How many hours? " );
    int totalHours = in.nextInt();

    int numDays = totalHours / 24;
    int numHours = totalHours % 24;

    System.out.println(
      "That is " + numDays + " day" + ( numDays == 1 ? "" : "s" ) +
      " and " + numHours + " hour" + ( numHours == 1 ? "" : "s" ) + "."
    );
  }
}
