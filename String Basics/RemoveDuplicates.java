class CountVowels {
    public static void main(String[] args) {
        System.out.println(RemoveDuplicates("Jaii"));
    }
    static String RemoveDuplicates(String str){
       String result="";
       for(int i=0;i<str.length();i++){
           char ch = str.charAt(i);
           boolean found = false;
           for(int j=0;j<result.length();j++){
               if(ch==result.charAt(j)){
                   found = true;
                   break;
               }
           } 
           if(found == false){
               result+=ch;
           }
       }return result;
    }
}