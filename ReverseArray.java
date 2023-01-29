package arraycodewithharry;

import java.util.Scanner;

public class ReverseArray {
	
	static void printArray(int arr[]) {
		
		for(int i =0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	static int[] reverse(int arr[]) {
		
		int n = arr.length;
		int j =0;
		
		int ans[] = new int[n];
		
		for(int i =n-1;i>=0;i--) {
			ans[j++]=arr[i];
		}
		return ans;
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
		
		int ans[] = reverse(arr);
		
		printArray(ans);
		

	}

}


