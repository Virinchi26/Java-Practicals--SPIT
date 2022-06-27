import java.util.*;
import java.lang.Math;
class gradesStatistics{
    double med,std=0;
    double  avg,min,max;
    int temp;
    void input(){
        Scanner scan= new Scanner(System.in);
            System.out.print("No. of students: ");
        int n=scan.nextInt();
        int sum=0;  
        double grade[]= new double[n];
       for(int i=0;i<n;i++){  
            System.out.printf("Enter the grades of student %d: ",i+1);
            grade[i]=scan.nextDouble();
        }
        display(n,grade);
    }
    void display(int n, double [] grade){
        Arrays.sort(grade);
        for(int i=0;i<n;i++){  
        avg+= grade[i];
       }
        avg=avg/n;

        for(int i=0;i<n;i++){
            std+=(grade[i]-avg)*(grade[i]-avg);
        }
        std=std/n;
        std=Math.sqrt(std);
        min=grade[0];
        max=grade[n-1];

        if(med%2!=0){
            med=grade[(n+1)/2];
        }
        else{
            med=(grade[n/2]+grade[(n/2)+1])/2;
        }  
    System.out.printf("Average = %.2f\n", avg);
    System.out.printf("The Minimum no.= %.0f\n",grade[0]);
    System.out.printf("The Maximum no. =  %.0f\n",grade[n-1]);
    System.out.printf("The Median = %.2f\n" ,med);
    System.out.printf("Standard Deviation = %.2f\n",std);
    }
    public static void main(String[] args){
         Scanner scan= new Scanner(System.in);
        gradesStatistics ob= new gradesStatistics();
        ob.input();
    }
}