import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.util.Arrays;

public class exercise extends ConsoleProgram {
	public void run() {

	}

	public String addBinary(String a, String b) {
		int ans = 0;
		int n1 = 0;
		int n2 = 0;
		for (int i = a.length(); i > 0; i--) {
			char ch = a.charAt(i);
			int b1 = gainte(ch);
			n1 = n1 + b1 * xarisxi(2);
		}
		for (int j = b.length(); j > 0; j--) {
			char chr = b.charAt(j);
			int b2 = gainte(chr);
			n2 = n2 + b2 * xarisxi(2);
		}
		ans = n1 + n2;
		return binary(ans);
	}

	private int xarisxi(int x) {
		int count = 1;
		int k = x;
		while (count != x) {
			k *= x;
			count++;
		}
	}

	private int gainte(char b1) {
		int a = b1 - '0';
		return a;
	}

	private String binary(int ans) {
		String s = "";
		int count = 0;
		int a = 2;

		while (a <= ans) {
			a *= 2;
			count++;
		}
		for (int i = 0; i < count; i++) {

		}
	}
}
