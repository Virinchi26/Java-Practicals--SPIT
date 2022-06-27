import java.util.*;
public class grade
{
public static void main(String[] args) {
   int grade;
   Scanner scanner= new Scanner(System.in);
        do{
            System.out.print("Enter the percentage of the student: ");
            int perc = scanner.nextInt();
            if(perc>=75) {
                System.out.println("Grade: Distinction");
            } else if(perc>=60) {
                System.out.println("Grade: First Class");
            } else if(perc>=45) {
                System.out.println("Grade: Second Class");
            } else {
                System.out.println("Grade: Fail");
            }
            System.out.println("Do you want to continue? (y=1/n=0)");
        }while(scanner.nextInt()!=0);
    }
}
