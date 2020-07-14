
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
/**
 * This class is basically for saving the game high score and load game for the score
 * @author 901083001
 * @version
 */
public class HighScoreManager {
	public static String fileName = "Highscore.dat";

	public static void saveGame() {
		PrintWriter outputStream = null;
		try {
			// Create a new file
			outputStream = new PrintWriter(new FileWriter(fileName));
			if (Player.score > Player.highscore) {
				Player.highscore = Player.score;
			} else {
				outputStream.println(Player.highscore);
			}
		} catch (IOException ex) {
			System.out.println(ex);
		}
		// Close the file if it is open
		if (outputStream != null) {
			outputStream.close();
		}

	}

	public static void loadGame() {
		// Open the file and read in the data
		BufferedReader inputStream = null;
		try {
			inputStream = new BufferedReader(new FileReader(fileName));
			Player.highscore = inputStream.read();
		} catch (FileNotFoundException ex) {
			System.out.println(ex);
		} catch (IOException ex) {
			System.out.println(ex);
		}
		// Close the file i f it's open
		if (inputStream != null) {
			try {
				inputStream.close();
			} catch (IOException ex) {
				System.out.println(ex);
			}
		}
	}

}

