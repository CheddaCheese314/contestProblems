import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Backwards_KhiemNguyen {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("backwards.dat"));
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String in = new StringBuilder(file.nextLine()).reverse().toString();
			System.out.println(in.substring(0,1).toUpperCase()+in.substring(1));
		}
	}

	public static void main(String[] args) throws Exception {
		new Backwards_KhiemNguyen().run();
	}

}