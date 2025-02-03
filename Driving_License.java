import java.util.Scanner;

public class Driving_License {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        if (age>=18){
            System.out.println("Yes you are elligible for driving license!!!");
        } else {
            int remaining_age = 18-age;
            System.out.println("No you are not elligible for driving license!!");
            System.out.println("you hove wait for " +  remaining_age + " years");
        }
    }
}
