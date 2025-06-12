public class Class_Objects {
    static class Car {
        String Name = "Nissan Magnite";
        
        void GetCarDetails() {
            System.out.println("BS6");
        }
    }
    
    public static void main(String[] args) {
        Car MyObj = new Car();
        System.out.println(MyObj.Name);
        MyObj.GetCarDetails();
    }
}
