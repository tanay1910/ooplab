import java.util.*;

interface Series{
	int getNext();
	void reset();
	void setStart(int num);
}

class ByTwos implements Series{
	int start;
	static int count;
	int orig;

	ByTwos()
	{

	}

	public void setStart(int num)
	{
		start = num;
		count=start;
		orig = start;
	}

	public int getNext()
	{
		count = count + 2;
		// System.out.println("Next number in bytwos series: "+count);
		return count;
	}

	public void reset()
	{
		start = orig;
		count = orig;
	}
}

public class l7q3{
	public static void main(String[] args)
	{
		ByTwos by2s = new ByTwos();

		by2s.setStart(2);
		System.out.println("Next element in by2s series: "+(by2s.getNext()));
		System.out.println("Next element in by2s series: "+(by2s.getNext()));
		System.out.println("Next element in by2s series: "+(by2s.getNext()));
		by2s.reset();


		System.out.println("Hello World!");
	}
}