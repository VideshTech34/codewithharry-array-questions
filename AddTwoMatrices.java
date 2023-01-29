package arraycodewithharry;

import java.util.Scanner;

public class AddTwoMatrices {
	
	static void printMatrix(int matrix[][]) {
		
		for(int i =0;i<matrix.length;i++) {
			for(int j =0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	static void add(int matrix[][],int r1,int c1,int matrix1[][],int r2,int c2) {
		
		
		int ans[][] = new int[r1][c2];
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				ans[i][j]+=matrix[i][j]+matrix1[i][j];
			}
		}
		System.out.println("Addition of first and second Matrix : ");
		
		printMatrix(ans);
		
		
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rows and columns of matrix1 ");
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		System.out.println("Enter the matrix value : ");
		
		int matrix[][] = new int[r][c];		
		for(int i =0;i<r;i++) {
			for(int j =0;j<c;j++) {
				
				matrix[i][j] = sc.nextInt();
				
				
			}
		}
		
		

		System.out.println("Enter the rows and columns of matrix2 ");
		
		int r1 = sc.nextInt();
		int c1 = sc.nextInt();
		
		System.out.println("Enter the matrix value : ");
		
		int matrix1[][] = new int[r1][c1];		
		for(int i =0;i<r1;i++) {
			for(int j =0;j<c1;j++) {
				
				matrix1[i][j] = sc.nextInt();
				
				
			}
		}
		
		 add(matrix,r,c,matrix1,r1,c1);
		
		
		
		

	}

}
