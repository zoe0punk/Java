import java.util.Scanner;
public class Main
{
    /** 
     * Computer ara of circle.
     *@author Trinh Ho
    **/
	public static void main(String[] args) {
		System.out.println("Hello World");
		final double PI = 3.14159;
		Scanner scnr = new Scanner(System.in);
		System.out.print("Enter a number for radius: ");
		double radius = scnr.nextDouble();
		double area = radius * PI * radius;
	    System.out.println("The area for the circle of radius is "+area);
	}
}
