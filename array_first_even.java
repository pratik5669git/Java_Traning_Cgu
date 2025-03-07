public class array_first_even {
    public static void main(String[] args) {
        int arr[]={3,7,8,2,5,6,4};
        for(int x: arr){
            if(x%2==0){
                System.out.println(x);
                break;
            }
        }
    }
}
