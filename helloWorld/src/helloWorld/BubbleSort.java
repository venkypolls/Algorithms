package helloWorld;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = {2,4,3,5,7,6,8,9,1};
		
		for(int i = arr.length-1; i>0;i--) {
			for(int j = 0; j<i ;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		for(int x : arr)
			System.out.print(x+" ");
	}

}
