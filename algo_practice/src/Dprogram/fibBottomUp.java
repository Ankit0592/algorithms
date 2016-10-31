package Dprogram;

public class fibBottomUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long startTime = System.nanoTime();
		int i =fib(60);
		long stopTime = System.nanoTime();
		System.out.println(stopTime-startTime);
	}
	
	public static int fib(int n){
		int[] fib = new int[n+1];
		if(n==0)
			return 0;
		if(n==1)
			return 1;
		fib[0] = 0;
		fib[1] = 1;
		for(int i=2;i<=n;i++){
			fib[i] = fib[i-1]+fib[i-2];
		}
		return fib[n];
	}

}
