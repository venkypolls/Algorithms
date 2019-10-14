package helloWorld;

public class Sneha {

	public static void main(String[] args) {
		//(3a)^n/2
		int a = 1;
		int n = 20;
		int[] arr = new int[20];
		arr[0] = 3*a;
		int i = 2,j=1;
		while(i <= n/2) {
			arr[j] = arr[j-1]*arr[j-1];
			j++;
			i = i* 2;	
		}
		String binary = Integer.toBinaryString(n/2);
		double res = 1.0;
//		for(int x : arr)
//			System.out.println(x);
		
		for(int k = 0; k<j;k++) {
			if(binary.charAt(k) == '1')
				res = res*arr[j-1-k];
		}
		
		if(n%2 == 1) {
			res = res * (Math.sqrt(3*a));
			System.out.println("hi");
		}
		
		
		System.out.println(res);
	}
}
