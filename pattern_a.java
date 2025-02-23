public class pattern_a {
    public static void main(String[] args) {
        for(int i=1;i<6;i++){
            for(int j=1;j<11;j++){
                if(i+j==7 || j-i==5 || i==4 && i+j==9 || i==4 && i+j==11)
                    System.out.print("*");
            
                else
                    System.out.print(" ");
              }
              System.out.println(" ");
        }
}
}
