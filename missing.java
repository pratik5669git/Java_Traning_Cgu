public class missing {
    public static void main(String[] args) {
        int arr[]={9,6,4,2,3,5,7,0,1};
        int s1=0;
        for(int ele:arr){
            s1+=ele;
        }
        int s2=0;
        for(int i=1;i<=arr.length;i++){
            s2+=i;
        }
        System.out.println(s2-s1);
    }
}
