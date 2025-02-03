import java.util.Scanner;

public class nexted_ternary_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = sc.nextInt();
        String res = num<=10 ? num<=5 ? "Yes num is less then 5 " : "No num is not less then 5" :
                "Num is greter then 10";
        System.out.println(res);
    }
}
