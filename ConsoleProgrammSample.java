import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		int[] prices = {50,4,6,7,84,3,2,4,79,5,3,2,2,345};
		println(maxProfit(prices));
	}

	public int maxProfit(int[] prices) {
		int ans = 0, mi = prices[0];
		for (int v : prices) {
			ans = Math.max(ans, v - mi);
			System.out.println("ans: " + ans);
			mi = Math.min(mi, v);
			System.out.println("mi: " + mi);
		}
		return ans;
	}
}
