package Dprogram;

import java.util.Scanner;

public class multipyMatrixRecursion {
	static int count=-1;
	static int multiplications =0;
	public static void main(String[] args) {
		// Input the value of matrix size
				Scanner scan = new Scanner(System.in);
				int p = scan.nextInt();
				
				int[] d = new int[p+1];// dimensions of matrices
				for(int i=0;i<=p;i++){
					d[i] = i+1;
				}
				long startTime = System.currentTimeMillis();
				RecursiveMultiply(0,p-1,d);
				long stopTime = System.currentTimeMillis();
				System.out.println("Total time in ms:"+(stopTime-startTime));
				System.out.println("Number of recursive calls:"+count);
				System.out.println("Number of multiplications:"+multiplications);
				
	}
	
	// Recursive Matrix Multiplication
	public static int RecursiveMultiply(int i, int j, int[] d){
		count+=1;
		int q = 0;
		if(i==j)
			return 0;
		int[][] m = new int[i+1][j+1];
		m[i][j] = 100000;
		for(int k=i;k<j;k++){
			multiplications+=2;
			// Number of recursive calls
			q = RecursiveMultiply(i,k,d) + RecursiveMultiply(k+1,j,d) + d[i]*d[k+1]*d[j+1];
			 if (q< m[i][j]) 
             m[i][j]= q; 
		}
		
		return m[i][j];
	}
}
