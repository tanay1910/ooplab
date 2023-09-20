import java.util.*;

class A{
	int i;

	A(){
		System.out.println("this is superclass constructor.");
	}

}

class B extends A{
	int i;
	B(int a, int b)
	{
		super(); //1st use of super - to refer to superclass constructor.
		super.i=a; //in A // 2nd use of super - to refer to superclass methods and variable.
		i=b;
	}

	void show()
	{
		System.out.println("in subclass: "+i);
		System.out.println("in subclass: "+super.i);
	}
}

public class Super{
	public static void main(String[] args)
	{
		B b = new B(4,5);
		b.show();
	}
}