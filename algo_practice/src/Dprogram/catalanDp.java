package Dprogram;

public class catalanDp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] tab = new int[1024];
		tab[1] =1;
		tab[2] =2;
		long i = cat(4, tab);
		System.out.println(i);
	}
	
	public static long cat(int n, int[] t){
		if(n==0){
			return 1;
		}
		if(t[n]!=0){
			return t[n];
		}
		
		for(int i=1;i<=n;i++){
			t[n]+=cat(i-1,t)*cat(n-i,t);
		}
		return t[n];
	}
}
