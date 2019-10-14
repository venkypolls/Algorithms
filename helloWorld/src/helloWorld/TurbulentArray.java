package helloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TurbulentArray {

	public static void main(String[] args) throws IOException {
//		String line;
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		while((line=reader.readLine())!=null) {
//			
//		}
	
		int[] arr = {4,1,2,1,2,1};
		System.out.println(maxTurbulenceSize(arr));
		
	}
static int maxTurbulenceSize(int[] A) {
        
		if(A.length <2) {
			
			return A.length;
		}
		int max = 0,count=0;
		int prev = A[1] - A[0];
        if(prev <0 || prev>0){
            count = 1;
            max=1;
        }
		for(int i=2;i<A.length;i++) {
			int temp = A[i]-A[i-1];
			if(temp <0 && prev >0) {
				count++;
				
			}else if(temp >0 && prev <0) {
				count++;
				
			}else if((temp > 0&& prev>=0 )||(temp<0 && prev<=0)){
				count = 1;
			}else
                count =0;
			prev = temp;
            max = Math.max(max, count);
		}
		return max+1;
    }

}
