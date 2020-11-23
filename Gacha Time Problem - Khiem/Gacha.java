import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

//change the class name
public class Gacha {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);

		//read in the number at the top of the data file
		int times = file.nextInt();
		//pick up the left over enter key
		file.nextLine();

		//read in each data set
		int fi = 0;
		int fo = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			String in = file.nextLine();
			for(int i = 0; i < in.length(); i++) {
				int ad = Integer.parseInt(in.substring(i,i+1));
				if(ad == 4) {
					fo++;
				}else if (ad == 5) {
					fi++;
				}
			}
		}
		if(fo/(double)(times*10) >= 0.05) {
			System.out.println("Four stars are great,");
			if(fi/(double)(times*10) >= 0.03) {
				System.out.println("Five stars are great,");
				System.out.println("and\nRate Up is not a Lie");
			}else {
				System.out.println("but\nRATE UP IS A LIE!");
			}
		}else if(fi/(double)(times*10) >= 0.03) {
			System.out.println("Five stars are great,\nbut\nRATE UP IS A LIE!");
		}else {
			System.out.println("RATE UP IS A LIE!");
		}
	}

	public static void main(String[] args) throws Exception {
		//change this to whatever your class name is
		new Gacha().run();
	}

}