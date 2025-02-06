public class recursion {
    public static void main(String[] args) {
        int i= 5;
        System.out.println("factorial is " +factorial(i));
    }

    public static int factorial(int i) {
        if(i==0){
            return 1;
        }else {
            return i * factorial(i - 1);
        }
    }
}
