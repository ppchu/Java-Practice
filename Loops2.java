import java.util.*;
import java.io.*;
import java.math.*;

class Loops2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int q = in.nextInt();		// queries
		for(int i = 0; i < q; i ++) {
			int a = in.nextInt()	// a
			int b = in.nextInt()	// b
			int n = in.nextInt()	// n
			
			int res = a + b;
			System.out.print(res);

			for(int j = 1; j < n; j++) {
				res += Math.pow(2, j) * b;
				System.out.print(" " + res);
			}
			System.out.println();
		}
	}
}