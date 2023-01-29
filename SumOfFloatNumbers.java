package arraycodewithharry;

import java.util.Scanner;

//sum of five float numbers in array

public class SumOfFloatNumbers {
	
	void arraySum() {
		float sum =0;
		
		float marks[] = {4.4f,46f,79f,94f,43f};
		
		for(int i =0;i<marks.length;i++) {
			
			sum +=marks[i];
			
		}
		System.out.println("Sum of Total of  five Number : "+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SumOfFloatNumbers s = new SumOfFloatNumbers();
		
		s.arraySum();
		
		
		

	}

}
