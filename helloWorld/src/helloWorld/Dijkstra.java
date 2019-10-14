package helloWorld;

import java.util.Arrays;

public class Dijkstra {

	public static void main(String[] args) {
		
		int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
            { 4, 0, 8, 0, 0, 0, 0, 11, 0 }, 
            { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
            { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
            { 0, 0, 0, 9, 0, 10, 0, 0, 0 }, 
            { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
            { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
            { 8, 11, 0, 0, 0, 0, 1, 0, 7 }, 
            { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
            
        int[] dist = new int[graph.length];
        boolean[] visited = new boolean[graph.length];
      
        Arrays.fill(visited, false);
        visited[0] = true;
        int src = 0;
        
        for(int i=0;i<graph.length;i++) {
        	if(i == src)
        		dist[i] = 0;
        	else if(graph[src][i] == 0) {
        		dist[i] = Integer.MAX_VALUE;
        	}else {
        		dist[i] = graph[src][i];
        	}
        }
        for(int i = 0;i <graph.length-1; i++) {
        	int min = Integer.MAX_VALUE;
        	int minIndex = -1;
        	for(int j =0 ;j<dist.length;j++) {
        		if(!visited[j] && dist[j] < min) {
        			minIndex = j;
        			min = dist[j];
        		}
        	}
        	visited[minIndex] = true;
        	for(int j =0; j<graph.length ;j++) {
        		if(!visited[j]  && graph[minIndex][j] !=0  && graph[minIndex][j]+dist[minIndex] < dist[j]) {
        			dist[j] = graph[minIndex][j]+dist[minIndex];
        		}
        	}
        }
        for(int x: dist)
        	System.out.println(x);    	
 	}
}
