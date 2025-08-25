class CharCount {
    public static void main(String[] args) {
        String str = "a1b10";
        StringBuilder sr = new StringBuilder();
        for(int i=0;i<str.length();){
            char letter = str.charAt(i);
            i++;
            StringBuilder sb = new StringBuilder();
            while(i < str.length() && Character.isDigit(str.charAt(i))){
                sb.append(str.charAt(i));
                i++;
            }
            int num = Integer.parseInt(sb.toString());
            for(int j=0;j<num;j++){
                sr.append(letter);
            }
        }
        System.out.println(sr);
    }
}