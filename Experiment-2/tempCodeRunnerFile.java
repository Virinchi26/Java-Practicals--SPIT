import java.util.*;
import java.lang.Math;
 
public class bank{
    Scanner scan=new Scanner(System.in);
    double bal;
    double r;
bank(){
    bal=1000;
    r= 3.0;
}

void deposit(){
System.out.print("Enter the deposit amount: ");
int deposit= scan.nextInt();
    if(deposit>0)
    {
        bal= bal+ deposit;
        System.out.print("Depsoit amount = " +bal);
    }
    else{
        System.out.print("Enter a valid deposit amount");
        }
}
void withdraw(){

System.out.print("Enter the withdrawing amount: ");
int withdrawAmount= scan.nextInt();
        if(withdrawAmount > bal)
        {
            System.out.println("InValid Withdrawal Amount");
        }else{
            bal = bal- withdrawAmount;
            System.out.println("Please Collect your " + withdrawAmount +" Rupees");
            System.out.println(" ");
            System.out.println("Available Balance: " +bal);
            System.out.println(" ");
        }

}
void Comp_Int(){

        System.out.print("Enter the time in years for which CI is to be calculated: ");
        int time = scan.nextInt();
        double amount = bal*Math.pow(1 + r/100,time);
        System.out.println("Amount after Compound Interest = Rs "+amount);

}

public static void main(String[] args){
Scanner scan=new Scanner(System.in);
bank ob = new bank();
System.out.println("Welcome to Banking System:");
    while(true) {
System.out.println(" 1)To make deposit \n 2)To withdraw an amount for the balance\n 3)To find compound interest based on the rate of interest");
System.out.print("Enter the option you want: ");
int option=scan.nextInt();
int flag;
switch (option){

case 1:
        ob.deposit();
        break;
case 2:
        ob.withdraw();
        break;
case 3:
        ob.Comp_Int();
        break;
default:
        System.out.println("Invalid Option");
        break;

            }
            System.out.println("");
            System.out.println("Do you want to continue?(yes=1/no=0)");
            flag = scan.nextInt();
            if(flag==0) {
                break;
        }     
     }
  }
}