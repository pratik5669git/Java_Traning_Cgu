public class string_oper {
    public static void main(String[] args) {
        String s="coding";
        System.out.println(s.length());//to find the length
        System.out.println(s.charAt(0));//to find first char
        System.out.println(s.charAt(s.length()-1));//to find last char
        System.out.println(" ");
        //print each character
        for(int i=0;i<=s.length()-1;i++){
            System.out.print(s.charAt(i)+" ");
        }
    }
}
