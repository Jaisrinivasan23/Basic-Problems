import java.util.*;

public class BasicPattern1
 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int num = in.nextInt();
            for(int i=0;i<num;i++){
                for(int j=0;j<num;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}