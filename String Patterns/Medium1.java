import java.util.Scanner;

public class Medium1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=i;j<=num;j++){
                System.out.print(i);
            }System.out.println();
        }
}
