import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, id, type;
        int age;
        double salary;
        double mon[] = new double[5];
        System.out.println("Enter the details of 5 employees: ");
        SalariedEmployee obj[] = new SalariedEmployee[5];
        for (int i = 0; i < 5; i++) {
            //System.out.print("Enter the credentials of the Employee " + (i + 1) + ":");
            System.out.printf("Enter the name of the Employee %d:  ",(i+1));
            name = sc.nextLine();
            System.out.print("Enter the ID of the Employee: ");
            id = sc.nextLine();
            System.out.print("Enter the age of the Employee: ");
            age = sc.nextInt();
            System.out.print("Enter the salary of the Employee: ");
            salary = sc.nextDouble();
            sc.nextLine();
            System.out.print("Enter the type of the Employee: ");
            type = sc.nextLine();
            obj[i] = new SalariedEmployee(name, id, age, salary, type);
            mon[i] = obj[i].getSalary();
            System.out.println(" ");
        }
        int maxindex = 0;
        double max = mon[0];
        for (int i = 1; i < mon.length; i++) {
            if (mon[i] > max) {
                max = mon[i];
                maxindex = i;
            }
        }
        System.out.println("Details of Employee with the highest salary is: ");
        System.out.print("Employee name: ");
        System.out.print(obj[maxindex].getName());
        System.out.println("");
        System.out.print("ID: ");
        System.out.print(obj[maxindex].getID());
        System.out.println("");
        System.out.print("Age: ");
        System.out.print(obj[maxindex].getAge());
        System.out.println("");
        System.out.print("Salary: ");
        System.out.print(mon[maxindex]);
    }
}

class Employee {
    private String name, id;
    private int age;

    Employee() {
    }

    Employee(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getID() {
        return id;
    }

    int getAge() {
        return age;
    }
}

class SalariedEmployee extends Employee {
    private double empSalary;
    String type;

    SalariedEmployee() {
    }

    SalariedEmployee(String name, String id, int age, double empSalary, String type) {
        super(name, id, age);
        if (type.equals("Permanent")) {
            this.empSalary = empSalary + 2000;
        } else {
            this.empSalary = empSalary;
        }
    }

    double getSalary() {
        return empSalary;
    }
}