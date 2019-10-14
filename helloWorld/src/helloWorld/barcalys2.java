package helloWorld;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class barcalys2 {

	public static void main(String[] args) {
		InputStreamReader reader = new InputStreamReader(System.in,java.nio.charset.StandardCharsets.UTF_8);
		BufferedReader in = new BufferedReader(reader);
		
		String line ;
		try {
			while((line = in.readLine()) != null){
				// code goes here
				
				Stack<Character> st = new Stack<>();
			      //char[] allChar = line.toCharArray();
			      boolean isCorrect = true;
			      for(int i = line.length()-1 ;i>=0;i--){
			        if(line.charAt(i) == '}' || line.charAt(i) == ')' || line.charAt(i) == ']'){
			          st.push(line.charAt(i));
			        }else{
			          if(st.isEmpty()){
			            isCorrect = false;
			            break;
			          }else{
			            if(line.charAt(i) == '{' && st.peek() != '}' ){
			              isCorrect = false;
			              break;
			            }
			           if(line.charAt(i) == '(' && st.peek() != ')' ){
			              isCorrect = false;
			              break;
			            }
			            if(line.charAt(i) == '[' && st.peek() != ']' ){
			              isCorrect = false;
			              break;
			            }
			            st.pop();
			          }
			        }
			      }
			      if(!isCorrect || !st.isEmpty())
			        System.out.println("False");
			      else
			        System.out.println("True");
				
				//code ends here		
			}
		} catch (NumberFormatException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}


}
