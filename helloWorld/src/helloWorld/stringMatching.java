package helloWorld;


public class stringMatching {

	public static void main(String[] args) {
		String str = "aaaakljh";
		String findStr = "aa";
		System.out.println(str.split(findStr, -1).length-1);

	}

}
