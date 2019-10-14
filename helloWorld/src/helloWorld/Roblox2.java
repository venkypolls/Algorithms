package helloWorld;

import java.util.HashSet;
import java.util.Set;

public class Roblox2 {

	public static void main(String[] args) {
		int[] nums = {2,3,4,1,5,2,3,4,4,6};
		int target = 5;
		System.out.println(uniquePairs(nums,target));
	}
	public static int uniquePairs(int[] nums, int target){
        Set<Integer> set = new HashSet<Integer>();
        Set<Integer> seen = new HashSet<Integer>();
        int count = 0;
        for(int num : nums){
            if(set.contains(target-num) && !seen.contains(num)){
                count++;
                seen.add(target-num);
                seen.add(num);
            }
            else if(!set.contains(num)){
                set.add(num);
            }
        }
        return count;
    }
}

/* 3 2 5 4 1    5
set 3 5 4

seen 3 2 1 4

*/