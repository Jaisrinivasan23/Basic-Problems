public class Fibinocci {
    public static void main(String[] args) {
        Fibinoccii(10);  
    }
    static void Fibinoccii(int Num){
        int a = 0;
        int b = 1;
        for(int i = 0;i<Num;i++){
            System.out.println(a);
            int c = a+b;
            a = b;
            b = c;
        }
    }
}
