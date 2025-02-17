public class use_superclass {
    public static void main(String[] args) {
      chi c= new chi();
      c.display();
    }
}
class Pi{
    int i=10;
}
class chi extends Pi{
    int i=20;
    void display(){
        System.out.println(super.i);
    }
}