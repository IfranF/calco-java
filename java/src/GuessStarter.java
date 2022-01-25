import java.util.Random;
import java.util.Scanner;

public class GuessStarter {

	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		// Generate random number
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		
		String startMessage = "I'm thinking of a number between 1 and 100 (including both).\r\n"
				+ "Can you guess what it is?";
		String askInput = "Type a number: ";
		int userInput;
		String randomMessage = "The number I was thinking of is: " + randomNumber;
		
		System.out.println(startMessage);
		//Ask user input
		System.out.print(askInput);
		userInput = in.nextInt();
		in.close();
		String guess = "Your guess is: " + userInput;
		System.out.println(guess);
		System.out.println(randomMessage);
		
		//Calculate distance between input and random
		int offBy = Math.abs(userInput - randomNumber);
		String guessWrong = "You were off by: " + offBy;
		String guessCorrect = "Your guess was correct!";
		
		//Display message depending on guess
		if (userInput != randomNumber) {
			System.out.println(guessWrong);
		} else {
			System.out.println(guessCorrect);
		}
		
	}

}
