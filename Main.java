import java.util.Scanner;

/**
 * This class has all of the main methods which will be running in my game including some important methods.
 * For example, this class is printing main menus, getting information from the input.
 * If we are comparing this to something it is basically my meat of my burger.
 * It is the core where everything is happening.
 * @author 901083001
 * @version June 2018
 *
 */
public class Main {
	
	/**
	 * This method is getting the information from the player about how many team members the player 
	 * wants to bring along to the ring. 
	 * It's using data structures which include arrays. 
	 */
	public static void teamMembers() {
		int length;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out
				.println("How many team members are you bringing alongside to the ring?");
		length = input.nextInt();

		String[] names = new String[length];
// We are running this loop to get how much team mates are going to be coming along, it compares it with the length variable which is the string 
		// It also asks the player to input the team mates  
		for (int counter = 0; counter < length; counter++) {
			System.out
					.println("Enter the name of Team Member " + (counter + 1));
			names[counter] = input.nextLine();
		}
// In this block of code we are printing out the final team members  
		System.out.println("Your Team Members are");
		for (int counter = 0; counter < length; counter++) {
			System.out.println(names[counter]);

		}

	}
	
	/**
	 * This is a decoupled method which works by itself, and doesn't rely on any other methods. Paste it in the other project it will work.
	 * @param playerChoice This variable is a String value which takes in the number and the player choice for which boxer they want to fight.
	 * @return It returns the string of the boxer which the player is picking 
	 */
	public static String getBoxerName(String playerChoice) {
		if(playerChoice.equals("1")) return "Rocky Balboa";
		if(playerChoice.equals("2")) return "Mayweather";
		if(playerChoice.equals("3")) return "Ronda Rousey";
		// This is if the player presses anything other than 1-3 but it won't print anything
		return "ABHAY";
	}
	/**
	 * Not printning this right now in the main method it will be called up
	 * It also has when this project was created and who the author was.
	 * This method is basically using sysout print method which prints out the start credits in the beginning of the game, welcoming the user.
	 */
	public static void printStartCreditScreen() {
		System.out.println("**********************************");
		System.out.println("Thank you for using Knockout Kings");
		System.out.println("**********************************");
		System.out
				.println("..................................................");
		System.out
				.println("| Computer Science 20 Project Created In May 2018|");
		System.out
				.println("..................................................");
		System.out.println("Code Written By @Abhay.K\n");
	}
/**
 * Not printing this right now in the main method it will be called up
 * This method runs after the printStartCreditScreen which prints out the title, which I got off from the google text art.
 */
	public static void printTitle() {
System.out.println("888    d8P                         888                     888      888    d8P d8b");
System.out.println("888   d8P                          888                     888      888   d8P  Y8P");
System.out.println("888  d8P                           888                     888      888  d8P");
System.out.println("888d88K    88888b.  .d88b.  .d8888b888  888 .d88b. 888  888888888   888d88K    88888888b.  .d88b. .d8888b");
System.out.println("8888888b   888 '88bd88''88bd88P'   888 .88Pd88''88b888  888888      8888888b   888888 '88bd88P'88b88K ");
System.out.println("888  Y88b  888  888888  888888     888888K 888  888888  888888      888  Y88b  888888  888888  888'Y8888b.");	
System.out.println("888   Y88b 888  888Y88..88PY88b.   888 '88bY88..88PY88b 888Y88b.    888   Y88b 888888  888Y88b 888     X88");	
System.out.println("888    Y88b888  888 'Y88P'  'Y8888P888  888 'Y88P'  'Y88888 'Y888   888    Y88b888888  888 'Y88888 88888P'");
System.out.println("                                                                                               888        ");	
System.out.println("                                                                                          Y8b d88P        ");
System.out.println("                                                                                           'Y88P'         ");	
	}
	
	/**
	 * I am actually not using this method right now I call this method up after a while basically at the end of the game.
	 * This is printing out the high score which I only have one of it and is using the variable high score from the player class.
	 */
	public static void printHighScore() {
		System.out.println("|||Highscores|||");
		// This high score variable is being used in the player class and the HighScoreManager this is the score which loads up every time.
		System.out.println("1.) Score:"  + Player.highscore);
		System.out.println("2.) Score:");
		System.out.println("3.) Score:");
	}
/**
 * If the player health or boxer health is less than zero it will print out if you want to play again
 * Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects a and the boxer choice is 2 then this will happen
 * User's offense options are also stored in this method what the user selects to play against the boxer
 * It also prints out the boxer's health along with the player's health.
 * Also asking for which boxer they want to fight
 * This class also has the main game loop if the user enters y it will start up all the game, and its methods
 * It asks for the user if they want to play the game or not and input their name.
 * I call up the methods in this main method kicking of with load game method which has the high score and start credit screen and title.
 * @param args This is my main method which has the fight logic in it  between the boxer and the player class.
 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {	
		Scanner user_input = new Scanner(System.in);
		// This is using the method by calling up the class and using it from there
		HighScoreManager.loadGame();
		printStartCreditScreen();
		printTitle();
		// Creating a local variable in the method for the player
		String wantPlay;
		// asking the player if they want to play
		System.out.println("Want to play Knockout Kings? (y/n): ");
		wantPlay = user_input.next();

		// if the player chooses to play, it will let the game start the game
		// loop
		if (wantPlay.equalsIgnoreCase("y")) {
// Asking the user for the user's name that they want to enter
			System.out.println("What do you want your name to be?: ");
			Player.playerName = user_input.next();
// Instructions is being printed out after the user enters their name.
			System.out
					.println("|||||||||||||||||||||||||||||||Instructions||||||||||||||||||||||||||||||||");
			System.out
					.println("You will have three choices to make between your offense, and if you are lucky");
			System.out.println("what boxer would you like to fight? /n1.Rocky Balboa /n2.Mayweather /n3.Ronda Rousey");
			// Creating a local string playerInput for the user to pick which boxer they want to fight
			String playerInput;
			do {
			playerInput = user_input.next();
			} while(!(playerInput.equals("1") || playerInput.equals("2") || playerInput.equals("3")));
			// Setting the boxername to the playerInput
			String boxerName = getBoxerName(playerInput);
			// After the user picks which one they are going to be fighting it will print the remaining instructions with the boxername
			System.out
					.println("then you will be able to remove 10 health points off of "
							+ boxerName + ".\n");
			System.out
					.println("Hey folks!, we are going to have an exiting game today!");
			System.out.println("In the left corner, we have " + boxerName
					+ " !!!!!");
			System.out.println("and in the right corner, we have " + Player.playerName
					+ " !!!!!");
			System.out.println("");
			teamMembers();
		}
// Boxer health and player hea;th are being printed here as the game continues along 
		while (Boxer.boxerHealth > 0 && wantPlay.equalsIgnoreCase("y")) {

			System.out.println(Boxer.boxer + " has " + Boxer.boxerHealth
					+ " health remaining.");
			System.out.println("You have " + Player.playerHealth
					+ " health remaining.");
			// Creating a local variable for the action that the user selects three different options for offense 
			String action;
			System.out
					.println("What would you like to do? (a)Upper Cut (b)Hook (c)Jab: ");
			action = user_input.next();
			// a = 1 b = 2 c = 3
			Boxer.boxerChoice = Math.ceil(Math.random() * 4);
			Player.checkHealth();
// Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects a and the boxer choice is 2 then this will happen
			// It also runs the check health method and before and after also check score 
			if (action.equals("a") && Boxer.boxerChoice == 2) {
				Player.checkHealth();
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				System.out.println("OOHH! and " + Player.playerName
						+ " throws a devistating blow into " + Boxer.boxer + " !!!!");
				Boxer.boxerHealth -= 10;
				Player.checkHealth();
				Player.checkScore();
//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects a and the boxer choice is 3 then this will happen
			//// It also runs the check health method and before and after also check score 
			} else if (action.equals("a") && Boxer.boxerChoice == 3) {
				Player.checkHealth();
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				System.out.println("OH! " + Player.playerName + " JUST GOT SMASHED!");
				Player.playerHealth -= 10;
				Player.checkHealth();
				Player.checkScore();
			//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects b and the boxer choice is 3 then this will happen
			//// It also runs the check health method and before and after also check score 
			} else if (action.equals("b") && Boxer.boxerChoice == 3) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				Player.checkHealth();
				System.out.println(Boxer.boxer + " just got smashed!!!!");
				Boxer.boxerHealth -= 10;
				Player.checkHealth();
			//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects b and the boxer choice is 1 then this will happen	
			//// It also runs the check health method and before and after also check score 
			} else if (action.equals("b") && Boxer.boxerChoice == 1) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				Player.checkHealth();
				System.out
						.println(Player.playerName
								+ " better step up his/her game! Or we going to have to leave early folks!");
				Player.playerHealth -= 10;
				Player.checkHealth();
				//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects c and the boxer choice is 1 then this will happen	
			// It also runs the check health method and before and after also check score 
			} else if (action.equals("c") && Boxer.boxerChoice == 1) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				Player.checkHealth();
				System.out
						.println(Boxer.boxer
								+ " just got pucnhed so hard that he might not even know he exists!");
				Boxer.boxerHealth -= 10;
				Player.checkHealth();
				//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects c and the boxer choice is 2 then this will happen	
				// It also runs the check health method and before and after also check score
			} else if (action.equals("c") && Boxer.boxerChoice == 2) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				Player.checkHealth();
				System.out.println(Player.playerName + " Just got smashed!");
				Player.playerHealth -= 10;
				Player.checkHealth();
				//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects a and the boxer choice is 1 then this will happen	
				// It also runs the check health method and before and after also check score 
			} else if (action.equals("a") && Boxer.boxerChoice == 1) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				System.out.println("Refree has to back down " + Player.playerName
						+ " and " + Boxer.boxer + " !");
				//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects b and the boxer choice is 2 then this will happen	
				// It also runs the check health method and before and after also check score 
			} else if (action.equals("b") && Boxer.boxerChoice == 2) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				System.out.println("Refree has to back down " + Player.playerName
						+ " and " + Boxer.boxer + " !");
				//Checking if the user's actions and the boxer choice are equal or not if they are not we run this method so if the user selects c and the boxer choice is 3 then this will happen	
				// It also runs the check health method and before and after also check score 
			} else if (action.equals("c") && Boxer.boxerChoice == 3) {
				Player.checkScore();
				System.out.println("Current Score is " + Player.score);
				System.out.println("Refree has to back down " + Player.playerName
						+ " and " + Boxer.boxer + " !");

			}
			// Here it is checking if the boxer health or player health is less than zero 
			if (Boxer.boxerHealth <= 0 || Player.playerHealth <= 0) {
				String input = user_input.nextLine();
				// It's asking for the user if the want to play again 
				System.out.println("Do you want to play again?");
				// If the user writes yes or no it has specific options for it
				while (!input.equalsIgnoreCase("yes")
						&& !input.equalsIgnoreCase("no")) {
					System.out.println("Type Yes Or No");
					input = user_input.nextLine();
				}
				// If the user types in yea it prints out the money function the shop method check score save game print high score and their health back to 100
				if (input.equalsIgnoreCase("yes")) {
					Player.moneyFunction();
					Shop.shop();
					Player.checkScore();
					HighScoreManager.saveGame();
					printHighScore();
					Player.playerHealth = 100;
					Boxer.boxerHealth = 100;
					continue;
					// If no then only the health is not set back to 100 everything else runs the same
				} else if (input.equalsIgnoreCase("no")) {
					Player.moneyFunction();
					Shop.shop();
					Player.checkScore();
					HighScoreManager.saveGame();
					printHighScore();
					break;
				}
			}
		}

	}

}
