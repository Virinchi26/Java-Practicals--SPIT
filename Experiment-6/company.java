import java.util.*;

class sales {
    Scanner sc = new Scanner(System.in);
    float[] sales = new float[3];

    void getdata() {
        System.out.println("Enter the dollar sales of the last three months.");
        for (int i = 0; i < 3; i++)
            sales[i] = sc.nextFloat();
    }

    void putdata() {
        System.out.println(sales[0] + "\t" + sales[1] + "\t" + sales[2] + "\t");
    }
}

class publication extends sales {
    int price;
    String name;

    void getdata() {
        price = sc.nextInt();
        name = sc.nextLine();
    }

    void putdata() {
        System.out.println(name + " " + price);
    }
}

class book extends publication {
    int page;

    void getdata() {
        System.out.println("Enter name of book");
        name = sc.nextLine();
        System.out.println("Enter price of " + name);
        price = sc.nextInt();
        System.out.println("Enter no. of pages the book contains");
        page = sc.nextInt();
        System.out.println("Enter the dollar sales of the last three months.");
        for (int i = 0; i < 3; i++)
            sales[i] = sc.nextFloat();
    }

    void putdata() {
        System.out.println(
                name + "\t" + price + "\t" + page + "\t" + sales[0] + "\t" + sales[1] + "\t" + sales[2] + "\t");
    }
}

class tape extends publication {
    int time;

    void getdata() {
        System.out.println("Enter name of tape");
        name = sc.nextLine();
        System.out.println("Enter price of " + name);
        price = sc.nextInt();
        System.out.println("Enter playing time of " + name + " in minutes");
        time = sc.nextInt();
        System.out.println("Enter the dollar sales of the last three months.");
        for (int i = 0; i < 3; i++)
            sales[i] = sc.nextFloat();
    }

    void putdata() {
        System.out.println(
                name + "\t" + price + "\t" + time + "\t" + sales[0] + "\t" + sales[1] + "\t" + sales[2] + "\t");
    }
}

public class company {
    public static void main(String[] args) {
        book[] b = new book[3];
        tape[] t = new tape[3];
        for (int i = 0; i < 3; i++) {
            b[i] = new book();
            t[i] = new tape();
            System.out.println("ENTER DATA FOR BOOK");
            b[i].getdata();
            System.out.println("ENTER DATA FOR TAPE");
            t[i].getdata();
        }
        System.out.println("Name\tPrice\tPage\tSales(3 MONTHS)\t");
        for (int i = 0; i < 3; i++) {
            b[i].putdata();
        }
        System.out.println("\n");
        System.out.println("Name\tPrice\tPlaying time\tSales(3 MONTHS)\t");
        for (int i = 0; i < 3; i++) {
            t[i].putdata();
        }
    }
}