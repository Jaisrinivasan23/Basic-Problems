import java.util.Scanner;

public class Number2Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }System.out.println();
        }
        for(int i=1;i<=num;i++){
            for(int j=num-i;j>=1;j--){
                System.out.print(j);                
            }
            System.out.println();
        }
    }
}
