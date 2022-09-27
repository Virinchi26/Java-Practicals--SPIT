import java.util.Scanner;
import mypack2.*;
public class StackC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the stack: ");
        int size = sc.nextInt();
        Stack s = new Stack(size);
        int flag,choice;
        while(true) {
            System.out.println("Select 1 Operation:\n 1) Push\t\t 2) Pop\n 3) Peek\t\t 4) Size");
            choice = sc.nextInt();
            switch(choice) {
                case 1:
                    System.out.print("Enter the element to be pushed: ");
                    int e = sc.nextInt();
                    s.push(e);
                    break;
                case 2:
                    s.pop();
                    break;
                case 3:
                    if(s.peek()!=-1) {
                        System.out.println("The top element is: "+s.peek());
                    }
                    break;
                case 4:
                    System.out.println("The size of the stack is: "+s.size());
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            
            System.out.print("Press '1' to continue or '0' to exit: ");
            flag = sc.nextInt();
            if(flag == 0) {
                break;
            }
        }
        sc.close();
    }
}