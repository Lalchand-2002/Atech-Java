public class methods_overloading {
    public static void main(String[] args) {
      s(10,20);
      s(10.7,20.3);
      s("Hello"," World");
      s("its ",20);
    }

    public static void s(int a,int b) {
        System.out.println(a+b +" this is an integer Value");
    }
    public static void s(double a,double b){
        System.out.println(a+b +" this is an double Value");
    }

    public static void s(String a,String b) {
        System.out.println(a+b +" this is an string value");
    }

    public static void s(String a,int b) {
        System.out.println(a+b +" this is a string and integer Value");
    }
}
