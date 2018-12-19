package efrinrockpaperscissorshw;

import java.util.Random;
import java.util.Scanner;


public class EfrinRockPaperScissorsHW {
    
    public static Scanner input = new Scanner(System.in);
    public static Random rand = new Random();
    public static int compScore = 0;
    public static int userScore = 0;
    
    public static void main(String[] args) {
        System.out.println("ROCK PAPER SCISSORS LIZARD SPOCK");
        for (;;) {
            method2();
        }
    }
    public static void method2(){    
        int computerPick = rand.nextInt(5)+1;
        
        System.out.println("What do you choose?\n1.Rock\n2.Paper\n3.Scissors\n4.Lizard\n5.Spock\n6.End Game");
        int userPick = input.nextInt();
        
        if(userPick > 6 || userPick < 1){
            System.out.println("Invalid input, please try again.");
        }
        if (userPick == computerPick) {
            if (computerPick == 1) {
                System.out.println("You both chose Rock, it's a tie!");
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 2) {
                System.out.println("You both chose Paper, it's a tie!");
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 3) {
                System.out.println("You both chose Scissors, it's a tie!");
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 4) {
                System.out.println("You both chose Lizard, it's a tie!");
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 5) {
                System.out.println("You both chose Spock, it's a tie!");
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
        }
        if (userPick == 1) {
            if (computerPick == 2) {
                System.out.println("Computer chose Paper, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 3) {
                System.out.println("Computer chose Scissors, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 4) {
                System.out.println("Computer chose Lizard, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 5) {
                System.out.println("Computer chose Spock, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }           
        }
        if (userPick == 2) {
            if (computerPick == 1) {
                System.out.println("Computer chose rock, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 3) {
                System.out.println("Computer chose Scissors, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 4) {
                System.out.println("Computer chose Lizard, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 5) {
                System.out.println("Computer chose Spock, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
        }
        if (userPick == 3) {
            if (computerPick == 1) {
                System.out.println("Computer chose rock, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 2) {
                System.out.println("Computer chose Paper, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 4) {
                System.out.println("Computer chose Lizard, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 5) {
                System.out.println("Computer chose Spock, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println(userScore);
            }
        }
        if (userPick == 4) {
            if (computerPick == 1) {
                System.out.println("Computer chose rock, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 2) {
                System.out.println("Computer chose Paper, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 3) {
                System.out.println("Computer chose Scissors, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 5) {
                System.out.println("Computer chose Spock, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
        }
        if (userPick == 5) {
            if (computerPick == 1) {
                System.out.println("Computer chose rock, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 2) {
                System.out.println("Computer chose Paper, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 3) {
                System.out.println("Computer chose Scissors, you win!");
                userScore = userScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
            if (computerPick == 4) {
                System.out.println("Computer chose Lizard, you lose!");
                compScore = compScore + 1;
                System.out.println("Computer: " + compScore);
                System.out.println("User: " + userScore);
            }
        }
        if (userPick == 6) {
            System.exit(0);
        }
        
        
        
        
        
    }
    
}
