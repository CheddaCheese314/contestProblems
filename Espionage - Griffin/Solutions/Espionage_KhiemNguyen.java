import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

public class Espionage_KhiemNguyen {
	public void run() throws Exception {
		Scanner file = new Scanner(System.in);
		int times = file.nextInt();
		file.nextLine();
		String a = "";
		String b = "";
		while(file.hasNext()) {
			a += file.nextLine();
			if(file.hasNext()) {
				b+=file.nextLine();
			}
		}
		if(a.contains("*winks*") && a.contains("*checks watch*")) {
			System.out.println("JINGLE IS A SPY!");
		}else if (b.contains("*winks*") && b.contains("*checks watch*")) {
			System.out.println("GUMDROP IS A SPY!");
		}else {
			System.out.println("NO SPIES ARE PRESENT");
		}
	}

	public static void main(String[] args) throws Exception {
		new Espionage_KhiemNguyen().run();
	}

}