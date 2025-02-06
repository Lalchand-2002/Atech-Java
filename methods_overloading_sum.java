public class methods_overloading_sum {
    public static void main(String[] args) {
        sum(20,30,10);
        sum(20,40);
        sum(20.9f,30.4f,10.4f);
        sum(40.6f,6.4f);
    }
    public static int sum(int a,int b,int c){
        System.out.println(" The sum of three integer: " +(a+b+c));
        return 0;
    }
    public static int sum(int a,int b){
        System.out.println("The sum of two integer: " +(a+b));
        return 0;
    }
    public static int sum(float a,float b,float c){
        System.out.println("The sum of three float integer: " +(a+b+c));
        return 0;
    }
    public static int sum(float a,float b){
        System.out.println("The sum of two float integer: "+(a+b));
        return 0;
    }

}
