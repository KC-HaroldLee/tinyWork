package complement_calc;
import java.lang.*;
import java.util.Arrays;
public class Test01 {
	public static void main(String[] args) {
		
		//input
		int a = 215;
		int b = 64;
		
		
		
		
		//to bin

		int [] aBin = new int [8];

		/*aBin [0] = a/128;							//2^7
		aBin [1] = (a-aBin[0]*128)/64;				//2^6
		aBin [2] = (a-aBin[0]*128-aBin[1]*64)/32;	//2^5
		aBin [3] = (a-aBin[0]*128-aBin[1]*64-aBin[2]*32)/16; 		//2^4
		aBin [4] = (a-aBin[0]*128-aBin[1]*64-aBin[2]*32-(aBin[3])*16)/8; 		//2^3
		aBin [5] = (a-aBin[0]*128-aBin[1]*64-aBin[2]*32-(aBin[3])*16-(aBin[4])*8)/4;			//2^2
		aBin [6] = (a-aBin[0]*128-aBin[1]*64-aBin[2]*32-(aBin[3])*16-(aBin[4])*8-(aBin[5])*4)/2;			//2^1
		aBin [7] = (a-aBin[0]*128-aBin[1]*64-aBin[2]*32-(aBin[3])*16-(aBin[4])*8-(aBin[5])-(aBin [6])*2)/1;		//2^0
		
		*/

		System.out.println(Math.pow(2,2));
		System.out.println("a = " + Arrays.toString(aBin));
		
		
		
}
}
