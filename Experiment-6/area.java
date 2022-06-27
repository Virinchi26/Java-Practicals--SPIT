import java.util.*;
import java.lang.Math;

class Shape {
    Scanner scan = new Scanner(System.in);
    double area, side, perimeter, radius, s1, s2, s3, a;
    
    void getArea() {
        area = 0;
    }

    void getPerimeter() {
        perimeter = 0;
    }

    void getSide() {
        side = 0;
    }
}

class Circle extends Shape {
    void getArea() {
        area = Math.PI * Math.pow(radius, 2);

    }

    void getPerimeter() {
        perimeter = Math.PI * 2 * radius;

    }

    void getSide() {
        System.out.print("Enter the radius of the circle: ");
        radius = scan.nextDouble();
    }
}

class Triangle extends Shape {
    void getArea() {
        double s = (s1 + s2 + s3) / 2;
        area = s * (s - s1) * (s - s2) * (s - s3);
        area = Math.sqrt(area);

    }

    void getPerimeter() {
        double s = (s1 + s2 + s3) / 2;
        perimeter = (s * 2);

    }

    void getSide() {
        System.out.print("Enter the 3-sides of the triangle: ");
        s1 = scan.nextDouble();
        s2 = scan.nextDouble();
        s3 = scan.nextDouble();
    }
}

class Pentagon extends Shape {
    void getArea() {
        area = ((Math.sqrt(5 * (5 + 2 * Math.sqrt(5)))) / 4) * Math.pow(a, 2);

    }

    void getPerimeter() {
        perimeter = (5 * a);
    }

    void getSide() {
        System.out.print("Enter the side of the pentagon: ");
        a = scan.nextDouble();
    }
}

public class area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Circle ob_c = new Circle();
        Triangle ob_t = new Triangle();
        Pentagon ob_p = new Pentagon();
        int option, flag;
        while (true) {
            System.out.println("\n 1) Circle  \n 2) Triangle \n 3) Pentagon ");
            System.out.print("Enter the Shape you want: ");
            option = scan.nextInt();
            switch (option) {
                case 1:
                    ob_c.getSide();
                    ob_c.getArea();
                    ob_c.getPerimeter();
                    System.out.printf("Area= %.2f\nPerimeter=%.2f\n", ob_c.area, ob_c.perimeter);

                    break;

                case 2:
                    ob_t.getSide();
                    ob_t.getArea();
                    ob_t.getPerimeter();
                    System.out.printf("Area= %.2f\nPerimeter=%.2f\n", ob_t.area, ob_t.perimeter);
                    break;

                case 3:
                    ob_p.getSide();
                    ob_p.getArea();
                    ob_p.getPerimeter();
                    System.out.printf("Area= %.2f\nPerimeter=%.2f\n", ob_p.area, ob_p.perimeter);
                    break;

                default:
                    System.out.println("Invalid choice ");
                    break;

            }
            System.out.println("");
            System.out.println("Do you want to continue?(yes=1/0=no)");
            flag = scan.nextInt();
            if (flag == 0) {
                break;
            }
        }
    }
}