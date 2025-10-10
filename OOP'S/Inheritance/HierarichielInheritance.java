package Inheritance;
class Shape{
    float length,breadth,radius;
}

class rect extends Shape{
    public rect(float len,float bre){
        length = len;
        breadth = bre;
    }

    public void area(){
         System.out.println(length*breadth);
    }
}

class circle extends Shape{
    public circle(float rad){
        radius = rad;
    }

    public void area(){
         System.out.println(3.14*radius*radius);
    }
}

public class HierarichielInheritance {
     public static void main(String[] args) {
        rect Rect = new rect(2, 10);
        Rect.area();
        
     }
}