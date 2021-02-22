import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Ask the magic eight ball a yes or no question!");
		String question = keyboardInput.nextLine();

		int randomNumber = new Random().nextInt(5);
		String answer = "";

		if (randomNumber == 0) {
			answer = "Yes";
		} else if (randomNumber == 1) {
			answer = "No";
		} else if (randomNumber == 2) {
			answer = "Definitely";
		} else if (randomNumber == 3) {
			answer = "Doubtful";
		} else {
			answer = "Maybe";
		}

		System.out.println("The answer to your question of " + question + " is: " + answer + ".");
	}
}






