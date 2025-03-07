public class array_swap_adj {
    public static void main(String[] args) {
        int arr[]={3,7,8,2,5,6,4};
        int x=3;
        int y=x+1;
        if((x>=0 && x<= arr.length-1) && (y>=0 && y<=arr.length-1)){
            int temp=arr[x];
            arr[x]=arr[y];
            arr[y]=temp;

            for(int z:arr){
                System.out.print(z+" ");
            }
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}
