import java.util.Scanner;

public class NumPattern3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            for(int j=num-i;j<=num;j++){
                System.out.print(j);
            }System.out.println();
        }for(int i=1;i<=num;i++){
            for(int j=i+1;j<=num;j++){
                System.out.print(j);
            }System.out.println();
    }
}
}

// Sample Output 1

// 4
// 34
// 234
// 1234
// 234
// 34
// 4
