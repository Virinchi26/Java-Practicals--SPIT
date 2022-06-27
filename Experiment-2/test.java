import java.util.*;
import java.lang.Math;

public class test{
	double base;
	int power,logBase, argument;
	
	test(){
		base = 2;
		power = 2;
		logBase = 2;
		argument = 2;	
	}
	public double calculate(double base, int power)
	{
		return Math.pow(base,power);
	}
	public double calculate(int logBase, int argument)
	{
		return (Math.log(argument)/Math.log(logBase));
	}
	public static void main(String[] args)
	{
		test ob1 = new test();
		System.out.println("2 to power of 4 is "+ob1.calculate(2.0d,4));
		System.out.println("log(4) to the base of 2 is "+ob1.calculate(2,4));
	}
}