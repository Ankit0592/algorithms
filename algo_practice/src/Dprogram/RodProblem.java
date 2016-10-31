package Dprogram;



public class RodProblem {
	public static void main(String[] args) {
		int[] p = {5,7,12};
		int result = cut(p,3);
		System.out.println(result);
	}
	
	public static int cut(int[] p, int n){
		
		if(n==0)
			return 0;
		int q = -10000;
		for(int i=0; i<n;i++){
			q = Math.max(q,p[i]+cut(p,n-i-1));
		}
		
		return q;
	}
}

