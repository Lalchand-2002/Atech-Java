public class oops {
    public static void main(String[] args) {
        car c1=new car();
        c1.model="BE6";
        c1.color="blue";
        c1.launchYear= 2024;
        c1.display();
    }
}
class car{
    String model;
    String color;
    int launchYear;
void display(){
    System.out.println("Model: "+model+" color: "+color+" launch in:"+launchYear);
}

}