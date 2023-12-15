import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {	
	public void run() {
		int n = readInt();
		int count = 0;
		int[] nums = new int[n];
		for(int i = 0; i < nums.length; i ++) {
			nums[i] = readInt();
		}
		println(Arrays.toString(nums));
		println(removeDuplicates(nums));
	}

	private int removeDuplicates(int[] nums) {
		int lng = 0;
		int count = 0;
		int[] answer = new int[nums.length];
		for (int i = 1; i < nums.length; i++) {
			int a = nums[0];
			if(a == nums[i]){
				count++;
			}
		}
		return count;
	}
}
