import java.util.ArrayList;

import acm.program.ConsoleProgram;

public class Practice57 extends ConsoleProgram{
	public void run(){
		int n = readInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		fillList(list, n);
		println(list.toString());
		makeCorrect(list);
		println(list.toString());
	}

	private void makeCorrect(ArrayList<Integer> list) {
		for(int i = 0; i < list.size(); i++){
			for(int j = 0; j < list.size(); j++){
				if(list.get(j) > list.get(i)){
					swap(list, j, i);
				}
			}
		}
	}

	private void swap(ArrayList<Integer> list, int j, int i) {
		int temp = list.get(j);
		list.set(j, list.get(i));
		list.set(i, temp);
	}

	private void fillList(ArrayList<Integer> list, int n) {
		for(int i = 0; i < n; i++){
			list.add(readInt());
		}
	}
}
