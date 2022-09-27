import java.util.Scanner;
class insufficientAmountException extends Exception {
    insufficientAmountException(String s) {
        super(s);
    }
}

class negativeBalanceException extends Exception {
    negativeBalanceException(String s) {
        super(s);
    }
}

abstract class account {
    Scanner sc = new Scanner(System.in);
    String name;
    int balance = 5000;
    int accNo;

    account() {
        name = sc.nextLine();
        accNo = sc.nextInt();
        sc.nextLine();
    }

    abstract void deposit(int amount);

    abstract void withdraw(int amount) throws insufficientAmountException;

    abstract void display();
}


class SavingsAccount extends account {
    int minimumBalance = 5000;
    double intrest = 3.5;

    SavingsAccount() {
        super();
    }

    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) throws insufficientAmountException {
        if (balance - amount < 5000) {
            throw new insufficientAmountException("");
        } else {
            balance -= amount;
        }
    }

    @Override
    void display() {

        System.out.println("The amount in the account is :" + balance);
    }

    public void addIntrest() {
        balance += intrest * balance / 100;

    }

    public void transfer(int amount) throws insufficientAmountException {
        if (balance - amount < 5000) {
            throw new insufficientAmountException("");
        } else {
            balance -= amount;
        }
    }
}

public class ExceptionHandling {
    static void validateAmount(int amount) throws negativeBalanceException {
        if (amount < 0) {
            throw new negativeBalanceException("");
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name and your account number");
        SavingsAccount person = new SavingsAccount();
        int flag = 1;
        while (flag == 1) {
            System.out.println("Enter \n1) If you want to add money in your account \n2) If you want to withdraw money from your account\n3) If you want to display the money in youraccount\n4) If you want to receive intrest on your account\n5) If you want to send money to someonefrom your account ");
            int option = s.nextInt();
            switch (option) {
                case 1:

                    System.out.println("enter the amount you wish to add to your bank account");
                    try {
                        int deposits = s.nextInt();
                        validateAmount(deposits);
                        person.deposit(deposits);
                        person.display();
                        break;
                    } catch (negativeBalanceException n) {
                        System.out.println(n + "enter a valid amount");
                    }
                case 2:
                    System.out.println("Enter the amount you wish to withdrawfrom your bank account ");
                    int amount = s.nextInt();
                    try {
                        validateAmount(amount);
                        try {

                            person.withdraw(amount);
                            person.display();
                            break;
                        } catch (insufficientAmountException t) {
                            System.out.println(t + "Sorry transaction is not possible due to insufficient balance");
                            break;
                        }

                    } catch (negativeBalanceException e) {
                        System.out.println(e + "Enter A positive amount");
                        break;
                    }
                case 3:
                    System.out.print("The balance in your bank account is: ");
                    person.display();
                    break;
                case 4:
                    person.addIntrest();
                    person.display();
                    break;
                case 5:
                    System.out.println("Enter the amount you wish to transfer");
                    int a = s.nextInt();
                    try {
                        validateAmount(a);
                        try {
                            person.transfer(a);
                            person.display();
                            break;
                        } catch (insufficientAmountException t) {
                            System.out.println(t + "sorry transaction is not possible due to insufficient balance");
                            break;
                        }
                    }

                    catch (negativeBalanceException e) {
                        System.out.println(e + "Enter A positive amount");
                        break;
                    }
                default:
                    try {
                        throw new ArithmeticException("");
                    } catch (ArithmeticException e) {
                        System.out.println(e + " Enter a valid number");
                        break;
                    }
            }

            System.out.println("Enter 1 if you want to continue the program else press 0");
            flag = s.nextInt();
        }
        s.close();
    }
}
