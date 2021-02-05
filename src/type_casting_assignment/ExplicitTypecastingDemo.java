package type_casting_assignment;

public class ExplicitTypecastingDemo {

	public static void main(String[] args) {
		
		/* explicit ->done by developer -> we as developers we should explicitly say to the compiler to covert it to the respective type-> larger size to smaller ones */
		
		float f1 = 30.3f;
		System.out.println("float f1 = "+f1);
		double d1 = (double)f1;
		System.out.println("float -> double : d1 = "+d1);
		long l1 = (long)f1;
		System.out.println("float -> long : l1 = "+l1);
		int i1 = (int)f1;
		System.out.println("float -> int : i1 = "+i1);
		short s1 = (short)f1;
		System.out.println("float -> short : s1 = "+s1);
		byte b1 = (byte)f1;
		System.out.println("float -> byte : b1 = "+b1);
		char c1 = (char)f1;
		System.out.println("float -> char : c1 = "+c1);
		
		double d2 = 40.2;
		System.out.println("\ndouble : d2 = "+d2);
		long l2 = (long)d2;
		System.out.println("double -> long : l2 = "+l2);
		int i2 = (int)d2;
		System.out.println("double -> int : i2 = "+i2);
		short s2 = (short)d2;
		System.out.println("double -> short : s2 = "+s2);
		byte b2 = (byte)d2;
		System.out.println("double -> byte : b2 = "+b2);
		char c2 = (char)d2;
		System.out.println("double -> char : c2 = "+c2);
		
		long l3 = 90;
		System.out.println("\nlong : l3 = "+l3);
		int i3 = (int)l3;
		System.out.println("long -> int : i3 = "+i3);
		short s3 = (short)l3;
		System.out.println("long -> short : s3 = "+s3);
		byte b3 = (byte)l3;
		System.out.println("long -> byte : b3 = "+b3);
		char c3 = (char)l3;
		System.out.println("long -> char : c3 = "+c3);
		
		int i4 = 600;
		System.out.println("\nint : i4 = "+i4);
		short s4 = (short)i4;
		System.out.println("int -> short : s4 = "+s4);
		byte b4 = (byte)i4;
		System.out.println("int -> byte : b4 = "+b4);
		char c4 = (char)i4;
		System.out.println("int -> char : c4 = "+c4);
		
		short s5 = 15;
		System.out.println("\nshort : s5 = "+s5);
		byte b5 = (byte)s5;
		System.out.println("short -> byte : b5 = "+b5);
		char c5 = (char)s5;
		System.out.println("short -> char : c5 = "+c5);
		
		byte b6 = 21;
		System.out.println("\nbyte : b6 = "+b6);
		char c6 = (char)b6;
		System.out.println("byte -> char : c6 = "+c6);

	}

}
