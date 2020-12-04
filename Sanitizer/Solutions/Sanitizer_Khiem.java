import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Sanitizer_Khiem {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		int total = 0;
		for (int asdf = 0; asdf < times; asdf++) {
			total+=file.nextInt();
		}
		System.out.print("$" + total);
	}

	public static void main(String[] args) throws Exception {
		new Sanitizer_Khiem().run();
	}

}