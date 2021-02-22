import java.util.Random;
import java.util.Scanner;

public class MagicEightBall {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);

		System.out.println("Ask the magic eight ball a yes or no question!");
		String question = keyboardInput.nextLine();

		int randomNumber = new Random().nextInt(5);
		String answer = "";
		
		switch (randomNumber) {
			case 0:
				answer = "Yes";
				break;
			case 1:
				answer = "No";
				break;
			case 2:
				answer = "Definitely";
				break;
			case 3:
				answer = "Doubtful";
				break;
			default:
				answer = "Please try again later";
				break;
		}
		System.out.println("The answer to your question of " + question + " is: " + answer + ".");
	}
}
