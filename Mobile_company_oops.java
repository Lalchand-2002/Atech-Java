public class Mobile_company_oops {
    public static void main(String[] args) {
        iqoo iq = new iqoo();
        iq.model="Iqoo Neo9 Pro 5G";
        iq.color="Conqueror Black";
        iq.processer="Snapdragon 8 Gen 2";
        iq.size= 6.78f;
        iq.battery=5160;
        iq.ram=12;
        iq.rom=256;
        iq.frontCamera=16;
        iq.camera=50;
        iq.display();
    }
}

class iqoo{
    String model;
    String color;
    String processer;
    float size;
    int battery;
    int ram;
    int rom;
    int frontCamera;
    int camera;


    void display(){
    System.out.println("Model: "+model);
    System.out.println("Color:"+color);
    System.out.println("CPU:"+processer);
    System.out.println("Screen Size: "+size+" Inches");
    System.out.println("Battery: "+battery+"mAh");
    System.out.println("RAM: "+ram+"GB");
    System.out.println("ROM: "+rom+"GB");
    System.out.println("Front Camera: "+frontCamera+"MP");
    System.out.println("Camera: "+camera+"MP");
  }
}
