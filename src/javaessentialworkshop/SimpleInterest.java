package javaessentialworkshop;
import java.util.Scanner;
public class SimpleInterest {
    // Step1 : Begin
	public static void main(String[] args) {
		//Reserve Memory For Storing Data
		Scanner sc = new Scanner(System.in);
		double principalAmout;
		double timePeriod;
		double rateOfInterest;
		double simpleInterest;
		
		//Step 2: Accept Input
		System.out.println("Enter Principal Amout :");
		principalAmout = sc.nextDouble();
		
		System.out.println("Enter Time Period :");
		timePeriod = sc.nextDouble();
		
		System.out.println("Enter Rate Of Interest :");
		rateOfInterest = sc.nextDouble();
		
		//Step 4 : Calculate SI
		simpleInterest = (principalAmout * timePeriod * rateOfInterest)/100;
		
		// Step 5 : Print Si
		System.out.println("Simple Interest is "+simpleInterest);

	}//End

}
