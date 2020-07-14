import java.util.Scanner;

/**
 * This class is for the shop if the user has enough money they can buy drinks and gears for the some certain amount of money 
 * This shop is only available for when the user presses no or yes when they are asked if they want to play again.
 * @author 901083001
 * @version June 2018
 */
public class Shop {
	static String commandShop;
	@SuppressWarnings("resource")

	 public static void shop() {
			do {
				Scanner console = new Scanner(System.in);
				System.out
						.print("----------------------------\nWhat do you want to"
								+ " shop for? | Drinks | Gloves | Leave |\n"
								+ "Choice: ");
				commandShop = console.next();
				System.out.println();
				if (commandShop.equalsIgnoreCase("Drinks")) {
					System.out.println("What do you want to buy? \n");
					System.out.println("Press 1 for Powerade $10 \n");
					System.out.println("Press 2 for Apple Juice $20 \n");
					System.out.println("Press 3 for Gatorade $45 \n");
					System.out.println("Choice: ");
					Player.commandBuy = console.nextInt();
					System.out.println();
					if (Player.commandBuy == 1 && Player.money >= 10) {
						Player.powerade++;
						Player.items++;
						Player.money = Player.money - 10;
						Player.checkInventory();
						System.out.println("You now have: $" + Player.money + "!\n");
					}
					if (Player.commandBuy == 2 && Player.money >= 20) {
						Player.appleJuice++;
						Player.items++;
						Player.money = Player.money - 20;
						Player.checkInventory();
						System.out.println("You now have: $" + Player.money + "!\n");
					}
					if (Player.commandBuy == 3 && Player.money >= 45) {
						Player.gatorade++;
						Player.items++;
						Player.money = Player.money - 45;
						Player.checkInventory();
						System.out.println("You now have: $" + Player.money + "!\n");
					} else if(Player.money <= 0) {
						System.out.println("You do not have the required money need to buy this drink!");
					}
				}
				if (commandShop.equalsIgnoreCase("Gloves")) {
					System.out.println("What do you want to buy? \n");
					System.out.println("Press 1 for Head Banger $15 \n");
					System.out.println("Press 2 for Big Hitter $50 \n");
					System.out.println("Press 3 for Knockout Glove $65 \n");
					System.out.println("Choice: ");
					commandShop = console.next();
					System.out.println();
					if (Player.commandBuy == 1 && Player.money >= 15) {
						Player.headBanger++;
						Player.items++;
						Player.money = Player.money - 15;
						Player.checkInventory();
						System.out.println("You now have: $" + Player.money + "!\n");
					}
					if (Player.commandBuy == 2 && Player.money >= 50) {
						Player.bigHitter++;
						Player.items++;
						Player.money = Player.money - 50;
						Player.checkInventory();
						System.out.println("You now have: $" + Player.money + "!\n");
					}
					if (Player.commandBuy == 3 && Player.money >= 65) {
						Player.knockoutGlove++;
						Player.items++;
						Player.money = Player.money - 65;
						Player.checkInventory();
						System.out.println("You now have: $" + Player.money + "!\n");
					} else if(Player.money <= 0) {
						System.out.println("You do not have the required money need to buy this item!");
					}
				}
			} while (!commandShop.equalsIgnoreCase("Leave"));
		}
}