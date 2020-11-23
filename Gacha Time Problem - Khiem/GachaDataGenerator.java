import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;
import static java.lang.Math.*;

//change the class name
public class GachaDataGenerator {
	public void run() throws Exception {
		int asdf = (int)(Math.random()*500);
		System.out.println(asdf);
		while(asdf-->0) {
			for(int i = 0; i < 10; i++) {
				double d = (Math.random() * 100);
				if(d<=3) {
					System.out.print(5);
				}else if(d<=5) {
					System.out.print(4);
				}else {
					System.out.print((int)(Math.random()*3+1));
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) throws Exception {
		//change this to whatever your class name is
		new GachaDataGenerator().run();
	}

}