package Dprogram;

public class fibSpace {
	public static void main(String[] args) {
		int i = fib(6);
		System.out.println(i);
	}
	
	public static int fib(int n){
		int a=0,b =1,sum=0,i;
		for(i=0;i<n-1;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
}
