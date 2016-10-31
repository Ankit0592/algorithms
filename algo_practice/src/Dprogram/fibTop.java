package Dprogram;

public class fibTop {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		 int[] fib = new int[31];
		 fib[0] = 0;
		 fib[1] = 1;
				long startTime = System.nanoTime();
				int i =fibo(30, fib);
				long stopTime = System.nanoTime();
				System.out.println(stopTime-startTime);
				
				
			}
			public static int fibo(int n,int[] fib){
				
				if(n<=1){
					return fib[n];
				}
				else if(fib[n]!=0){
						return fib[n];
					}
				else{
					fib[n] = fibo(n-1,fib) + fibo(n-2,fib);
				}
				
				return fib[n];
				
			}	
}
