public class third_max {
    public static void main(String[] args) {
            int[] nums={3,2,1};
            int max1 = 0, max2 = 0, max3 = 0;
            for (int n : nums) {
                if (n == max1 || n == max2 || n == max3)
                    continue;
    
                if (max1 == 0 || n > max1) {
                    max3 = max2;
                    max2 = max1;
                    max1 = n;
                } else if (max2 == 0 || n > max2) {
                    max3 = max2;
                    max2 = n;
                } else if (max3 == 0 || n > max3) {
                    max3 = n;
                }
            }
            if(max3 == 0){
                System.out.println(max1);
            }
            else{
                System.out.println(max3);
            }
        }
    }
