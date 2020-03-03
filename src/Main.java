import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("""
                           Hello! What is your name?
                           """);
        String name = input.nextLine();
        int num = 0;
        System.out.println(String.format("Well, %s, I am thinking of a number between 1 and 20.",name));
        boolean isRight = false;
        boolean isDone = false;
        int count = 1;
        int guess = 0;
        String done = "y";
        do{
            num = rand.nextInt(20) + 1;
            count = 1;
            isRight = false;
            while(!isRight && count <= 6) {
                System.out.println("Take a guess.");
                guess = input.nextInt();
                if(guess > num) {
                    System.out.println("Your guess is too high.");
                    count++;
                }
                else if(guess < num) {
                    System.out.println("Your guess is too low.");
                    count++;
                }
                else {
                    System.out.println(String.format("Good job, %s! You guessed my number in %s guesses!", name, count));
                    isRight = true;
                }
            }
            if(!isRight)System.out.println(String.format("I'm sorry, %s, you have run out of guesses.", name));
            System.out.println("Would you like to play again? (y or n)");
            done = input.nextLine();
            done = input.nextLine();
        } while(done.equalsIgnoreCase("y"));
    }
}
