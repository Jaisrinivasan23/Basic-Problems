import java.io.*;
import java.util.*;

public class StartPattern2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }System.out.println();
        }for(int i=1;i<=num-1;i++){
            for(int j=1;j<=num-i;j++){
                System.out.print(j);
            }System.out.println();
        }
    }
}

// Sample Output 1

// 1
// 12
// 123
// 1234
// 123
// 12
// 1