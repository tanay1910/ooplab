import java.util.*;
import myPackages.p1.Maximum;

public class l7q2{
	public static void main(String[] args)
	{
		// Maximum m1 = new Maximum();
		
		System.out.println(Maximum.max(1,2,3));
		float a = 1;
		float b = 2;
		float c = 3;
		System.out.println(Maximum.max(a,b,c));
		int arr[] = {1,3,5,7,6};
		System.out.println(Maximum.max(arr,5));
		int arr2[][]={{1,2,3},{2,3,4},{4,5,6}};
		System.out.println(Maximum.max(arr2,3,3));
	}
}