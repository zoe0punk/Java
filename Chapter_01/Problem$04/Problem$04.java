 /**
     * Solve an 2 linear function where they intercept by Cramer's rule.
     *This program only handle coefficient that is integer.
     *@author Trinh Ho
    **/
import java.util.*;
public class Main
{
   
	public static void main(String[] args) {
	Scanner scnr = new Scanner(System.in);
	System.out.println("What is integer coefficient of x 1st equation?");
	int a = scnr.nextInt();
	System.out.println("What is integer coefficient of y 1st equation ?");
	int b = scnr.nextInt();
	System.out.println("What is constant value of 1st equation ?");
	int e = scnr.nextInt();
System.out.println("What is integer coefficient of x 2nd equation ?");
	int c = scnr.nextInt();
	System.out.println("What is integer coefficient of y 2nd equation?");
	int d = scnr.nextInt();
	System.out.println("What is constant value of 2nd equation equation ?");
	int f = scnr.nextInt();
	int denominator = (a*d-b*c);
	int x = (e*d-b*f)/denominator;
	int y = (a*f-e*c)/denominator;
	if (denominator ==0)
	{
	   System.out.println("The equations have no unique solution");
	}
	else
	{
	System.out.println("They intercet at (" + x + "," + y +")");
	}
	}
