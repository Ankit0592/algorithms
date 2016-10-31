package Dprogram;

import java.util.Scanner;

public class matrixMemoization {
	static int count = -1;
	static int multiplications = 0;
	public static void main(String[] args) {
		// Input the value of matrix size
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		
		int[][] m = new int[p][p];// To store minimum scalar multiplications
		int[][] s = new int[p][p]; // To store the point where multiplication is done
		int[] d = new int[p+1];// dimensions of matrices
		for(int i=0;i<=p;i++){
			d[i] = i+1;
			
		}
		for(int k=0;k<p;k++){
			for(int j=0;j<p;j++){
				m[k][j]= -1;// storing a very large value to find minimum value
			}
		}
		
		
		long startTime = System.currentTimeMillis();
		int result = RecursiveMemoized(m,s,0,p-1,d);
		long stopTime = System.currentTimeMillis();
		System.out.println("Total time in ms"+(stopTime-startTime));
		System.out.println("Number of recursive calls:"+count); // Number of recursive calls
		System.out.println("Number of scalar multiplications:"+multiplications);
	}
	// Recursive Matrix Multiplication
		public static int RecursiveMemoized(int[][] m, int[][] s, int i, int j, int[] d){
			
			count+=1;
			int q = 0;
			
			if(i==j)
				return m[i][j] = 0;
			
			else if(m[i][j] >=0){
				return m[i][j];
			}
			else{
				
				 // Number of recursive calls
				m[i][j] = 10000000;
				for(int k=i;k<j;k++){
					multiplications +=2;
					q = RecursiveMemoized(m,s,i,k,d) + RecursiveMemoized(m,s,k+1,j,d) + d[i]*d[k+1]*d[j+1]; 
					
					if(q < m[i][j])
							m[i][j] = q; // Memoization
				}
			}	
			return m[i][j];
		}
}
