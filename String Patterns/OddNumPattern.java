import java.util.Scanner;

public class OddNumPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=0;i<num;i++){
            for(int j=1;j<=(2*i)+1;j++){
                System.out.print("*");
            }System.out.println();
        }
    }

}


// Sample Output 1
// 4
// *
// ***
// *****
// *******