public class use_of_super_in_constructor{
    public static void main(String[] args) {
        P c=new child();
    }
}
class P{
    P(){
        System.out.println("P");
    }
}
class child extends P{
    child(){
        super();
        System.out.println("child");

    }
}