public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }System.out.println();
        }

//output
// 1
// 22
// 333
// 4444
// 55555