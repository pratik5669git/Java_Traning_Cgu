public class sum_digit {
    public static void main(String[] args) {
        char arr[]={'a','x','3','m','x','@','p','7','m','4','$'};
        int sum=0;
        for(char x:arr){
            if(x>='0'&& x<='9'){
                sum=sum+(x-48);
            }
        }
        System.out.println("sum="+sum);
    }
}
