abstract class Mobile{
    void voicecall(){
        System.out.println("We Make Voice Calls");
    }
    abstract void cameraPixel();
    abstract void DisplaySize();
}

class Vivo extends Mobile{
     void cameraPixel(){
        System.out.println("Vivo has 48Mp Camera");
     }
     void DisplaySize(){
        System.out.println("Vivo has 6.67' Inch Display");
     }
}

class Oppo extends Mobile{
     void cameraPixel(){
        System.out.println("Oppo has 64Mp Camera");
     }
     void DisplaySize(){
        System.out.println("Oppo has 5.7' Inch Display");
     }
}

public class AbstractExample {
    public static void main(String[] args) {
        Oppo op = new Oppo();
        op.DisplaySize();
    }
}
