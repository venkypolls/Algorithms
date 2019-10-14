package helloWorld;

import java.util.Arrays;

public class KnapsackDynamic {

	public static void main(String[] args) {
		
		int weightValue[][] = {{10,60},{20,100},{30,120}};
		int capacity =50;
		int max[] = new int[51];
		max[0] = 0;
		Arrays.fill(max, -1);
		System.out.print(knapsack(capacity, max, weightValue));
		

	}
	public static int knapsack(int capacity,int[] max, int[][] weightValue) {
		int maxVal = 0;
		if(capacity<=0)
			return 0;
		for(int i=0 ;i <weightValue.length;i++) {
			int knap;
			if(capacity-weightValue[i][0]>=0) {
				if(max[capacity-weightValue[i][0]] != -1)
					knap = max[capacity-weightValue[i][0]];
				else
					knap = knapsack(capacity-weightValue[i][0],max,weightValue);
				if(maxVal < knap+weightValue[i][1]) {
					maxVal = knap+weightValue[i][1];
				}
			}
		}
		max[capacity] = maxVal;	
		return maxVal;
	}
	
	
}
