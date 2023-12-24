import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		int n = readInt();
		println(climbStairs(n));
	}

	 public int climbStairs(int n) {
	        if(n == 1) return 1;
	        if(n == 2) return 2;
	        return sum(1, n - 1);
	    }
	    private int sum(int a, int b){
	        int k = b;
	        int ans = 1;
	        while(b >= (k + 1)/2){
	            int up = fact(b);
	            int down1 = fact(a);
	            int down2 = fact(b - a);

	            ans = ans + (up / (down1 * down2));
	            b -= 1;
	            a += 1;
	        }
	        return ans;
	    }
	    private int fact(int a){
	        int ans = 1;
	        while(a > 0){
	            ans = ans * a;
	            a = a - 1;
	        }
	        return ans;
	    }
}
