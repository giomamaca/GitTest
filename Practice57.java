import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice57 extends ConsoleProgram {
	public void run() {
		String first = readLine("enter first : ");
		String second = readLine("enter second : ");
		println(isAnagram(first, second));
	}

	private boolean isAnagram(String first, String second) {
		int[] one = new int[26];
		int[] two = new int[26];
		fillArr(one, first);
		fillArr(two, second);

		return anagram(one, two);
	}

	private boolean anagram(int[] one, int[] two) {
		if (one.length != two.length)
			return false;
		for (int i = 0; i < one.length; i++) {
			if (one[i] != two[i])
				return false;
		}
		return true;
	}

	private void fillArr(int[] one, String first) {
		for (int i = 0; i < first.length(); i++) {
			char c = first.charAt(i);
			one[c - 'a']++;
		}
	}
}
