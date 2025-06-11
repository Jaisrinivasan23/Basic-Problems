class StringReverse {
    public static void main(String[] args) {
        System.out.println(Reverse("Jaii"));
    }
    static String Reverse(String str){
        String Rev = "";
        for(int i =str.length()-1;i>=0;i--){
            Rev+=str.charAt(i);
        }
        return Rev;
    }
}