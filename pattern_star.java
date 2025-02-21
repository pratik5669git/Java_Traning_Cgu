public class pattern_star {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=13;j++){
                if(i+j==8 && i<=7 || i==7  || j-i==6 && j>=7 || i==3 || i-j==2 && i>=3 || i+j==16 && i>=3)
                    System.out.print("*");
            
                else
                    System.out.print(" ");
              }
              System.out.println(" ");
        }
}
}
