package helloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class barclays1 {
	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in,java.nio.charset.StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		
		String line ;
		try {
			while((line = in.readLine()) != null){
				//code goes here
				String[] split_array = line.split("");
				int[] integer_vals = new int[split_array.length];
				boolean bool = false;
				for(int j=split_array.length-1; j>=0 ;j--) {
					if(bool) {
						integer_vals[j] = Integer.parseInt(split_array[j])*2;
						bool = false;
					}else {
						integer_vals[j] = Integer.parseInt(split_array[j]);
						bool = true;
					}
				}
				int sum = 0;
				for(int j = 0; j<integer_vals.length;j++) {
					if(integer_vals[j]<10) {
						sum+=integer_vals[j];
					}else {
						int first = integer_vals[j]/10;
						int second = integer_vals[j]%10;
						sum += first+second;
					}
				}
				System.out.println(sum);
				//code ends here
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
