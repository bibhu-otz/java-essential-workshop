package javaessentialworkshop;
import java.util.Scanner;
public class MultiplicationTables {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Start Range :");
		int startRange = sc.nextInt();//5
		
		System.out.println("Enter End Range :");
		int endRange = sc.nextInt();//10
		
		if(startRange < endRange) {
			for(int i = startRange ;i<=endRange;i++) {
				
				for(int j=1;j<=10;j++)
				{
					System.out.println(i+"x"+j+"="+(i*j));
				}
				System.out.println("\n\n**************************\n\n");
			}
		}else {
			System.out.println("Given Range is Not Valid");
		}
		

	}

}
