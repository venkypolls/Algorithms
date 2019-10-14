package helloWorld;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 2, 5, 8, 7, 4, 1,9 };
		quick(arr, 0, arr.length - 1);
		for(int x:arr)
			System.out.print(x+" ");
	}

	public static void quick(int[] arr, int st, int en) {
		if (st < en) {
			int pivot = arr[en];
			int start = st, end = en - 1;
			while (start <= end) {
				if (arr[start] <= pivot)
					start++;
				else if (arr[end] >= pivot)
					end--;
				else if(arr[start] > pivot && arr[end] < pivot){
					int temp = arr[end];
					arr[end] = arr[start];
					arr[start] = temp;
					end--;
					start++;
				}
			}
			int tem = arr[start];
			arr[start] = pivot;
			arr[en] = tem;
			quick(arr, st, start - 1);
			quick(arr, start + 1, en);
		}
	}
}
