package helloWorld;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arr = {4,7,6,2,3,5,1,9,8};
		int sort = 0;
		while(sort<arr.length-1) {
			int min = arr[sort];
			int index = sort;
			for(int i =sort+1 ; i<arr.length;i++) {
				if(min>arr[i]) {
					min = arr[i];
					index = i;
				}
			}
			int temp = arr[index];
			arr[index] = arr[sort];
			arr[sort] =temp;
			sort++;
		}
		for(int x:arr)
			System.out.print(x+" ");
	}

}
