class CheckPalindrome {
    public static void main(String[] args) {
        System.out.println(Palindrome("sus"));
    }
    static String Palindrome(String str){
        String Rev = "";
        for(int i =str.length()-1;i>=0;i--){
            Rev+=str.charAt(i);
        }
        if(str.equals(Rev)){
            return "Palindrome";
        }else{
            return "Not Palindrome";
        }
    }
}