package DiamondProblem;

public class C extends A,B { // Will not compile
	public void bar() {
		super.foo();
	}

}
