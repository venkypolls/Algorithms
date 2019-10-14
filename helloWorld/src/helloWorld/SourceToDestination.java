package helloWorld;

public class SourceToDestination {
	
	static int[] paths;
	public static void main(String[] args) {
		int[][] arr = new int[][] {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,6}};
		paths = new int[9];
		dfs(0,0,4,4,0,arr);
		
		
	}
	public static void dfs(int startRow, int startCol, int endRow, int endCol, int lastIndex,int[][] arr) {
		
		paths[lastIndex] = arr[startRow][startCol];
		if(startRow == endRow && startCol == endCol) {
			for(int i=0;i<=lastIndex;i++)
				System.out.print(paths[i]);
			System.out.println();
			
			return;
		}
		if(startRow < endRow)
			dfs(startRow+1, startCol, endRow, endCol,lastIndex+1,arr);
		if(startCol < endCol)
			dfs(startRow, startCol+1, endRow, endCol,lastIndex+1,arr);
		
		return;
		
	}
	

}
