import java.util.Scanner;

public class CharPattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(char ch='A';ch<'A'+i;ch++){
                System.out.print(ch);
            }System.out.println();
        }
    }
}
