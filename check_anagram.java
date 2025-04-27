import java.util.*;

public class check_anagram {
    public static boolean are_anagram(String s1,String s2) {
        s1=s1.replace(" ","").toLowerCase();
        s2=s2.replace(" ","").toLowerCase();

        if(s1.length()!=s2.length()){
            return false;
        }
        char c1[] = s1.toCharArray();
        char c2[] = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1,c2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        if(are_anagram(s1, s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
}
