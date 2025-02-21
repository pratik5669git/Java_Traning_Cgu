class prime {
    public static void main(String[] args) {
        int n=321875;
        while(n!=0){
            int count=0;
            int d=n%10;
            for(int i=1;i<=d;i++){
                if(d%i==0)
                    count++;
            }
            if(count==2)
                System.out.println("Prime="+d);
            n/=10;
        }
    }
}