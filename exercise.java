import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		String s = "adadada";
		println(s.substring(0, 3));
	}

	   private int lengthOfLongestSubstring(String s) {
	        String ans = "";
	        for(int i = 0; i < s.length() - 1; i++){
	            for(int j = i + 1; j < s.length(); j++){
	                String sub = s.substring(i, j);
	                if(different(sub) && ans.length() < sub.length()){
	                    ans = sub;
	                }
	            }
	        }
	        return ans.length();
	    }
	        private boolean different(String sub){
	            for(int i = 0; i < sub.length() - 1; i++){
	                char a = sub.charAt(i);
	                for(int j = i + 1; j < sub.length(); j++){
	                    char b = sub.charAt(j);
	                    if(a == b) return false;
	                }
	            }
	            return true;
	        }
}
