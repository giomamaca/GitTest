import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		int target = 3;
		int[] nums = { 3, 3, 2, 2 };
		println(removeElement(nums, target));
	}

	public int removeElement(int[] nums, int val) {
		int count = 0;
		int[] answer = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				count++;
				for (int j = 0; i < answer.length; j++) {
					
				}
			}
		}
		for(int k = 0; k < answer.length; k++){
			if(answer[k] == 0){
				
			}
		}
		return count;
	}
}
