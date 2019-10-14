package helloWorld;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Random;


class MaxComp implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}
public class PriorityQueueInbuilt {

	public static void main(String[] args) {
		
//		PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(15,Collections.reverseOrder());
		PriorityQueue<Integer> pqMax = new PriorityQueue<Integer>(15,new MaxComp());
		for(int i=0;i<15;i++) {
			int data = new Random().nextInt(100);
			pqMax.add(data);
		}
		for(int i=0;i<15;i++) {
			System.out.print(pqMax.poll()+" ");
		}
		System.out.println("\n");
		PriorityQueue<Integer> pqMin = new PriorityQueue<Integer>();
		for(int i=0;i<11;i++) {
			int data = new Random().nextInt(100);
			pqMin.offer(data);
		}
		for(int i=0;i<11;i++) {
			System.out.print(pqMin.poll()+" ");
		}
//		Collections.reverseOrder()
	}

}
