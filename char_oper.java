public class char_oper {
    public static void main(String[] args) {
        char arr[]={'a','x','3'};
        System.out.println(arr.length);//to find length 
        System.out.println(arr[0]);// to find first value
        System.out.println(" ");
        for(char x:arr){
            System.out.println(x);//to print all elements
        }
        System.out.println(" ");
        //for reverse order
        for(int i=arr.length-1;i>=0;i--){
            System.out.println(arr[i]);
        }
        System.out.println(" ");
        //display only alphabets in the array
        for(char al:arr){
            if(al>='A'&& al<='Z'||al>='a' && al<='z'){
                System.out.print(al+" ");
            }
        }

    }
}
