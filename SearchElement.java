package arraycodewithharry;

import java.util.Scanner;

public class SearchElement {
	
	static boolean searchElement(int arr[], int x) {
		
		boolean check = false;
		
		
		for(int i =0;i<arr.length;i++) {
			if(arr[i]==x) {
				
				check = true;
				break;
				
			}
		}
		return check;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the array size : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		
		int arr[] = new int[n];
		
		for(int i=0;i<arr.length;i++) {
			
			arr[i]= sc.nextInt();
			
		}
		
		System.out.println("Enter the searching element : ");
		
		int x = sc.nextInt();
		
		System.out.println(" Element Found : "+searchElement(arr,x));
		

	}

}
