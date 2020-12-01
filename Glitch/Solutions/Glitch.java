import java.util.*;
import java.io.*;

public class Glitch {

	public void run() throws FileNotFoundException {

		Scanner file = new Scanner(new File("glitch"));
		int times = file.nextInt();
		file.nextLine();

		for (int asdf = 0; asdf < times; asdf++) {
			String expression = file.nextLine();
			while(expression.contains("&")) {
				int x = expression.indexOf('&');
				int left = x-1;
				boolean leftRed = expression.charAt(x-1)=='#';
				int right = x+1;
				boolean rightRed = expression.charAt(x+1)=='#';
				while(left>=0 && (expression.charAt(left)=='#' || expression.charAt(left)=='@')) {
					left--;
				}
				left++;
				while(right<expression.length() && (expression.charAt(right)=='#' || expression.charAt(right)=='@')) {
					right++;
				}
				expression = expression.substring(0,left) + expression.substring(right);
				int a = x-left;
				int b = right-x-1;
				int c = a+b;
				for(int i=0; i<c; i++) {
					expression = expression.substring(0,left+i) + (leftRed==rightRed?"#":"@") + expression.substring(left+i);
				}
			}
			while(expression.contains("*")) {
				int x = expression.indexOf('*');
				int left = x-1;
				boolean leftRed = expression.charAt(x-1)=='#';
				int right = x+1;
				boolean rightRed = expression.charAt(x+1)=='#';
				while(left>=0 && (expression.charAt(left)=='#' || expression.charAt(left)=='@')) {
					left--;
				}
				left++;
				while(right<expression.length() && (expression.charAt(right)=='#' || expression.charAt(right)=='@')) {
					right++;
				}
				expression = expression.substring(0,left) + expression.substring(right);
				int a = x-left;
				int b = right-x-1;
				int c = a*b;
				for(int i=0; i<c; i++) {
					expression = expression.substring(0,left+i) + (leftRed==rightRed?"#":"@") + expression.substring(left+i);
				}
			}
			while(expression.contains("%")) {
				int x = expression.indexOf('%');
				int left = x-1;
				boolean leftRed = expression.charAt(x-1)=='#';
				int right = x+1;
				boolean rightRed = expression.charAt(x+1)=='#';
				while(left>=0 && (expression.charAt(left)=='#' || expression.charAt(left)=='@')) {
					left--;
				}
				left++;
				while(right<expression.length() && (expression.charAt(right)=='#' || expression.charAt(right)=='@')) {
					right++;
				}
				expression = expression.substring(0,left) + expression.substring(right);
				int a = x-left;
				int b = right-x-1;
				int c = a-b;
				for(int i=0; i<c; i++) {
					expression = expression.substring(0,left+i) + (leftRed==rightRed?"#":"@") + expression.substring(left+i);
				}
			}
			while(expression.contains("$")) {
				int x = expression.indexOf('$');
				int left = x-1;
				boolean leftRed = expression.charAt(x-1)=='#';
				int right = x+1;
				boolean rightRed = expression.charAt(x+1)=='#';
				while(left>=0 && (expression.charAt(left)=='#' || expression.charAt(left)=='@')) {
					left--;
				}
				left++;
				while(right<expression.length() && (expression.charAt(right)=='#' || expression.charAt(right)=='@')) {
					right++;
				}
				expression = expression.substring(0,left) + expression.substring(right);
				int a = x-left;
				int b = right-x-1;
				int c = a/b;
				for(int i=0; i<c; i++) {
					expression = expression.substring(0,left+i) + (leftRed==rightRed?"#":"@") + expression.substring(left+i);
				}
				
			}
			System.out.println(expression.substring(0,1)+expression.length());
		}

	}

	public static void main(String[] args) throws FileNotFoundException {
		Glitch t = new Glitch();
		t.run();
	}

}