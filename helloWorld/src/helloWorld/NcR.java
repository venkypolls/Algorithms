package helloWorld;

public class NcR {

	public static void main(String[] args) {
		
		int n =3, k = 5; 
        System.out.printf("Value of C(%d, %d) is %d ", 
                        n, k, solution(n, k)); 
		
		    
	} 
	static int solution(int n, int k)  
    { 
      
		if(n<k)
			return -1;
		
        if (k == 0 || k == n) 
            return 1; 
          
        long[][] dp = new long[k+1][n+1];
        
        for(int i = 1;i<n+1;i++) {
        	for(int j=1;j<=i && j<=k ;j++) {
        		if(i==j)
        			dp[j][i] = 1;
        		else if(j == 1)
        			dp[j][i] = i;
        		else {
        			dp[j][i] = dp[j-1][i-1]+dp[j][i-1];
        			if(dp[j][i] > 1000000000)
        				return -1;
        		}
        	}
        }
        if(dp[k][n]<0)
        	return -1;
        return (int)dp[k][n];
        
        
         
    } 
  
}


