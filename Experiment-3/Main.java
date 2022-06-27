import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of candidates: ");
        int n = sc.nextInt();
        Posting b[] = new Posting[n];
        int pcount = 0;
        int lcount = 0;
        int mcount = 0;
        for (int k = 0; k < n; k++) {
            System.out.println("Enter the number for the job you are applying: ");
            System.out.println("1. Programmer\n2. Team Leader\n3. Project Manager");
            int choice = sc.nextInt();
            int c, a, t, i;
            float score;
            switch (choice) {
                case 1:
                    System.out.println("Enter your scores in Course Work, Aptitude Test, Tech Test and Interview in order:");
                    c = sc.nextInt();
                    a = sc.nextInt();
                    t = sc.nextInt();
                    i = sc.nextInt();
                    b[k] = new Posting(c, a, t, i);
                    score = b[k].getScore();
                    if (score / 4 >= 80) {
                        System.out.println("You are recruited for the job");
                        pcount++;
                    } else {
                        System.out.println("Sorry to inform you that you aren't selected for the job.");
                    }
                    break;
                case 2:
                    System.out.println("Enter your scores in Tech Test and Interview in order:");
                    t = sc.nextInt();
                    i = sc.nextInt();
                    b[k] = new Posting(t, i);
                    score = b[k].getScore();
                    if (score / 2 >= 85) {
                        System.out.println("You are recruited for the job");
                        lcount++;
                    } else {
                        System.out.println("Sorry to inform you that you aren't selected for the job.");
                    }
                    break;
                case 3:
                    System.out.println("Enter your scores in Interview in order:");
                    i = sc.nextInt();
                    b[k] = new Posting(i);
                    score = b[k].getScore();
                    if (score >= 90) {
                        System.out.println("You are recruited for the job");
                        mcount++;
                    } else {
                        System.out.println("Sorry to inform you that you aren't selected for the job.");
                    }
                    break;
                default:
                    System.out.println("Enter correct choice.");
            }
        }
        System.out.println("Number of Programmers recruited = " + pcount);
        System.out.println("Number of Team Leaders recruited = " + lcount);
        System.out.println("Number of Project Managers recruited = " + mcount);
    }
}

class Posting {
    private int courseWork;
    private int AptTest;
    private int TechTest;
    private int interview;

    Posting() {
        courseWork = 0;
        AptTest = 0;
        TechTest = 0;
        interview = 0;
    }

    public Posting(int courseWork, int AptTest, int TechTest, int interview) {
        this.courseWork = courseWork;
        this.AptTest = AptTest;
        this.TechTest = TechTest;
        this.interview = interview;
    }

    public Posting(int TechTest, int interview) {
        this.TechTest = TechTest;
        this.interview = interview;
        courseWork = 0;
        AptTest = 0;
    }

    public Posting(int interview) {
        this.interview = interview;
        courseWork = 0;
        AptTest = 0;
        TechTest = 0;
    }

    float getScore() {
        return courseWork + AptTest + TechTest + interview;
    }
}