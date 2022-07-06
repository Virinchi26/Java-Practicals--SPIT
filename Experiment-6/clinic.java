import java.util.*;

class Person {
    Calendar current = Calendar.getInstance();
    Calendar bill = Calendar.getInstance();
    Calendar admit = Calendar.getInstance();
    Scanner sc = new Scanner(System.in);
    String name;
    int year, month, date;

    void getName() {
        name = sc.nextLine();
    }

    String setName() {
        return name;
    }

    void getDate() {
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
    }

    int setDate() {
        bill.set(year, month - 1, date);
        return 0;
    }
}

class Doctor extends Person {
    int salary, fee;

    void getName() {
        System.out.println("Enter the doctor's name:");
        name = sc.nextLine();
    }

    String setName() {
        return name;
    }

    void getSal() {
        System.out.println("Enter the doctor's salary:");
        salary = sc.nextInt();
    }

    int setSal() {
        return salary;
    }

    void getFee() {
        System.out.println("Enter the doctor's fee:");
        fee = sc.nextInt();
    }

    int setFee() {
        return fee;
    }

    void getDate() {
        System.out.println("Enter the billing date (date, month, year):");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
    }

    int setDate() {
        bill.set(year, month - 1, date);
        long d3 = bill.getTimeInMillis() / (1000 * 3600 * 24);
        return (int) d3;
    }
}

class Patient extends Person {
    void getName() {
        System.out.println("Enter the patient's name:");
        name = sc.nextLine();
    }

    String setName() {
        return name;
    }

    void getDate() {
        System.out.println("Enter the date when the patient was admitted:");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
    }

    int setDate() {
        admit.set(year, month - 1, date);
        long d2 = admit.getTimeInMillis() / (1000 * 3600 * 24);
        return (int) d2;
    }
}

class Billing extends Doctor {
    void getDate() {
        System.out.println("Enter the current date (date, month, year): ");
        date = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();
    }

    int setDate() {
        current.set(year, month - 1, date);
        long d1 = current.getTimeInMillis() / (1000 * 3600 * 24);
        return (int) d1;
    }

    int Total_bill(int d1, int d2, int d3, int fee) {
        int n1 = Math.abs((int) (d1 - d2));
        int n2 = Math.abs((int) (d1 - d3));
        int tot = ((n1 * 2000) + (fee * n2));
        return tot;
    }
}

public class clinic {
    public static void main(String[] args) {
        Doctor[] d = new Doctor[2];
        Patient[] p = new Patient[2];
        Billing[] b = new Billing[2];
        for (int i = 0; i < 2; i++) {
            d[i] = new Doctor();
            p[i] = new Patient();
            b[i] = new Billing();
            b[i].getDate();
            d[i].getName();
            d[i].getSal();
            d[i].getFee();
            d[i].getDate();
            p[i].getName();
            p[i].getDate();
        }
        for (int i = 0; i < 2; i++) {
            System.out.println("Doctor : " + d[i].setName());
            System.out.println("Patient: " + p[i].setName());
            System.out.println(
                    "Fees : Rs. " + b[i].Total_bill(b[i].setDate(), p[i].setDate(), d[i].setDate(), d[i].setFee()));
            System.out.println("Doctor's new salary: Rs. " + (d[i].setSal() +
                    b[i].Total_bill(b[i].setDate(), p[i].setDate(), d[i].setDate(), d[i].setFee())));
        }
    }
}