import java.util.Scanner;
import java.util.InputMismatchException;
public class exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
        System.out.print("Enter 2 nums: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a/b;
        System.out.println("Result: "+c);
    }
    catch(InputMismatchException e){
        System.out.println("Exception : Invalid input given");
    }
    catch(ArithmeticException e1){
        System.out.println("Exception : cannot divide by zero");
    }
}
}
