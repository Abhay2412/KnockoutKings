import java.util.Scanner;

/**
 * This class has all of the variables that the player holds including their health and their name and everything attached to it
 * It also has the checkHealth which checks if the boxer health is less than or equal to zero it will print that the user wins the opposite for the player
 * It also has money function which sets money to 250
 * It also has checkInventory which is used in my shop class
 * Also score if the boxer health is equal to zero then the player's score goes up by 24 
 * @author 901083001
 *@version June 2018
 */

public class Player {
	static Scanner input = new Scanner(System.in);

	static int playerHealth = 100;
	static int money = 0;
	static int score = 0;
	static int commandBuy;
	static int powerade = 0;
	static int appleJuice = 0;
	static int gatorade = 0;
	static int items = 0;
	static int headBanger = 0;
	static int bigHitter = 0;
	 static int knockoutGlove = 0;
	 static String playerName;
	 static int highscore = 0;
// Player health and the boxer health is being checked in this method 
	public static void checkHealth() {
		if (Boxer.boxerHealth <= 0) {
			System.out.println("We have a winner and it is " + playerName
					+ " wins!");
		} else if (playerHealth <= 0) {
			System.out.println(playerName + " has fallen! " + Boxer.boxer
					+ " wins!");

		}
	}
// This is a non void method which returns an integer money and sets it to 250
	public static int moneyFunction() {
		if (playerHealth > 0) {
			money = 250;
		}
		System.out.println("You have earned this much $" + money + ". \n");
		return money;
	}
// This method is all the player's gears and drinks being printed out in the shop when the user buys something
	public static void checkInventory() {
		System.out.println("You have this much of Apple Juice: " + appleJuice);
		System.out.println("You have this much of Powerade: " + powerade);
		System.out.println("You have this much of Gatorade: " + gatorade);
		System.out.println("You have this much of Head Banger: " + headBanger);
		System.out.println("You have this much of Big Hitter: " + bigHitter);
		System.out.println("You have this much of Knockout Gloves: " + knockoutGlove);

	}
// The checkScore is for the setting the player's score to 24 if the player wins and the boxer health is equal to 0
	public static int checkScore() {
		if (Boxer.boxerHealth == 0)
			score += 24;
		return score;
	}
	
	}


