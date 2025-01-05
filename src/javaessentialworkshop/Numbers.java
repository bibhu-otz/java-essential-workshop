package javaessentialworkshop;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter numbers into the array :");
		
		for(int i =0 ;i< arr.length;i++) {
			System.out.println("Enter value at arr["+i+"]:");
			arr[i] = sc.nextInt();
		}
		System.out.println("Print Number Present in the array  :");
		for(int i =0 ;i< arr.length;i++) {
			
			System.out.println("arr["+i+"]="+arr[i]);
		}
		int sum =0;
		for(int num : arr)
		{
			sum = sum +num ;
		}
		System.out.println(sum);

	}

}
