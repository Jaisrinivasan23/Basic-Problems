import java.util.Scanner;

public class BasicPattern5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
}
}
// This code prints a pattern of numbers in increasing order for each row.
// For example, if the input is 5, the output will be:  
// 1
// 12
// 123
// 1234
// 12345
