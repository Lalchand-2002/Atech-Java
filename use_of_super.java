public class use_of_super {
    public static void main(String[] args) {
     cs s=new cs();
     s.m();
    }
}
class p{
    void m(){
        System.out.println("I am class P");
    }
}
class cs extends p{
    @Override
    void m(){
        super.m();
        System.out.println("I am class Cs");
    }
}