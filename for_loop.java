import java.util.Scanner;

public class for_loop {
    public static void main(String[] arge){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value : ");
        int num = sc.nextInt();
        for (int i=1;i<=10;i++){
            System.out.println(num+ "x" + i +  "=" + i*num);
        }
    }
}
