import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {	
	public void run() {
		int target = 0;
		int[] nums = {4,5,6,7,0,1,2};
		println(search(nums, target));
	}

	  public int search(int[] nums, int target) {
	        for(int i = 0; i < nums.length; i++){
	            if(nums[i] == target){
	                 return i;
	            }else{
	                return -1;
	            }
	        }
	        return -1;
	    }
}
