package Dprogram;

public class Catalan {// Finds number of binary search trees possible with
	// n vertices

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long i = cat(20);
		System.out.println(i);
	}
	
	public static long cat(int n){
		if(n==0){
			return 1;
		}
		
		long count=0;
		for(int i=1;i<=n;i++){
			count+=cat(i-1)*cat(n-i);
		}
		return count;
	}

}
