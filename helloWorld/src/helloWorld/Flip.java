package helloWorld;

public class Flip {

	public static void main(String[] args) {
		
		String A = "010";
		String[] intStr = A.split("");
        int[] arr = new int[intStr.length];
        for(int i=0; i<intStr.length; i++){
            arr[i] = Integer.parseInt(intStr[i]);
        }
        int stI =-1, enI =-1;
        boolean zeroF = false;
        for(int i =0; i <intStr.length; i++){
            if(arr[i] == 0 && !zeroF){
                zeroF = true;
                stI = i;
            }
            if(zeroF && arr[i] == 0){
                enI = i;
            }
            if(zeroF && arr[i] == 1)
                break;
                
        }
        int[] ret = new int[2];
        if(stI != -1 && enI == -1){
            ret[0] = stI;
            ret[1] = stI;
            System.out.print(ret[0]+" "+ret[1]);
        }
        else if(stI == -1 && enI == -1)
        	System.out.print(ret[0]+" "+ret[1]);
        else{
            ret[0] = stI;
            ret[1] = enI;
            System.out.print(ret[0]+" "+ret[1]);
        }
        
	}

}
