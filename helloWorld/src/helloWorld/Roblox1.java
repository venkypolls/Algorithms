package helloWorld;

public class Roblox1 {

	public static void main(String[] args) {
		
		System.out.println(consecutiveNumbersSum(15));
	}
	public static int consecutiveNumbersSum(int N) {
		int count = 0, devidend = N, devisor = 1;
		while (devisor <= devidend) {
			if (devidend % devisor == 0) count++;
			devidend -= devisor;
			devisor++;
		}
		return count;
	}
}
