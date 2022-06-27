//find the prime numbers in an given range
import java.util.*;

public class prime {
    public static int FindPrime(int n) {
        if (n == 0 || n == 1) {
            return 0;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        prime obj = new prime();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the lower range of the prime number: ");
        int lower = scanner.nextInt();
        System.out.print("Enter the upper range of the prime number: ");
        int upper = scanner.nextInt();
        int count = 0;
        for (int i = lower; i <= upper; i++) {
            if (obj.FindPrime(i) == 1) {
                System.out.print(i + " ");
                count++;
            }

        }
        System.out.println("\nNo. of prime numbers: " + count);

    }
}