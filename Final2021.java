import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Final2021 extends ConsoleProgram{
	public void run(){
		String s = readLine();
		int k = readInt();
		nawili(s, k);
		print(nawili(s, k).length());
		print(nawili(s, k));
	}


	private String nawili(String s, int k) {
		ArrayList<String> list = new ArrayList<String>();
		String ans = "";
		String str = "";
		String tst = "";
		int count = 0;
		int test = 0;
		int size = 0;
		
		char b = s.charAt(0);
		for(int i = 0; i < s.length(); i++){
			char a = s.charAt(i);
			if(a == b){
				str += a;
			}else{
				list.add(str);
				str = a + "";
				b = a;
			}
		}
		char last = s.charAt(s.length() - 1);
		for(int h = s.length() - 1; h > 0; h--){
			if(s.charAt(h) == last){
				size++;
			}else{
				last = 0;
			}
		}
		String sub = s.substring(s.length() - size);
		list.add(sub);
		
		for(int j = 0; j < list.size() - k + 1; j++){
			for(int p = 0; p < k; p++){
				String cor = list.get(j + p);
				tst += cor;
			}
			if(tst.length() > count){
				ans = tst;
				count = tst.length();
			}
			tst = "";
		}
		
		return ans;
	}
}
