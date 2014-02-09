import java.util.Scanner;

class CelsiusToFahrenheit {
	public static void main( String[] args ) {
		double temperatureInCelsius;
		double temperatureInFahrenheit;

		System.out.print( "Enter Celsius temperature: " );
	
		Scanner in = new Scanner( System.in );
		temperatureInCelsius = in.nextDouble();

		temperatureInFahrenheit = ( ( temperatureInCelsius * 9 ) / 5 ) + 32;

		System.out.println( temperatureInCelsius + " degree Celsius is " + temperatureInFahrenheit + " degrees Fahrenheit." );
	}
}
