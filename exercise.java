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
	        int up = fact(b);
	            System.out.println(up);
	        int down1 = fact(a);
//	        System.out.println(down1);
	        int down2 = fact(b - a);
//	            System.out.println(down2);
	        while(b >= (k + 1)/2){

	            ans = ans + (up / (down1 * down2));
//	            System.out.println(ans);
	            b -= 1;
//	            System.out.println(b);
	            a += 1;
//	            System.out.println(a);
	        }
	        return ans;
	    }
	    private int fact(int a){
	        int ans = 1;
	        while(a > 0){
	            ans *= a;
	            a = a - 1;
	        }
	        return ans;
	    }
}
