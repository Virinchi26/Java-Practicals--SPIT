import java.util.*;
abstract class Marks{
    abstract double getPercentage();

}
class A extends Marks{
      double sub1, percentage;
double sub2;
double sub3;
A(double sub1, double sub2, double sub3) {
this.sub1 = sub1;
this.sub2 = sub2;
this.sub3 = sub3;
}
double getPercentage() {
percentage = (sub1 + sub2 + sub3)/3;
return percentage;
}
}
class B extends Marks{
double sub1, percentage;
double sub2;
double sub3;
double sub4;
B(double sub1,double sub2,double sub3,double sub4) {
this.sub1 = sub1;
this.sub2 = sub2;
this.sub3 = sub3;
this.sub4 = sub4;
}
double getPercentage() {
percentage = (sub1 + sub2 + sub3 + sub4)/4;
return percentage;
}
}

public class student{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        while(true){
           
            System.out.print("Enter the Student name:\n 1)Student A\n 2) Student B\n");
            int option=scan.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter marks for 1st subject: ");
                    int A1=scan.nextInt();
                    System.out.print("Enter marks for 2nd subject: ");
                    int A2=scan.nextInt();
                    System.out.print("Enter marks for 3rd subject: ");
                    int A3=scan.nextInt();
                    Marks studentA = new A(A1, A2, A3);
                    double p1 = studentA.getPercentage();
                    System.out.println("Percentage of A : " + p1);
                    break;
                case 2:
                    System.out.print("Enter marks for 1st subject: ");
                    int B1=scan.nextInt();
                    System.out.print("Enter marks for 2nd subject: ");
                    int B2=scan.nextInt();
                    System.out.print("Enter marks for 3rd subject: ");
                    int B3=scan.nextInt();
                    System.out.print("Enter marks for 4th subject: ");
                    int B4=scan.nextInt();
                    Marks studentB = new B(B1, B2, B3, B4);
                    double p2 = studentB.getPercentage();
                    System.out.println("Percentage of B : " + p2);
                    break;
                default:
                    System.out.print("Invalid option");            
            }  
            System.out.print("Press '1' to continue or '0' to exit: ");
            int flag=scan.nextInt();
            if(flag==0){
            break;
            }  
       
    }
    }
   }
