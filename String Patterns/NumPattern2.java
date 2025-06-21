import java.util.Scanner;

public class NumPattern2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
            }System.out.println();
        }
    }
}

// Sample Output 1

// 4
// 44
// 444
// 4444