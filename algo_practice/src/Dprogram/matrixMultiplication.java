package Dprogram;

import java.util.Scanner;

// Dynamic Programming method
public class matrixMultiplication {
	static int count=-1;
	static int multiplications =0;
	public static void main(String[] args) {
		// Input the value of matrix size
		
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		scan.close();
		
		int[][] m = new int[p][p];// To store minimum scalar multiplications
		int[][] s = new int[p][p]; // To store the point where multiplication is done
//		int[] d = new int[p+1];// dimensions of matrices
//		for(int i=0;i<=p;i++){
//			d[i] = i+1;
//		}
//		
		int[] d ={5, 2, 4, 7, 3, 9, 7, 8, 6, 3, 7, 5, 5};
		long startTime = System.currentTimeMillis();
		M(m,s,p,d);
		long stopTime = System.currentTimeMillis();
		System.out.println("Total time in ms:"+(stopTime-startTime));
		System.out.println("Number of recursive calls:"+count);
		System.out.println("Number of scalar multiplations:"+multiplications);
	}
	
	public static void M(int[][] m, int[][] s, int n, int[] d){
		count+=1;
		int i,j,sum=0;
		
		int l = n-1;
		for(i=0;i<=l;i++){
			m[i][i] = 0;
		}
		
		for(i=l-1;i>=0;i--){
			for(j=i+1;j<=l;j++){
				m[i][j] = 10000;
				for(int k=i;k<=j-1;k++){
					multiplications+=2;
						sum = m[i][k] + m[k+1][j] + d[i]*d[k+1]*d[j+1];
						
						if(sum<m[i][j]){	
							m[i][j]=sum;
							s[i][j]=k;
							
						}	
				}
				
			}
		}
	    for(i=0;i<=l;i++){
	    	for(j=i+1;j<=l;j++){
				System.out.println("Array Position: "+ i+" "+j);
				System.out.println("Values: "+m[i][j]+" "+ s[i][j]);
	    	}
	    }	
	}
}
