/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 09/15/2025
 * Platform/compiler:
 * I pledge that I have completed the programming assignment 
* independently. I have not copied the code from a student or   * any source. I have not given my code to any student.
 * Print your Name here: Adonis Lizama
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;


public class ESPGame {
	public static void main(String [] args) {
		// Variables
		int choice;
		String filename;
		String guess;
		String continueGame;
		
		// Intro message
		System.out.println("CMSC203 Assignment1: Test your ESP skills!");
		System.out.println("Welcome to ESP - extrasensory perception!");
		System.out.println("Would you please choose one of the 4 options from the menu?");
		
		do {
			// Menu
			System.out.println("\n1: 16 Colors Game");
			System.out.println("2: 10 Colors Game");
			System.out.println("3: 5 Colors Game");
			System.out.println("4: Exit");
			
			//User input
			Scanner input = new Scanner(System.in);
			System.out.println("\nEnter your choice: ");
			choice = input.nextInt();
			input.nextLine();
			
			// System.out.println(choice);
			
			// get file name and read it
			// System.out.print("Enter the file name: ");
			// filename = input.nextLine();
			
			// OPTiON 1, 16 colors (all)
			
			if (choice == 1) {
				int MAX = 16;
				int MIN = 1;
				int points = 0;
				
				Random rand = new Random();
				
				
				System.out.print("Enter the file name: ");
				filename = input.nextLine();
				
				for (int i = 0; i < 3; i++) {
					String selectedColor = null;
					int lineNumber = 1;
					int randomLineNumber = rand.nextInt(16) + 1; // 1 -16
					
					 try {
					        Scanner fileScanner = new Scanner(new File(filename));
	
					        System.out.println("\nThese are the colors in the file (16 colors):");
	
					        while (fileScanner.hasNextLine()) {
					            String line = fileScanner.nextLine();
					            System.out.println(lineNumber + ". " + line);
	
					            if (lineNumber == randomLineNumber) {
					                selectedColor = line;  // pick this color
					            }
	
					            lineNumber++;
					        }
	
					        fileScanner.close();
					    } catch (FileNotFoundException e) {
					        System.out.println("File not found: " + filename);
					    }
					
					
				    Random random = new Random();
				    int randomInt = random.nextInt(MAX - MIN + 1) + MIN;
				    // System.out.println(randomInt);
				    
				    
				    
				    
					// testing
				    // System.out.println("Random line chosen: " + randomLineNumber);
				    // System.out.println("Selected color: " + selectedColor);
				    
				    // Round 1 Game
					System.out.println("\nRound " + (i+1));
					System.out.println("I am thinking of a color... guess what it is:");
				
					String answer = input.nextLine();
					System.out.println("I was thinking of " + selectedColor);
					if(answer.equals(selectedColor)) {
						points++;
					}
			
				}
				
				System.out.println("\nGame Over");
				System.out.println("You guessed " + points + " out of 3 guesses correctly.");
				
				System.out.println("\nWould you like to play another game? Type yes/no");
				continueGame = input.nextLine();
				String lowerCased = continueGame.toLowerCase();
				
				if (lowerCased.equals("yes")) {
					System.out.println("Heading to main menu...");
				} else if (lowerCased.equals("no")) {
					System.exit(0);
				} else {
					System.out.println("Invalid input, ending program...");
					System.exit(0);
				}
			
			// OPTION 2, 10 colors

				
			} else if (choice == 2) {
				int MAX = 10;
				int MIN = 1;
				int points = 0;
				
				Random rand = new Random();
				
				
				System.out.print("Enter the file name: ");
				filename = input.nextLine();
				
				for (int i = 0; i < 3; i++) {
					String selectedColor = null;
					int lineNumber = 1;
					int randomLineNumber = rand.nextInt(10) + 1; // 1 - 10
					
					 try {
					        Scanner fileScanner = new Scanner(new File(filename));
	
					        System.out.println("\nThese are the colors in the file (16 colors):");
	
					        while (fileScanner.hasNextLine() && lineNumber <= 10) {
					            String line = fileScanner.nextLine();
					            System.out.println(lineNumber + ". " + line);
	
					            if (lineNumber == randomLineNumber) {
					                selectedColor = line;  // pick this color
					            }
	
					            lineNumber++;
					        }
	
					        fileScanner.close();
					    } catch (FileNotFoundException e) {
					        System.out.println("File not found: " + filename);
					    }
					
					
				    Random random = new Random();
				    int randomInt = random.nextInt(MAX - MIN + 1) + MIN;
				    // System.out.println(randomInt);
				    
				    
				    // Game
					System.out.println("\nRound " + (i+1));
					System.out.println("I am thinking of a color... guess what it is:");
				
					String answer = input.nextLine();
					System.out.println("I was thinking of " + selectedColor);
					if(answer.equals(selectedColor)) {
						points++;
					}
			
				}
				
				System.out.println("\nGame Over");
				System.out.println("You guessed " + points + " out of 3 guesses correctly.");
				
				System.out.println("\nWould you like to play another game? Type yes/no");
				continueGame = input.nextLine();
				String lowerCased = continueGame.toLowerCase();
				
				if (lowerCased.equals("yes")) {
					System.out.println("Heading to main menu...");
				} else if (lowerCased.equals("no")) {
					System.exit(0);
				} else {
					System.out.println("Invalid input, ending program...");
					System.exit(0);
				}
				
				
				
				// option tres (3)
			} else if (choice == 3) {
				int MAX = 5;
				int MIN = 1;
				int points = 0;
				
				Random rand = new Random();
				
				
				System.out.print("Enter the file name: ");
				filename = input.nextLine();
				
				for (int i = 0; i < 3; i++) {
					String selectedColor = null;
					int lineNumber = 1;
					int randomLineNumber = rand.nextInt(5) + 1; // 1 - 10
					
					 try {
					        Scanner fileScanner = new Scanner(new File(filename));
	
					        System.out.println("\nThese are the colors in the file (16 colors):");
	
					        while (fileScanner.hasNextLine() && lineNumber <= 5) {
					            String line = fileScanner.nextLine();
					            System.out.println(lineNumber + ". " + line);
	
					            if (lineNumber == randomLineNumber) {
					                selectedColor = line;  // pick this color
					            }
	
					            lineNumber++;
					        }
	
					        fileScanner.close();
					    } catch (FileNotFoundException e) {
					        System.out.println("File not found: " + filename);
					    }
					
					
				    Random random = new Random();
				    int randomInt = random.nextInt(MAX - MIN + 1) + MIN;
				    // System.out.println(randomInt);
				    
				    
				    // Game
					System.out.println("\nRound " + (i+1));
					System.out.println("I am thinking of a color... guess what it is:");
				
					String answer = input.nextLine();
					System.out.println("I was thinking of " + selectedColor);
					if(answer.equals(selectedColor)) {
						points++;
					}
			
				}
				
				System.out.println("\nGame Over");
				System.out.println("You guessed " + points + " out of 3 guesses correctly.");
				
				System.out.println("\nWould you like to play another game? Type yes/no");
				continueGame = input.nextLine();
				String lowerCased = continueGame.toLowerCase();
				
				if (lowerCased.equals("yes")) {
					System.out.println("Heading to main menu...");
				} else if (lowerCased.equals("no")) {
					System.exit(0);
				} else {
					System.out.println("Invalid input, ending program...");
					System.exit(0);
				}
				
				
				
				
				
			} 
		
		} while (choice != 4);
		
		if (choice == 4) {
			Scanner anotherInput = new Scanner(System.in);
			
			System.out.println("Enter your name: ");
			String name = anotherInput.nextLine();
			
			System.out.println("Describe yourself: ");
			String desc = anotherInput.nextLine();
			
			System.out.println("Enter due date: ");
			String date = anotherInput.nextLine();
			//
			System.out.println("\nUsername: " + name);
			System.out.println("Description: " + desc);
			System.out.println("Due date: " +  date);
			
		}
		
		
	}
}
