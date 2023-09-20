package myPackages.p1;

import java.util.*;

public class Maximum{
	public static int max(int n1,int n2, int n3)
	{
		int maximum;
		maximum = n1;
		if(n1>n2 && n1>n3)
		{
			maximum = n1;
		}
		if(n2>n1 && n2>n3)
		{
			maximum = n2;
		}
		if(n3>n2 && n1<n3)
		{
			maximum = n3;
		}

		return maximum;
	}

	public static float max(float n1,float n2, float n3)
	{

		float maximum;
		maximum = n2;
		if(n1>n2 && n1>n3)
		{
			maximum = n1;
		}
		if(n2>n1 && n2>n3)
		{
			maximum = n2;
		}
		if(n3>n2 && n1<n3)
		{
			maximum = n3;
		}

		return maximum;
	}

	public static int max(int arr[], int len)
	{
		int maximum;
		maximum = arr[0];
		for(int i = 0 ; i< len; i++)

		{
			if(arr[i]>maximum)
				maximum = arr[i];
		}

		return maximum;
	}

	public static int max(int arr[][], int r, int c)
	{
		int maximum;
		maximum = arr[0][0];
		for(int i = 0 ; i< r;i++)
		{
			for(int j = 0 ; j < c ; j++)
			{
				if(arr[i][j]>maximum)
					maximum = arr[i][j];
			}
		}

		return maximum;
	}


}
