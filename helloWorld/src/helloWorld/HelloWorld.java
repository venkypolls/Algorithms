package helloWorld;

public class HelloWorld {

	

		public static void main(String[] args) {
			
			int[][] inp = {{1,2,3},{4,5,6},{7,8,9}};
			int rowLen = inp[0].length;
			int colLen = inp.length;
			int k = 0;
			System.out.println("hi");
			while(colLen >= inp.length/2|| rowLen>= inp[0].length/2) {
				for(int i =k; i<rowLen;i++) {
					System.out.print(inp[k][i]+ " ");
				}
				for(int i=k+1 ;i<colLen;i++) {
					System.out.print(inp[i][rowLen-1] + " ");
				}
				for(int i =rowLen-2; i>=k ;i--) {
					System.out.print(inp[colLen-1][i]+" ");
				}
				for(int i =colLen-2;i>k;i--) {
					System.out.print(inp[i][k] + " ");
				}
				colLen -= 1;
				rowLen -= 1;
				k++;
			}
		}
}
