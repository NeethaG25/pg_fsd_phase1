package innerclasses;

public class outer {
	
	public void outerMethod() {
		System.out.println(("Hi from outerMethod"));
	}
	
	private class InnerPrivate{
		public void innerPrivateMethod() {
			System.out.println("Hello from innerPrivateMethod of InnerPrivate class");
		}
		
		class InnerInner {
			
		}
	}
	
	public class InnerPublic{
		public void innerPublicMethod() {
			System.out.println("Hello from innerPrivateMethod of InnerPrivate class");
		}
		
		class InnerInner {
			
		}
	}
	
	public static class InnerPublicStatic {
		public void innerPublicNonStaticMethod() {
			System.out.println("Hi from innerPublicNonStaticMethod of InnerPublicStatic");
		}
		
		public static void innerPublicStaticMethod() {
			System.out.println("Hi from innerPublicStaticMethod of InnerPublicStatic");
		}
	}

}
