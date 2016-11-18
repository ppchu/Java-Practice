import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Eof {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int lines = 0;

		while (in.hasNextLine()) {
		 	String line = in.nextLine();
		 	lines++;
		 	System.out.println(lines+" "+line);
		 }
	}
}