import acm.graphics.*;
import acm.program.ConsoleProgram;
import acm.program.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class exercise extends ConsoleProgram {	
	public void run() {
		
		ArrayList<String> list = new ArrayList<String>();
		try{
			BufferedReader rd = new BufferedReader(new FileReader("HangmanLexicon.txt"));
			while (true) {
				String line = rd.readLine();
				list.add(line);
				if (line == null) {
					break;
				}
			}
			list.get(1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		 getWordCount(list);
	}

	private void getWordCount(ArrayList<String> list) {
		int count = 0;
		
		for(int i = 0; i < list.size(); i++){
			count++;
		}
	}
}
