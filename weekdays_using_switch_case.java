import java.util.Scanner;

public class weekdays_using_switch_case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
         switch (num){
             case 1:
                 System.out.println("Sunday");
                 break;
             case 2:
                 System.out.println("Monday");
                 break;
             case 3:
                 System.out.println("Tuesday");
                 break;
             case 4:
                 System.out.println("Wednesday");
                 break;
             case 5:
                 System.out.println("Thursday");
                 break;
             case 6:
                 System.out.println("Friday");
                 break;
             case 7:
                 System.out.println("Saturday");
                 break;
             default:
                 System.out.println("The number is invalid !!");
                 break;
         }

    }
}
