import java.util.Scanner;

public class BasicPattern7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
}
