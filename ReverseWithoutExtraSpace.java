package arraycodewithharry;

import java.util.Scanner;

public class ReverseWithoutExtraSpace {
static void printArray(int arr[]) {
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

static void reverse(int arr[]) {
	
	int i =0, j = arr.length-1;
	
	
	
	while(i<j) {
		
		int temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a  array size : ");
		
		int n = sc.nextInt();
		
		System.out.println("Enter the array elements : ");
		
		int arr[] = new int[n];		
		
		for(int i =0;i<arr.length;i++) {
			
			arr[i] = sc.nextInt();
		}

	reverse(arr);
	printArray(arr);
	}

}
