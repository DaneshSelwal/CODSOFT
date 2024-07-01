import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {

        // Details about the game.
        System.out.println();
        System.out.println("Description: This is the number game, you have to guess the number from 1 to 100 , if your guess matches to the selected number you will won.");
        System.out.println(" You have only 5 chances to guess the number.");

        // Addition of random and scanner class.
        Random random= new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println();
        int round=1;

        // A while loop which runs 5 times as for 5 rounds.
        while (round!=6) {
            System.out.println(String.format("Welcome to the Round %d." ,round));
            int guess=0;
            int score = 50;
            int generatedNumber= random.nextInt(100)+1;           //To generate a random number among 1 to 100.


            // A for loop to access the new guess input and match the guess with original number.
            for(int i =0; i < 5; i++){

                System.out.println();
                if(guess==generatedNumber){
                    System.out.println("Congratulations!! , you won 🎊🎊");break;
                }
                System.out.print("Enter your guess : ");
                guess=sc.nextInt();
                score-=10;

                if(guess<generatedNumber) {
                    if(guess>generatedNumber-10)System.out.println("Wrong, low guess..");
                    else System.out.println("Wrong, too low guess..");
                }

                if(guess>generatedNumber) {
                    if(generatedNumber+10>guess)System.out.println("Wrong, high guess..");
                    else System.out.println("Wrong, too high guess..");
                }
            }


            //Printing the result.
            System.out.println();
            if(guess!=generatedNumber) System.out.println(String.format("You lost, the correct number is %d.",generatedNumber));;
            System.out.println(String.format("Your round %d score is %d." ,round,score));
            round++;
            System.out.println();

            // Asking user that if he/she want to continue or not.
            System.out.println("Want to play another round then press (1), if not then press (0).");
            int exit = sc.nextInt();
            if(exit==0){
                System.out.println("Thanks for playing 😊😊.");
                break;
            }
        }
    }
}
