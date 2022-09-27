import java.util.*;
import mypack.reverse_string;
public class Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String();
        System.out.print("Enter a String: ");
        str = sc.nextLine();
        System.out.print("The reversed string is: "+reverse_string.ReverseIt(str));
        sc.close();
    }
}