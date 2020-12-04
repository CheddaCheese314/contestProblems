import java.util.*;
import java.io.*;

public class NastyLetter_Letizia {

	public void run() throws FileNotFoundException {

		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			int x = file.nextInt();
			file.nextLine();
			HashMap<String,ArrayList<String>> letters = new HashMap<String,ArrayList<String>>();
			for(int i=0; i<x; i++) {
				letters.put(file.nextLine(), new ArrayList<String>());
			}
			int n = file.nextInt();
			file.nextLine();
			for(int i=0; i<n; i++) {
				String line = file.nextLine();
				String a = line.substring(0,1);
				String b = line.substring(1,2);
				letters.get(a).add(b);
				letters.get(b).add(a);
			}
			String start = "*";
			TreeSet<String> cont = new TreeSet<String>();
			recur(cont, letters, start);
			for(String s:cont) {
				if(!s.equals(start)) System.out.print(s + " ");
			}
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		NastyLetter_Letizia t = new NastyLetter_Letizia();
		t.run();
	}
	
	public void recur(TreeSet<String> cont, HashMap<String, ArrayList<String>> letters, String curr) {
		for(String s : letters.get(curr)) {
			if(cont.contains(s)) {
				continue;
			} else {
				cont.add(s);
				recur(cont,letters,s);
			}
		}
		return;
	}

}