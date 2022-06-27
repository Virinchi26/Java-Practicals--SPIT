import java.util.*;

class employee {
    int salary = 10000;

    int getsalary() {
        return salary;
    }
}

class clerk extends employee {
    int getsalary() {
        return 10000 / 2;
    }

    int getbonus() {
        return 1000;
    }
}

class manager extends employee {
    int getsalary() {
        return 10000 * 2;
    }

    int getbonus() {
        return 8000;
    }
}

class intern extends employee {
    int getsalary() {
        return 10000 * 3 / 4;
    }

    int getbonus() {
        return 3000;
    }
}

public class salary {
    public static void main(String[] args) {
        employee obj = new employee();
        clerk ob = new clerk();
        intern o = new intern();
        manager i = new manager();
        System.out.println("The salary and bonus of intern is " + o.getsalary() + " and " + o.getbonus());
        System.out.println("The salary and bonus of manager is " + i.getsalary() + " and " + i.getbonus());
        System.out.println("The salary and bonus of clerk is " + ob.getsalary() + " and " + ob.getbonus());
    }
}