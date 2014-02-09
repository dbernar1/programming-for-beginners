/*
  Programming for Beginners
  Dan Bernardic
*/
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Enumeration;

class A1Q1 {
  public static void main( String[] args ) {
    Hashtable<String,Double> multipliers = new Hashtable<String,Double>();

    multipliers.put( "Mercury", 0.38 );
    multipliers.put( "Venus", 0.91 );
    multipliers.put( "Earth", 1.00 );
    multipliers.put( "Mars", 0.38 );
    multipliers.put( "Jupiter", 2.34 );
    multipliers.put( "Saturn", 1.06 );
    multipliers.put( "Uranus", 0.92 );
    multipliers.put( "Neptune", 1.19 );
    multipliers.put( "Pluto", 0.06 );

    Scanner in = new Scanner( System.in );
    
    System.out.print( "What is your weight (in lbs)? " );
    int earthWeight = in.nextInt();

    for ( Enumeration<String> e = multipliers.keys(); e.hasMoreElements(); ) {
      String planetName = e.nextElement();
      System.out.println( "If you were on " + planetName + ", your weight would be: " + earthWeight * multipliers.get( planetName ) );
    }
  }
}
