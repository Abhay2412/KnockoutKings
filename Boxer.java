import java.util.Random;
/**
 * This is the class for the boxer is health and sets to 100 with a random choice for the boxer and  it's the name for it
 * @author 901083001
 * @version June 2018
 */

public class Boxer {
	// This is a string array for the boxers
	static String[] boxers = { "Rocky Balboa", "Mayweather", "Ronda Rousey" };
	// Has the boxer health
	static int boxerHealth = 100;
	// The boxer choice's for the offense for it
	static double boxerChoice = Math.ceil(Math.random() * 3);
	static Random random = new Random();
	static String boxer = boxers[new Random().nextInt(boxers.length)];

}