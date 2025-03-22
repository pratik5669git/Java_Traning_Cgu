public class leader_ele {
    public static void main(String[] args) {
        int arr[]={10,9,14,23,15,0,9};
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.println(arr[i]);
            }
        }
    }
}