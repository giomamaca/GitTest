import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;

public class exercise extends ConsoleProgram {	
	public void run() {
		int x = readInt();
		println(isPalindrome(x));
		
	}
	 public int isPalindrome(int x) {
	        int k = x;
	        int a = 0;
//	        if(k < 0)return false;
	        while(k != 0){
	            a = a * 10 + x % 10;
	            k /= 10;
	        }
//	        if(x == a){
//	            return true;
//	        }
	        return x;
	    }
}
