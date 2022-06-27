import java.util.*;
public class gcd{
public static void main(String[] args) {
   int grade;
   System.out.print("Enter the numbers: ");
   Scanner scanner= new Scanner(System.in);
   int a= scanner.nextInt();
   int b= scanner.nextInt();
   int i;
   int gcd=1;//prime no. ka gcd=1
   if(a>b)
       {
           for(i=2;i<=b;i++)
           {
               if(a%i==0 && b%i==0)
               {
                   gcd=i;
                   
               }
           }
       }
       else if(b>a)
       {
            for(i=2;i<=b;i++)
           {
               if(a%i==0 && b%i==0)
               {
                   gcd=i;
                 
               }
       }
       }
       System.out.println("The GCD of the numbers: " +gcd);
  }
}