package typecast;

import java.util.Scanner;

public class TypeCast {
	public static void main(String[] args) {
		byte b = 0;
		short s = 0;
		int i;
		long l;
		float f;
		double d;
		boolean pass = false;
		
		Scanner sc = new Scanner(System.in);
		while (!pass) {									//getting byte input
			System.out.print("Input byte: ");
			try {
				b = sc.nextByte();
				pass = true;
			} catch (Exception e) {
				System.out.println("Input must be a byte.");
				sc.next();
			}
		}
		pass = false;
		while (!pass) {									//getting short input
			System.out.print("Input short: ");
			try {
				s = sc.nextShort();
				pass = true;
				System.out.println();
			} catch (Exception e) {
				System.out.println("Input must be a short.");
				sc.next();
			}
		}
		sc.close();
		
		i = s + b;
		l = i + s;
		f = l + i;
		d = f + l;
		
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}
}
