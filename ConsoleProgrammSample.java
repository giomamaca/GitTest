import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;

import acm.graphics.GOval;
import acm.program.*;

public class ConsoleProgrammSample extends ConsoleProgram {
	public void run() {
		HashMap<String, String> map = new HashMap<String, String>();
		
	}
	 public boolean isValid(String s) {
	 if(s.length() % 2 == 1) return false;
     boolean a = false;
     for(int i = 0; i < s.length() - 1; i += 2){
    	 String k = s.charAt(i) + "";
    	 String p = s.charAt(i + 1) + "";
        if(k.equals("(") && p.equals(")")){
            a = true;
        }else if(k.equals("[") && p.equals("]")){
            a = true;
        }else if(k.equals("{") && p.equals("}")){
            a = true;
        }else{
            return false;
        }
     }
     return a;
  }
}
