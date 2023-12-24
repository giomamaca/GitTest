import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {
		String s = "aad";
		println(metodi(s));
	}

	private int metodi(String s) {
		if (s.length() == 0)
			return 0;
		if (same(s))
			return 1;
		if (s.length() == 2 && !same(s))
			return 2;
		if (s.length() > 2) {
			String ans = "";
			for (int i = 0; i < s.length() - 1; i++) {
				for (int j = i + 2; j < s.length() + 1; j++) {
					String sub = s.substring(i, j);
					System.out.println(sub);
					if (different(sub) && ans.length() < sub.length()) {
						ans = sub;
					}
				}
			}
			return ans.length();
		}
		return 1;
	}

	private boolean same(String s) {
		char a = s.charAt(0);
		char x = a;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != a)
				return false;
		}
		return true;
	}

	private boolean different(String sub) {
		for (int i = 0; i < sub.length() - 1; i++) {
			char a = sub.charAt(i);
			for (int j = i + 1; j < sub.length(); j++) {
				char b = sub.charAt(j);
				if (a == b)
					return false;
			}
		}
		return true;
	}
}
