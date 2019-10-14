package helloWorld;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {17, 25, 31, 13, 2};
		for(int i =1 ; i<arr.length; i++) {
			int key = arr[i];
			int j;
			for( j =i; j>0 ; j--) {
				if(key < arr[j-1]) {
					arr[j] = arr[j-1];
				}else {
					break;
				}
			}
			arr[j] = key; 
		}
		for(int x : arr)
			System.out.println(x);
	}

}
