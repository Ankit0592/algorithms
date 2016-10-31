package Dprogram;

public class fibRec {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		int i =fib(30);
		long stopTime = System.nanoTime();
		System.out.println(stopTime-startTime);
		
	}
	public static int fib(int n){
		
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		
		return (fib(n-1)+fib(n-2));
	}	
}
