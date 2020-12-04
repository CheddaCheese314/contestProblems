import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Six_Khiem {
	public void run() throws Exception {
		Scanner file = new Scanner(new File("Six_Khiem.dat"));
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			if(Math.abs(file.nextInt()-file.nextInt()) >= 6) {
				System.out.println("Safe");
			}else {
				System.out.println("Too close!");
			}
		}
	}

	public static void main(String[] args) throws Exception {
		new Six_Khiem().run();
	}

}