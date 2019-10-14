package helloWorld;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("/Users/venkateshpolepally/eclipse-workspace/dummy1.txt");
		BufferedReader bf = new BufferedReader(new FileReader(file));
		String st;
		while((st = bf.readLine()) != null) {
			System.out.println(st);
		}
		bf.close();
	}

}
