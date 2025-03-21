public class sec_small {
        public static void main(String args[]){
            int arr[]={3,7,8,2,5,6,4};
            int s1=9,s2=9;
            for(int ele:arr){
                if(ele<s1){
                    s2=s1;
                    s1=ele;
                }
                else if(ele<s2){
                    s2=ele;
                }
            }
            System.out.println(s2);
        }
    }
    
