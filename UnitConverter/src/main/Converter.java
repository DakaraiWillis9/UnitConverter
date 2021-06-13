package main;

import java.util.Scanner;

public class Converter {

	static Scanner myScanner = new Scanner(System.in);
	
	//conversion methods
	
	public static double convertCupsToTeaspoons(double qty) {
		return qty * 48;
	}
	
	public static double convertMilesToKilometers(double qty) {
		return qty * 1.60934;
	}
	
	public static double convertUSGallonsToImperialGallons(double qty) {
		return qty * 0.832674;
	}
	
	//Main method
	
	public static void main(String[] args) {
		
		String question = "\nPlease select one of the following: \n1. Cups to Teaspoons \n"
				+ "2. Miles to Kilometers \n"
				+ "3. US Gallons to Imperial Gallons \n"
				+ "4. Quit\n";
		
		//Pose original question to user and get input
		
		System.out.println(question);
		int option = myScanner.nextInt();
		
		
		// User error loop to re-enter an acceptable option
		
		while(option < 1 || option > 4) {
			System.out.println("Sorry that was an invalid option!");
			System.out.println(question);
			option = myScanner.nextInt();
		}
		
		//do while loop to process users conversions
		do {
			switch(option) {
				
				case 1:
					
					System.out.println("How many cups would you like to convert to teaspoons?");
					double cups = myScanner.nextDouble();
					System.out.println(convertCupsToTeaspoons(cups) + " teaspoons is equivalent to " + cups + " cups.");
					System.out.println(question);
					option = myScanner.nextInt();
					break;
						
				case 2:
					System.out.println("How many miles would you like to convert to kilometers?");
					double distance = myScanner.nextDouble();
					System.out.println(convertCupsToTeaspoons(distance) + " kilometers is equivalent to " + distance + " miles.");
					System.out.println(question);
					option = myScanner.nextInt();
					break;
						
				case 3:
					System.out.println("How many US gallons would you like to convert to Imperial gallons?");
					double gal = myScanner.nextDouble();
					System.out.println(convertCupsToTeaspoons(gal) + " imperial gallons is equivalent to " + gal + " US gallons.");
					System.out.println(question);
					option = myScanner.nextInt();
					break;
					
				case 4:
					break;
				
				default: 
					while(option < 1 || option > 4) {
						System.out.println("Sorry that was an invalid option!");
						System.out.println(question);
						option = myScanner.nextInt();
					}
				}
			}while(option != 4);
		
	
		
		
		
		
		
		
		
		myScanner.close();
	}
	
}
