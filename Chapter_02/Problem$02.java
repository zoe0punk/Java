/**
     * Convert second to minute and remaining second.
     *
    **/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	Scanner scnr = new Scanner(System.in);
	System.out.println("Enter an integer for seconds");
	int seconds = scnr.nextInt();
	int minute = seconds/60;
	int remainingSeconds = seconds%60;
	System.out.println(minute + " minutes and " + remainingSeconds + " seconds");
	}
}

