import java.util.*;
import java.lang.Math;

class Bank {
    double get_rate_of_interest() {
        int rate = 2;
        return rate;
    }

    class SBI_BANK extends Bank {

        double get_rate_of_interest(int t) {
            if (t >= 7 && t <= 14) {
                return 3.00;
            } else if (t >= 15 && t <= 30) {
                return 3.00;
            } else if (t >= 31 && t <= 45) {
                return 3.00;
            } else if (t >= 46 && t <= 90) {
                return 4.05;
            } else if (t >= 91 && t <= 120) {
                return 4.10;
            } else if (t >= 121 && t <= 180) {
                return 4.10;
            }
            return 2;
        }
    }

    class ICICI_BANK extends Bank {
        double get_rate_of_interest(int t) {
            if (t >= 7 && t <= 14) {
                return 3.10;
            } else if (t >= 15 && t <= 30) {
                return 3.20;
            } else if (t >= 31 && t <= 45) {
                return 3.50;
            } else if (t >= 46 && t <= 90) {
                return 4.50;
            } else if (t >= 91 && t <= 120) {
                return 4.70;
            } else if (t >= 121 && t <= 180) {
                return 4.90;
            }
            return 2;
        }
    }

    class AXIS_BANK extends Bank {
        double get_rate_of_interest(int t) {
            if (t >= 7 && t <= 14) {
                return 3.15;
            } else if (t >= 15 && t <= 30) {
                return 3.15;
            } else if (t >= 31 && t <= 45) {
                return 3.45;
            } else if (t >= 46 && t <= 90) {
                return 4.05;
            } else if (t >= 91 && t <= 120) {
                return 4.70;
            } else if (t >= 121 && t <= 180) {
                return 5.00;
            }
            return 2;
        }
    }
}

class Calender {
    int date = 21;
    int month = 6;

    void finaldate(int t) {
        int d = t % 30;
        int m = t / 30;
        date = d + date;
        month = m + month;
        if (date >= 30) {
            date = date - 30;
            month = month + 1;
        }
        System.out.println(date + " / " + month + " / 22");
    }
}

class deposit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t1, t2, t3;
        SBI_Bank sbi = new SBI_Bank();
        ICICI_Bank icici = new ICICI_Bank();
        AXIS_Bank axis = new AXIS_Bank();
        Calender l1 = new Calender();
        Calender l2 = new Calender();
        Calender l3 = new Calender();

        System.out.print("Enter the Bank name:\n 1)SBI Bank\n 2) ICICI Bank\n 3) AXIS Bank\n ");
        int option = scan.nextInt();

        while (true) {
            switch (option) {
                case 1:
                    System.out.println("Enter time period for SBI");
                    t1 = scan.nextInt();
                    System.out.println("Final value $ " + (10000 * Math.pow((1 + (sbi.get_rate_of_interest(t1) / 100)), (float) t1 / 365)));
                    l1.finaldate(t1);
                    break;
                case 2:
                    System.out.println("Enter time period for ICICI");
                    t2 = scan.nextInt();
                    System.out.println("Final value $ " + (12500 * Math.pow((1 + (icici.get_rate_of_interest(t2) / 100)), (float) t2 / 365)));
                    l2.finaldate(t2);
                    break;
                case 3:
                    System.out.println("Enter time period for AXIS");
                    t3 = scan.nextInt();
                    System.out.println("Final value $ " + (20000 * Math.pow((1 + (axis.get_rate_of_interest(t3) / 100)), (float) t3 / 365)));
                    l3.finaldate(t3);
                    break;
                default:
                    System.out.print("Invalid option");
            }
            System.out.print("Press '1' to continue or '0' to exit");
            int flag = scan.nextInt();
            if (flag == 0) {
                break;
            }
        }
        scan.close();
    }
}