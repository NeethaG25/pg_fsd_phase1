package innerclasses;

public class InnerClassDemo {

	public static void main(String[] args) {
		outer o = new outer();
		o.outerMethod();
		
		outer.InnerPublic i = o.new InnerPublic();
		i.innerPublicMethod();
		
		//outer.InnerPublicStatic i1 = outer.InnerPublicStatic();
		//i1.innerPublicNonStaticMethod();
		
		outer.InnerPublicStatic.innerPublicStaticMethod();

	}

}
