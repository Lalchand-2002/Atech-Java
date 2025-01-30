public class casting {
    public static void main(String[] args){

        //Implicit casting(widening)
        byte num=5;
        short s=num;
        int i=num;
        long l=num;
        float f=num;
        double d=num;
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);
        System.out.println(s);

        //Explicit casting(Narrowing)
        double a=(int)5.999d;
        float b=(int)5.999f;
        System.out.println(a);
        System.out.println(b);
    }
}
