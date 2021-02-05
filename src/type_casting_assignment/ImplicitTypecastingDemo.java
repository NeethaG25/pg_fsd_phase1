package type_casting_assignment;

public class ImplicitTypecastingDemo {

	public static void main(String[] args) {
		/* implicit -> compiler -> assign smaller in size to larger in size */
		
		byte b1 = 10;
		System.out.println("byte b1 = "+b1);
		short s1 = b1;
		System.out.println("byte -> short : s1 = "+s1);
		int i1 = b1;
		System.out.println("byte -> int : i1 = "+i1);
		long l1 = b1;
		System.out.println("byte -> long : l1 = "+l1);
		float f1 = b1;
		System.out.println("byte -> float : f1 = "+f1);
		double d1 = b1;
		System.out.println("byte -> double : d1 = "+d1);
		
		short s2 = 45;
		System.out.println("\nshort s2 = "+s2);
		int i2 = s2;
		System.out.println("short -> int : i2 = "+i2);
		long l2 = s2;
		System.out.println("short to long : l2 = "+l2);
		float f2 = s2;
		System.out.println("short -> float : f2 = "+f2);
		double d2 = s2;
		System.out.println("short -> double : d2 = "+d2);
		
		int i3 = 30;
		System.out.println("\nint : i3 = "+i3);
		long l3 = i3;
		System.out.println("int to long : l3 = "+l3);
		float f3 = i3;
		System.out.println("int -> float : f3 = "+f3);
		double d3 = i3;
		System.out.println("int -> double : d3 = "+d3);
		
		long l4 = 500;
		System.out.println("\nlong : l4 = "+l4);
		float f4 = l4;
		System.out.println("long -> float : f4 = "+f4);
		double d4 = l4;
		System.out.println("long -> double : d4 = "+d4);
		
		float f5 = 60.3f;
		System.out.println("\nfloat : f5 = "+f5);
		double d5 = f5;
		System.out.println("long -> double : d5 = "+d5);
		
		char c6 = 'a';
		System.out.println("\nchar : c6 = "+c6);
		int i6 = c6;
		System.out.println("char -> int : i6 = "+i6);
		long l6 = c6;
		System.out.println("char -> long : l6 = "+l6);
		float f6 = c6;
		System.out.println("char -> float : f6 = "+f6);
		double d6 = c6;
		System.out.println("char -> double : d6 = "+d6);

	}

}
