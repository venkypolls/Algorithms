package helloWorld;

public class PriorityQueueImpl {

	public static void main(String[] args) {
		
		int[] arr = {3,5,2,7,4,9,0};
		int length = 6;
		createMaxHeap(arr,length);
		length = insert(arr,length,8);
		int ele = pop(arr,length);
		System.out.println(ele);
		for(int x: arr)
			System.out.println(x);
	}
	public static void createMaxHeap(int[] arr, int length) {
		for(int k = length-1;k>-1;k--) {
			int i = k;
			while((2*i+1)<length) {
				int max =2*i+1; 
				if((2*i+2) <length && arr[2*i+1]<arr[2*i+2]) {
					max = 2*i+2;
				}
				if(arr[i]<arr[max]) {
					int temp = arr[i];
					arr[i] = arr[max];
					arr[max] = temp;
				}
				i = max;
			}
		}
	}
	public static int insert(int[] arr, int length,int key) {
		if(arr.length<=length)
			return length;
		arr[length] = key;
		int i = length;
		length++;
		while(i>=0) {
			if(arr[(i-1)/2] < arr[i]) {
				int temp = arr[(i-1)/2];
				arr[(i-1)/2] = arr[i];
				arr[i] = temp;
				i = (i-1)/2;
			}else
				break;
		}
		return length;
	}
	public static int pop(int[] arr,int length) {
		int pop = arr[0];
		arr[0] = arr[length-1];
		arr[length-1] = 0;
		int i = 0;
		while(i<length-1) {
			int max=-1;
			if(2*i+1<length-1 && 2*i+2<length-1) {
				if(arr[2*i+1]<arr[2*i+2])
					max = 2*i+2;
			}else if(2*i+1<length-1)
				max = 2*i+1;
			else
				break;
			
			if(arr[i] < arr[max]) { 
				int temp = arr[max];
				arr[max] = arr[i];
				arr[i] = temp;
			}else
				break;
				
			i = max;	
		}
		
		
		
		return pop;
	}
}

