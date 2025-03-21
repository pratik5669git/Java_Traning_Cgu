public class sec_big {
    public static void main(String args[]){
        int arr[]={3,7,8,2,5,6,4};
        int b1=0,b2=0;
        for(int ele:arr){
            if(ele>b1){
                b2=b1;
                b1=ele;
            }
            else if(ele>b2){
                b2=ele;
            }
        }
        System.out.println(b2);
    }
}
