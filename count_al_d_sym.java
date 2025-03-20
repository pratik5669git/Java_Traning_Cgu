public class count_al_d_sym {
    public static void main(String[] args) {
        char arr[]={'a','x','3','m','x','@','p','7','m','4','$'};
        int c1=0,c2=0,c3=0;
        for(char ch:arr){
            if(ch>='A'&& ch<='Z'||ch>='a'&& ch<='z'){
                c1++;
            }
            else if(ch>='0' && ch<='9'){
                c2++;
            }
            else{
                c3++;
            }
        }
        System.out.println("c1="+c1+" "+"c2="+c2+" "+"c3="+c3);
    }
}
