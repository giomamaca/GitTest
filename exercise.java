import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		int n = readInt();
		println(hammingWeight(n));
	}

    private int hammingWeight(int n) {
        int ans = 0;
        while(n > 0){
            if(n % 10 == 1){
                ans++;
            }
            n /= 10;
        }
        return ans;
    }
}
