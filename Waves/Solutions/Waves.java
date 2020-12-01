import java.util.*;
import java.io.*;

public class Waves {

	public void run() throws FileNotFoundException {

		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			s = s.toLowerCase();
			s = s.replaceAll(" ","");
			int x = s.length();
			for(int i=x-2; i>=0; i--) {
				if(s.charAt(i)==s.charAt(i+1)) {
					s = s.substring(0,i)+s.substring(i+1);
					i--;
				}
			}
			x = s.length();
			String result = "";
			for(int i=1; i<x-1; i++) {
				if(s.charAt(i-1)<s.charAt(i) && s.charAt(i)>s.charAt(i+1)) {
					result += s.substring(i,i+1).toUpperCase();
				}
				if(s.charAt(i-1)>s.charAt(i) && s.charAt(i)<s.charAt(i+1)) {
					result += s.substring(i,i+1).toLowerCase();
				}
			}
			System.out.println(result.length()==0?"empty":result);
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		Waves t = new Waves();
		t.run();
	}

}