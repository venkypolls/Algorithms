package helloWorld;

public class ActivitySelectionProblem {

	public static void main(String[] args) {
		//problem is to find out the least number of resources to schedule 
		//mutually compatible activities
		//given start and end times of a few activities
		//taking an arbitrary example
		//taking activities
		//1-6, 3-9, 5-8, 7-12
		int[] startTimes = {1,3,5,7};
		int[] endTimes = {6,9,8,12};
		//we got to convert this data into an adjacency matrix
		//to use the data as a graph, we assign a value 1
		//if 2 activities overlap and 0 if they don't
		int[][] A = new int[startTimes.length][startTimes.length];
		for(int i=0;i<startTimes.length;i++) {
			for(int j=i;j<endTimes.length ;j++) {
				if(!(startTimes[i]>=endTimes[j] || endTimes[i]<=startTimes[j])) {
					A[i][j] = 1;
					A[j][i] = 1;
				}
			}
		}
		//this makes and adjacency matrix which looks like this
		
		//1 1 1 0 
		//1 1 1 1 
		//1 1 1 1 
		//0 1 1 1 
		
		//now we check for every number of resources from 1 to n(number of activities)
		//if that many resources is enough to serve all activities
		for(int i = 1;i<=startTimes.length;i++) {
			int[] resources = new int[startTimes.length];
			//graphResources function tests if for i number of resources and checks if 
			//all activities can be handled by that many number of resources.
			
			if(graphResources(i, A, startTimes.length, 0, resources)) {
				System.out.println("number of colors required is :" + i);
				break;
			}
		}	
	}
	
	
	public static boolean graphResources(int resource, int[][] A, int length, int node, int[] resources){
		boolean bool = false;
		//trying to assign resources from 1 to n 1 by one by checking it's compatibility
		for(int c = 1; c<=resource; c++ ) {
			if(isSafe(node,c,A,resources,length)) {
				resources[node] = c;
				if(node+1<length) {
					//calling for the next activity
					bool = graphResources(resource,A,length,node+1,resources);
				}else{
					return true;
				}
			}
			if(bool)
				return true;
		}
		return false;
	}
	
	//used to check if 2 activities can have same resource 
	public static boolean isSafe(int node, int c, int[][] A, int[] resources,int length) {
		for(int i=0;i<length;i++) {
			if(A[node][i] == 1 && c == resources[i])
				return false;
		}
		return true;
	}
}
