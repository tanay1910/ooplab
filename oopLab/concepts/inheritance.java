import java.util.*;

class twoDshape{
	 double width;
	double height;

	twoDshape(double width, double height)
	{
		this.width=width;
		this.height=height;
	}


	void showDim()
	{
		System.out.println("width and height are: "+width +" and "+height);
	}

	void setWidth(double w){width=w;}
	void setHeight(double h){height=h;}
}

class Triangle extends twoDshape{
	String style;

	Triangle(String style,double w, double h){
		super(w,h);
		this.style=style;
	}

	double area()
	{
		System.out.println(width);
		return width*height/2;

	}

	void showStyle()
	{
		System.out.println("triangle is "+style);
	}
}

public class inheritance{
	public static void main(String[] args)
	{
		Triangle t1 = new Triangle("h",5,4);
		t1.showStyle();
		t1.showDim();

		Triangle t2 = new Triangle("iso",6,7);
		t2.showStyle();
;	}
}