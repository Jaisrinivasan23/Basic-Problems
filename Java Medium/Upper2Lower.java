class Upper2Lower {
    public static void main(String[] args) {
        String str = ">AbCd^KZ";
        String res = "";
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch>='A' && ch<='Z'){
                res += (char)(ch+33); 
            }else if((ch>='a' && ch<='b')){
                res += (char)(ch-31);
            }else{
                res +=ch;
            }
        }System.out.println(res);
    }
}