import java.util.*;

interface putGrade
{
	void putGrade();
}

class Student implements putGrade{
	int rno;
	int marks;
	int sportsmarks;

	Scanner sc = new Scanner(System.in);

	void getNumer()
	{
		System.out.println("Enter roll number: ");
		rno = sc.nextInt();
	}

	void getMarks()
	{
		System.out.println("Enter marks: ");
		marks = sc.nextInt();
	}	

	void putrno()
	{
		System.out.println("Student marks: "+marks);
	}

	void putMarks()
	{
		System.out.println("Student roll number: "+rno);
	}

	
}

class Result extends Student{
	public void putGrade()
	{
		System.out.println("Enter sports marks: ");
		sportsmarks = sc.nextInt();
	}
}