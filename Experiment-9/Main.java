import java.util.InputMismatchException;
import java.util.Scanner;

class cricketer {
    String playerName = "";
    int runsHit = 0, inningsCount = 0, notOutCount = 0;
    int battingAvg = 0, flag = 0;

    cricketer() {

    }

    cricketer(String playerName, int runsHit, int inningsCount, int notOutCount) {

        this.playerName = playerName;
        this.runsHit = runsHit;
        this.inningsCount = inningsCount;

        this.notOutCount = notOutCount;
    }

    public void average() {
        try {
            battingAvg = (int) runsHit / inningsCount;
            if (battingAvg < 20) {
                throw new ArithmeticException("Average is too low for a player");
            }
        } catch (ArithmeticException e) {
            System.out.println("player hasnt't played a single game so data is invalid");
            flag = 1;
        }

    }

    public void display() {
        System.out.println("The data of cricketeres are as follows: \n");
        System.out.println("The name of the player is: " + playerName);
        System.out.println("The total runs hit by the player is : " + runsHit);
        System.out.println("The number of innings played by the player is: " + inningsCount);
        System.out.println("The number of total not out innings of the player is: " + notOutCount);
        System.out.println("The batting average of the player is: " + battingAvg);
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        cricketer[] c = new cricketer[3];
        try {
            for (int i = 0; i < 3; i++) {
                System.out.println(
                        "Enter the name of the cricketer ,total runs hit, total number of innings played,total number of games where he was not out \nPlayer no.: " + i);

                try {
                    c[i] = new cricketer(sc.nextLine(), sc.nextInt(), sc.nextInt(), sc.nextInt());
                    sc.nextLine();
                } catch (Exception t) {
                    System.out.println("Enter the correct type of data.");
                }
                c[i].average();
            }
            for (int i = 0; i < 2; i++) {
                for (int j = i; j < 3; j++) {
                    if (c[i].battingAvg > c[j].battingAvg) {
                        cricketer ob = new cricketer();
                        ob = c[i];
                        c[i] = c[j];
                        c[j] = ob;
                    }
                }
            }
            for (int i = 0; i < 3; i++) {
                if (c[i].flag == 0) {
                    c[i].display();
                }
            }
            sc.close();
        } catch (NullPointerException g) {
            System.out.println(g);
        }
    }
}