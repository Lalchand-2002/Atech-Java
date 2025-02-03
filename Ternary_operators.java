import java.util.Scanner;

public class Ternary_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = sc.nextInt();
        String temp = age<18 ? "You are not elligible for driving license" : "You are elligible for driving license";
        System.out.println(temp);
    }
}
