public class adam {
    public static void main(String[] args) {
    int n=12;int rev1=0;int rev2=0;
    int sq=n*n;
    while(sq>0){
        rev1=rev1*10+sq%10;
        sq/=10;
    }
    int ans=(int)Math.sqrt(rev1);
    while(ans>0){
        rev2=rev2*10+ans%10;
        ans/=10;
    }
    if(rev2==n){
        System.out.println("Adam");
    }
    else{
        System.out.println("Not Adam");
    }
}
}
