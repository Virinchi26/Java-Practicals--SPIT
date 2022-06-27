import java.util.*;
class Testing{
int[] ansArr = {1,2,1,1,1,1,2,1};
int[][] appAns = new int[6][8];
int[] marksArr = new int[6];
void takeTest()
{
Scanner scan = new Scanner(System.in);
for(int i=0;i<6;i++)
{
    System.out.printf("For person %d\n", (i+1));  
    System.out.print("Section 1\n"); //1,2
    System.out.print("What is the vision of the company\n");
    System.out.print("1) to become UNICORN \n");
    System.out.print("2) To create local opportunity \n");
    appAns[i][0] = scan.nextInt();
     System.out.print("\n");
    System.out.print("How long will you stay in this role?\n");
    System.out.print("1) Sir, I will stay in your company as long as I can. \n");
    System.out.print("2) Uptil I don't get better job offers \n");
    appAns[i][1]=scan.nextInt();
    System.out.print("\n");
    System.out.print("Section 2\n"); //1,1
    System.out.print("1.What is final method in Java? \n");
    System.out.print(" 1) To declare constants in java\n");
    System.out.print(" 2) I don't know the ans Sir \n");
    appAns[i][2]=scan.nextInt();
    System.out.print("\n");
    System.out.print("What is the latest version of Java?\n");
    System.out.print(" 1) JAVA SE 18. \n");
    System.out.print(" 2) JAVA SE 22. \n");
    appAns[i][3]=scan.nextInt();
    System.out.print("\n");
    System.out.print("Section 3\n");// 1,1
    System.out.print("What did you learn about Java in last job?\n");
    System.out.print(" 1) This is my first job Sir. \n");
    System.out.print(" 2) Java is a general purpose programming language, much like Python or JavaScript.. \n");
    appAns[i][4]=scan.nextInt();
    System.out.print("\n");
    System.out.print("What do you wish to learn?\n");
    System.out.print(" 1) I am interested in the ways this job can help me grow personally and professionally.\n");
    System.out.print(" 2) I wish to explore more about technology\n");
    appAns[i][5]=scan.nextInt();
    System.out.print("\n");
     System.out.print("Section 4\n"); //2,1
     System.out.print("What makes a team successful?\n");
     System.out.print(" 1) By helping the team in whatever way you can and putting team ahead of yourself\n");
     System.out.print(" 2) Having mutual respect, common and aligned goals, open communication, and patience\n");
    appAns[i][6]=scan.nextInt();
     System.out.print("Do you work faster in team or as individual?\n");
     System.out.print(" 1) As  a Team\n");
     System.out.print(" 2) As  an Individual\n");
     appAns[i][7]=scan.nextInt();
}

for(int j=0;j<6;j++)
{
int sum = 0;
for(int k=0;k<8;k++)
{
if(ansArr[k] == appAns[j][k])
{
sum += 1;
}
}
marksArr[j] = sum;
}
}
}
class Recruitment extends Testing{
int[] percentageArr = new int[6];
String passOrfail;
void generateResult()
{
for(int i=0;i<6;i++)
{
percentageArr[i] = (marksArr[i]/8)*100;
if(percentageArr[i] >= 60)
{
passOrfail = "Passed";
}
else passOrfail = "Failed";
System.out.println("Person "+(i+1)+" has "+passOrfail+" the test");
}
}
}
public class TesterAB{

public static void main(String[] args)
{
Recruitment ob = new Recruitment();
ob.takeTest();
ob.generateResult();
}

}