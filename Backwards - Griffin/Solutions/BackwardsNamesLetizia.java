import java.util.*;
import java.io.*;

public class BackwardsNamesLetizia {

	public void run() throws FileNotFoundException {

		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String s = file.nextLine();
			String a = "";
			for(int i=s.length()-1; i>=0; i--) {
				a = a+s.substring(i,i+1);
			}
			a = a.substring(0,1).toUpperCase() + a.substring(1);
			System.out.println(a);
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		BackwardsNamesLetizia t = new BackwardsNamesLetizia();
		t.run();
	}

}