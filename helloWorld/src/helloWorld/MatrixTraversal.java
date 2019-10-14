package helloWorld;

import java.util.ArrayList;
import java.util.Collections;

public class MatrixTraversal 
{ 

	static ArrayList<Integer> al = new ArrayList<>();
	
	

	private static void printMatrix(int mat[][], int m, int n, 
									int i, int j, int path[], int idx) 
	{ 
		path[idx] = mat[i][j]; 
		
		
		if (i == m - 1) 
		{ 
			for (int k = j + 1; k < n; k++) 
			{ 
				path[idx + k - j] = mat[i][k]; 
			} 
			int min = Integer.MAX_VALUE;
			for (int l = 0; l < idx + n - j; l++) 
			{ 
				System.out.print(path[l] + " "); 
//				min = Math.min(min,path[l]);
			} 
//			al.add(min);
			System.out.println(); 
			return; 
		} 
		
		
		if (j == n - 1) 
		{ 
			for (int k = i + 1; k < m; k++) 
			{ 
				path[idx + k - i] = mat[k][j]; 
			} 
			int min2 = Integer.MAX_VALUE;
			for (int l = 0; l < idx + m - i; l++) 
			{ 
				System.out.print(path[l] + " "); 
//				min2 = Math.min(min2,path[l]);
			} 
//			al.add(min2);
			System.out.println(); 
			return; 
		} 
		
		printMatrix(mat, m, n, i + 1, j, path, idx + 1); 

		
		printMatrix(mat, m, n, i, j + 1, path, idx + 1); 
	} 
	
	// Driver code 
	public static void main(String[] args) 
	{ 
		int m = 5; 
		int n = 5; 
		int mat[][] = { {1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,6}
						}; 
		int maxLengthOfPath = m + n - 1; 
		printMatrix(mat, m, n, 0, 0, new int[maxLengthOfPath], 0); 
		
//		System.out.println(Collections.max(al));
	} 
} 

