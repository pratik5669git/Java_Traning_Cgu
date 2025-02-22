public class pattern_rombus {
    public static void main(String[] args) {
        for(int i=1;i<=9;i++){
            for(int j=1;j<=9;j++){
                if(i+j==6 && i<=5 || i-j==4 && i>=6 || j-i==4 && j>=6 || i+j==14 && i>=6)
                    System.out.print("*");
            
                else
                    System.out.print(" ");
              }
              System.out.println(" ");
        }
}
}
