import java.util.*;
import java.io.*;

public class Gacha_Letizia {

	public void run() throws FileNotFoundException {

		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		int four = 0;
		int five = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			for(int i=0; i<10; i++) {
				if(s.charAt(i)=='4') four++;
				if(s.charAt(i)=='5') five++;
			}
		}
		double a = (double)(four)/(times*10);
		double b = (double)(five)/(times*10);
		if(a>=0.05) System.out.println("Four stars are great,");
		if(b>=0.03) System.out.println("Five stars are great,");
		if(a>=0.05 && b>=0.03) {
			System.out.println("and");
			System.out.println("Rate Up is not a Lie");
		} else {
			System.out.println("but");
			System.out.println("RATE UP IS A LIE!");
		}
	}

	public static void main(String[] args) throws FileNotFoundException {
		Gacha_Letizia t = new Gacha_Letizia();
		t.run();
	}

}