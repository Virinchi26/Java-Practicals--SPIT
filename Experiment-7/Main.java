import java.util.*;
class Westside{
    static int clothes = 10;
    static int accessories = 10;
    void reduce_clothes(int n){
        clothes = clothes-n;
    }
    void reduce_accessories(int m){
        accessories = accessories - m;
    }
}
abstract class Payment{
    abstract void payment_details();
}

class cashpayment extends Payment{
    static int balance;
    cashpayment(){
         balance =25000;
    }
    void reduce_cash(int n){
        balance = balance - n;
    }
    void payment_details(){
        System.out.println("Amount "+(25000-balance) +" Paid in cash, balance : "+this.balance);
    }
    int cash_balance(){
        return balance;
    }
}

class CreditCardPayment extends Payment{
    String cardname;
    int cardnumber;
    static int balance;
    CreditCardPayment(){
        balance = 25000;
    }
    void get_details(){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter Card name:");
        cardname = sc.next();
        System.out.println("Enter card number:");
        cardnumber = sc.nextInt();
    }
    void reduce_card(int n){
        balance = balance - n;
    }
    void payment_details(){
        System.out.println("Amount $"+(25000-balance)+" paid by credit card , Card Name: "+this.cardname+" Credit Card number: "+this.cardnumber+", balance remaining :"+this.balance);
    }
    int card_balance(){
        return balance;
    }
}
class Person{
    String name;
    int id;
    void setPerson(){
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter your name:");
         name = sc.nextLine();
        System.out.println("Enter your id no.:");
         id = sc.nextInt();
    }
    void getperson_details(){
        System.out.println("Name :"+this.name+" , ID :"+this.id);
    }
}
public class Main{
    public static void main(String[] args) {

        Scanner sc=  new Scanner(System.in);

        Westside w = new Westside();
        Person[] p = new Person[5];
        CreditCardPayment[] card = new CreditCardPayment[5];
        cashpayment[] cash = new cashpayment[5];

        int[] check = new int[5];
        int r =0,z;
        int index;

        while(w.clothes != 0 || w.accessories != 0){
            index = (int)(Math.random()*5);
            z=0;
            int po=0;
            for(int i =0 ;i<r;i++){
                if(check[i]==index){
                    z++;
                }
            }

            if(r==0){
                check[0]=index;
                r++;
            }

            if(z==0){
                check[r]=index;
                r++;
            }
           
            System.out.println("clothes remaining =" +w.clothes);
            System.out.println("accessories remaining =" +w.accessories);
            System.out.println("Person : "+(index+1));
           
            if(z==0){
                card[index] = new CreditCardPayment();
                cash[index] = new cashpayment();
                p[index] =new Person();

                p[index].setPerson();
            }
           
            System.out.println("Enter no. of clothes u wish to buy");
            int n = sc.nextInt();
            System.out.println("Enter no. of accessories u wish to buy");
            int m = sc.nextInt();
            int amount = ((n+m)*(5000));
         
           
            if((card[index].card_balance()>=amount || cash[index].cash_balance()>=amount)&&(m<=w.clothes && n<=w.accessories)) {
       
                w.reduce_accessories(m);
                w.reduce_clothes(n);
                System.out.println("Total amount to be paid: $" + amount);
                System.out.println("Press 2 to pay in cash or press 1 to pay using credit card");
                int option = sc.nextInt();
                if (option == 1 && card[index].card_balance()>=amount) {
                    System.out.println("Enter Card Details:");
                    card[index].get_details();
                    card[index].reduce_card(amount);
                    p[index].getperson_details();
                    card[index].payment_details();
                    po++;
                }
                if (option == 2 && cash[index].cash_balance()>=amount) {
                    cash[index].reduce_cash(amount);
                    p[index].getperson_details();
                    cash[index].payment_details();
                    po++;
                }
                else if(po==0){
                    System.out.println("Transaction failed insufficient Balance");
                    w.reduce_accessories(-m);
                w.reduce_clothes(-n);
                }
           
                else{
                    System.out.println("Out of Stock !!");
                    w.reduce_accessories(-m);
                w.reduce_clothes(-n);
                }
                 
            }
            else
                System.out.println("Transaction failed insufficient Balance");
        }
    }
}
