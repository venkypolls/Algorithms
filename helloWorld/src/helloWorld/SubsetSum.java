package helloWorld;

public class SubsetSum {

	public static void main(String[] args) {
		int[] subset = {2,3,7,8,10};
		int sum = 15;
			
		System.out.println(subset(subset,sum));
	}
	
	public static boolean subset(int[] subset,int sum) {
		
		boolean[][] dp = new boolean[subset.length][sum+1];
		for(int i =0; i<subset.length;i++) {
			dp[i][0] = true;
		}
		for(int i =1; i<=sum;i++) {
			if(i == subset[0])
				dp[0][i] = true;
			else
				dp[0][i] = false;
		}
		for(int i =1 ;i<subset.length;i++) {
			for(int j=1; j<=sum; j++) {
				if( dp[i-1][j])
					dp[i][j] = true;
				else if(subset[i]<=j && dp[i-1][j-subset[i]]) {
					dp[i][j] = true;
				}		
			}
		}
		for(int i =0 ;i<subset.length;i++) {
			for(boolean x: dp[i])
				System.out.print(x+" ");
			System.out.print("\n");
		}	
		return dp[subset.length-1][sum];
	}
}
