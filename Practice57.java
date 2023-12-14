import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice57 extends ConsoleProgram{
	public void run(){
		int n = readInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		fillList(list, n);
		makeCorrect(list);
	}

	private void makeCorrect(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.size(); j++){
				if(list.get(j) > list.get(i)){
					swap(j, i);
				}
			}
		}
	}

	private void swap(int j, int i) {
		int temp = i;
		j = i;
		
	}

	private void fillList(ArrayList<Integer> list, int n) {
		for(int i = 0; i < n; i++){
			list.add(readInt());
		}
	}
}
