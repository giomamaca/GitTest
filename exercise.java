import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {	
	public void run() {
		int target = 5;
		int[] nums = new int [4];
		nums[0] = 1;
		nums[1] = 3;
		nums[2] = 6;
		nums[3] = 7;
		println(searchInsert(nums, target));
	}

	public int searchInsert(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            if(nums[i] < target){
                return 0;
            }else{
            	return i;
            }
            
        }
        return 0;
    }
}
