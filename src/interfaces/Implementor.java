package interfaces;

public class Implementor implements MyInterface1, MyInterface2 {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("Method 1 from MyInterface1, value of X : "+MyInterface1.x);
		
	}

	@Override
	public void method2() {
		// TODO Auto-generated method stub
		System.out.println("Method 2 from MyInterface1, value of x from Interface 2 "+MyInterface2.x);
		
	}

	@Override
	public void method3() {
		// TODO Auto-generated method stub
		System.out.println("Method 3 from MyInterface1");
		
	}

	@Override
	public void common() {
		// TODO Auto-generated method stub
		System.out.println("common from both interface");
		
	}

	@Override
	public void int1() {
		// TODO Auto-generated method stub
		System.out.println("int1 from MyInterface1");
		
	}

	@Override
	public void int2() {
		// TODO Auto-generated method stub
		System.out.println("int2 from MyInterface1");
		
	}

	@Override
	public void int3() {
		// TODO Auto-generated method stub
		System.out.println("int3 from MyInterface1");
		
	}
	

}
