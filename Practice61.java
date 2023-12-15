import java.util.ArrayList;
import java.util.HashMap;

import acm.program.ConsoleProgram;

public class Practice61 extends ConsoleProgram{
	public void run(){
		int count = 0;
		
		int m = readInt();
		int n = readInt();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(count != n){
			int num = readInt();
			list.add(num);
			count++;
		}
		for(int i = 0; i < list.size() - 1; i++){
			int a = list.get(i);
			for(int j = i + 1; j < list.size(); j++){
				int b = list.get(j);
				if((a + b) == m){
					println(a + " and " + b);
				}
			}
		}
	}
	public void run1(){
		int m = readInt();
		int n = readInt();
		boolean found = false;
		int[] array = new int[n];
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for(int i = 0; i < n; i++){
			array[i] = readInt();
			hashMap.put(array[i], i);
		}
		for(int i = 0; i < n; i++){
			int index = hashMap.getOrDefault(m- array[i], -1);
			if(index != -1){
				println(i + " + " + index);
				found = true;
				break;
			}
		}
		if(!found){
			println("Wrong!");
		}
	}
}
