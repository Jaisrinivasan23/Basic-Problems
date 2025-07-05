public class FindingUpper {
        public static void main(String[] args) {
        String str = "JaIi1srinivasan";
        String cons = "";
        int count = 0;
    
    for(int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if(ch>='0'&&ch<='9'){
            break;
        }cons+=ch;
    }System.out.println(cons);
    for(int i = 0;i<cons.length();i++){
        char ch = cons.charAt(i);
        if(ch>='A' && ch<='Z'){
            count++;
        }
    }System.out.println(count);
    }
}
