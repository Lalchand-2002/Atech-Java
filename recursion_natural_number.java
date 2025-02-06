import java.util.Scanner;

public class recursion_natural_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int a = sc.nextInt();
        System.out.println("The natural is "+natural(a));
    }
    public static int natural(int a) {
       if(a==0){
           return 0;
       }else {
           return a+natural(a-1);
       }
    }
}
