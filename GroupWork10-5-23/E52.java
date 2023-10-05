import java.util.Scanner;
public class E52 {
    
    public static void main(String[] args){
        boolean isCorrect = false;
        Scanner input = new Scanner(System.in);
        int userGuess;
        int randNum =(int) (1000.0 * Math.random());
        while(!isCorrect){
            System.out.println("Guess a number between 0 and 1000");
            userGuess = input.nextInt();
            if(userGuess > randNum){
                System.out.println("Your number is too high");
            }else if(userGuess < randNum){
                System.out.println("Your number is too low ");
            }
            if(userGuess == randNum){
                System.out.println("Thats Correct!");
                isCorrect = true;
            }
        }

    }
}
