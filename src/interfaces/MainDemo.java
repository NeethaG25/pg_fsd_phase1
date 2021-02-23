package interfaces;

public class MainDemo {

	public static void main(String[] args) {
		
		System.out.println("Accessing Implementor through interface 1");
		MyInterface1 i1 = new Implementor();
		i1.common();
		i1.method1();
		i1.method2();
		i1.method3();
		
		System.out.println("\n\nAccessing Implementor through interface 2");
		MyInterface2 i2 = new Implementor();
		i2.common();
		i2.int1();
		i2.int2();
		i2.int3();

	}

}
