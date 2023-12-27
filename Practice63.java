import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

import acm.program.ConsoleProgram;

public class Practice63 extends ConsoleProgram {
	public void run1() {
		HashMap <String, Set<String>> map = new HashMap <String, Set<String>>();
		
		while(true){
			String s = readLine();
			if(map.isEmpty()){
				break;
			}
			StringTokenizer tok = new StringTokenizer(s);
			String a = tok.nextToken();
			String b = tok.nextToken();
			map.putIfAbsent(b, new HashSet<String>());
			map.get(b).add(a);
		}
		String name = null;
		println(map);
		int ans = 0;
		for(String friend : map.keySet()){
			int amount = map.get(friend).size();
			if(amount > ans){
				ans = amount;
				name = friend;
			}
		}
		println(name);
		println(map);
	}
	
	
	
	
	
	
	
	
	
	public void run(){
		ArrayList<String> list = new ArrayList<String>();
		String s = readLine();
		list.add(s);

		while (!s.equals("")) {
			s = readLine();
			list.add(s);

		}
		println(moreFriends(list));
	}

	private String moreFriends(ArrayList<String> list) {
		String answer = "";
		int count = 1;
		int how1 = 0;
		int how2 = how1;

		String friend = "";

		for (int i = 0; i < list.size(); i++) {
			String ls = list.get(i);
			StringTokenizer tk = new StringTokenizer(ls, " ");
			while (tk.hasMoreTokens()) {
				String s = tk.nextToken();
				if (count % 2 == 1) {
					friend += s;
					friend += " ";
				}
				count++;
			}
		}
		String correct = friend;
		
		ArrayList<String> l = new ArrayList<String>();
		
		StringTokenizer tok = new StringTokenizer(correct, " ");
		while (tok.hasMoreTokens()) {
			String str = tok.nextToken();
			l.add(str);
		}
		for (int p = 0; p < l.size(); p++) {
			String r = l.get(p);
			for (int t = p; t < l.size(); t++) {
				String g = l.get(t);
				if (r.equals(g)) {
					how1++;
				}
				if (how1 > how2) {
					answer = r;
					how2 = how1;
				}
			}
			how1 = 0;
		}
		return answer;
	}
}
