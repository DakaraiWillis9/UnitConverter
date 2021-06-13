package main;

import java.util.Scanner;

public class ConverterExtra {
	
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

	public static void main(String[] args) {
		
		String question = "\nPlease select one of the following to perform: \n1. Volume Conversions \n"
				+ "2. Distance Conversions \n"
				+ "3. Temperature Conversions \n"
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
					
					System.out.println("\nPlease select one of the following: \n1. Cups to Teaspoons\n"
							+ "2. Teaspoons to Cups\n"
							+ "3. Tablespoons to Teaspoons\n"
							+ "4. Teaspoons to Tablespoons\n"
							+ "5. Tablespoons to Cups\n"
							+ "6. Cups to Tablespoons\n"
							+ "7. Quit");
					int firstOption = myScanner.nextInt();
					
					switch(firstOption) {
					
						case 1:
							System.out.println("How many cups would you like to convert to teaspoons?");
							double volume = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume) + " teaspoons is equivalent to " + volume + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						
						case 2:
							System.out.println("How many teaspoons would you like to convert to cups?");
							double volume1 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume1) + " cups is equivalent to " + volume1 + " teaspoons.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 3:
							System.out.println("How many tablespoons would you like to convert to teaspoons?");
							double volume2 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume2) + " teaspoons is equivalent to " + volume2 + " tablespoons.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 4:
							System.out.println("How many teaspoons would you like to convert to tablespoons?");
							double volume3 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume3) + " tablespoons is equivalent to " + volume3 + " teaspoons.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 5:
							System.out.println("How many tablespoons would you like to convert to cups?");
							double volume4 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume4) + " cups is equivalent to " + volume4 + " tablespoons.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 6:
							System.out.println("How many cups would you like to convert to tablespoons?");
							double volume5 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(5) + " tablespoons is equivalent to " + 5 + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 7:
							break;
						default:
							while(firstOption < 1 || firstOption > 7) {
								System.out.println("Sorry that was an invalid option!");
								System.out.println(question);
								option = myScanner.nextInt();
							}
						
					}
				case 2:
					
					System.out.println("\nPlease select one of the following: \n1. Cups to Teaspoons\n"
							+ "2. Teaspoons to Cups\n"
							+ "3. Tablespoons to Teaspoons\n"
							+ "4. Teaspoons to Tablespoons\n"
							+ "5. Tablespoons to Cups\n"
							+ "6. Cups to Tablespoons\n"
							+ "7. Quit");
					int secondOption = myScanner.nextInt();
					
					switch(secondOption) {
					
						case 1:
							System.out.println("How many cups would you like to convert to teaspoons?");
							double distance = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(distance) + " teaspoons is equivalent to " + distance + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						
						case 2:
							System.out.println("How many  would you like to convert to teaspoons?");
							double volume1 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume1) + " teaspoons is equivalent to " + volume1 + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 3:
							System.out.println("How many cups would you like to convert to teaspoons?");
							double volume2 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume2) + " teaspoons is equivalent to " + volume2 + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 4:
							System.out.println("How many cups would you like to convert to teaspoons?");
							double volume3 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume3) + " teaspoons is equivalent to " + volume3 + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 5:
							System.out.println("How many cups would you like to convert to teaspoons?");
							double volume4 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(volume4) + " teaspoons is equivalent to " + volume4 + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 6:
							System.out.println("How many cups would you like to convert to teaspoons?");
							double distance5 = myScanner.nextDouble();
							System.out.println(convertCupsToTeaspoons(5) + " teaspoons is equivalent to " + 5 + " cups.");
							System.out.println(question);
							option = myScanner.nextInt();
							break;
						case 7:
							break;
						default:
							while(secondOption < 1 || secondOption > 7) {
								System.out.println("Sorry that was an invalid option!");
								System.out.println(question);
								option = myScanner.nextInt();
							}
					}
						
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
