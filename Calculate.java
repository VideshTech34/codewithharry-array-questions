package arraycodewithharry;

import java.util.Scanner;

public class Calculate {
	
	static void calculate() {
		
		
		float marks [] = {95,23,56};
		
		float sum =0;
		float avg = 0;
		for(int i =0;i<marks.length;i++) {
			
			sum +=marks[i];
			
			avg=sum/3;
			
			
			
		}
		
		System.out.println("Sum and average of physics marks  : "+sum+ " Average "+avg);
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the array size : ");
		
		//int n = sc.nextInt();
		
		///System.out.println("Enter the array elements : ");
		
		//int arr[] = new int[n];
		
		//for(int i =0;i<arr.length;i++) {
			
		//	arr[i] = sc.nextInt();
			
		

		calculate();

	}

}
