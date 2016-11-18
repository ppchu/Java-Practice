import java.util.*;
import java.io.*;

public DataTypes {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();

		for(int i = 0; i < n; i++) {
			try {
				// if it fits into long
				long val = in.nextLong();

				System.out.println(val + " can be fitted in:");
				if(val >= Byte.MIN_VALUE && val <= Byte.MAX_VALUE) {
					System.out.println("* byte");
				}
				if(val >= Short.MIN_VALUE && val <= Short.MAX_VALUE) {
					System.out.println("* short");
				}
				if(val >= Integer.MIN_VALUE && val <= Integer.MAX_VALUE) {
					System.out.println("* int");
				}
				System.out.println("* long");
			}
			catch(Exception e) {
				// it doesn't fit in long, therefore
				String line = in.nextLine();
				System.out.println(line + " can't be fitted anywhere.");
			}
		}
	}
}