class CountVowels {
    public static void main(String[] args) {
        Count("Jaii");
    }
    static void Count(String str){
       int Vowles = 0;
       int Consonants = 0;
       for(int i = 0;i<str.length();i++){
           char ch = str.charAt(i);
           if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
               Vowles++;
           }else{
               Consonants++;
           }
       }
       System.out.println("Vowles:"+Vowles);
       System.out.println("Consonants:"+Consonants);
    }
}
