package helloWorld;

public class MergeSort {

	public static void main(String[] args) {
		int arr[] = {7,6,5,4,3,2,1};
		mergeSort(arr,0,arr.length-1);
		for(int x : arr)
			System.out.print(x+" ");

	}
	public static void merge(int[] arr, int start, int mid, int end) {
		int[] temp = new int[end-start+1];
		int fi = start, se = mid+1;
		int i = 0;
		while(fi <= mid && se<=end) {
			if(arr[fi]<=arr[se]) {
				temp[i] = arr[fi];
				fi++;
			}else {
				temp[i] = arr[se];
				se++;
			}
			i++;
		}
		while(fi <= mid) {
			temp[i] = arr[fi];
			i++;
			fi++;
		}
		while(se <= end) {
			temp[i] = arr[se];
			i++;
			se++;
		}
		for(i = start; i<=end;i++ )
			arr[i] = temp[i-start];
	}
	public static void mergeSort(int[] arr, int start, int end ) {
		if(start>=end) {
			return;
		}
			int mid = (end+start)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr,mid+1,end);
			merge(arr,start,mid,end);	
	}
}
