import java.util.*;
class line{
    double x=1,x1,y1,x2,y2;
    double m,c;
    line(double m, double c){
       this.m=m;
       this.c=c;
       System.out.printf("y=%.0fx+%.0f",m,c);
       System.out.println("");
       System.out.printf("Value of y=%.0f at x=%.0f",m*x+c,x);
       
    }
     line(double m, double x1, double y1){
       this.m=m;
       this.x1=x1;
       this.y1=y1;
       System.out.printf("Line eq: y-%.0f=%.0f(x - %.0f)\n",y1,m,x1);
       System.out.printf("Value of y=%.0f at x=%.0f", (m*(x-x1))-y1, x);
    }
     line(double x1, double y1, double x2, double y2){
        this.x1=x1;
        this.y1=y1;
        this.x2=x2;
        this.y2=y2;
        System.out.printf("Line eq: y - %.0f/(%.0f-%.0f)= (x- %.0f)/( %.0f- %.0f)\n" ,y1,y1,y2,x1,x1,x2);
         System.out.printf("Value of y = %.0f at x=%.0f", ((m*(x-x1)*(y1-y2))/(x1-x2))+y1,x);
    }
    public static void main( String[] args){
        Scanner scan= new Scanner(System.in);
        int option,flag;
        double x1,y1,x2,y2,m,c;
        while(true) {
            System.out.println("\n 1) Slope-y-intercept form:  \n 2)Slope point form: \n 3)Two-point form: ");
            System.out.print("Enter the option you want: ");
            option = scan.nextInt();
            switch(option) {
                case 1:    
                    System.out.print("Enter slope: ");
                    m= scan.nextDouble();
                    System.out.print("Enter constant: ");
                    c= scan.nextDouble();
                    line l1= new line(m,c);
                break;

                case 2:
                     System.out.print("Enter slope: ");
                     m= scan.nextDouble();
                    System.out.print("Enter X1& Y1 Co-ordinate: ");
                    x1= scan.nextDouble();
                    y1= scan.nextDouble();
                    line l2= new line(m,x1,y1);
                    break;

                case 3:
                    System.out.print("Enter X1& Y1 Co-ordinate: ");
                    x1= scan.nextDouble();
                    y1= scan.nextDouble();
                    System.out.print("Enter X2& Y2 Co-ordinate: ");
                    x2= scan.nextDouble();
                    y2= scan.nextDouble();
                    line l3= new line(x1,y1,x2,y2);
                    break;
                   
                    default:
                            System.out.println("Invalid choice ");
                            break;

            }
                System.out.println("");
             System.out.println("Do you want to continue?(yes=1/0=no)");
            flag = scan.nextInt();
            if(flag==0) {
                break;
            }                          
        }
    }
}
