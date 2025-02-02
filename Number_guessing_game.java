import java.util.Random;
import java.util.Scanner;

public class Number_guessing_game {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        Random num= new Random();
        int a= num.nextInt(100);
        int userInput=0;

        boolean matched=false;
        System.out.println("welcome to numer gussing game?");
        while (!matched){
            System.out.print("Enter your number: ");
            userInput= sc.nextInt();
            if(userInput<a){
                System.out.println("your number is Incorrect!! ");
                System.out.println("Please Enter big number: ");
            } else if (userInput>a) {
                System.out.println("your number is Incorrect!!");
                System.out.println("Please Enter small number: ");
            } else {
                System.out.println("Congratulation...You are win!!");
                matched=true;
            }

        }

    }
}