// import java.util.*; 
 
// class Student { 
//     String sname; 
//     int[] marks_array; 
//     double total, avg; 
 
//     Student(String name, int[] marks) {    
//         sname = name; 
//         marks_array = marks; 
 
//         compute(); 
//     } 
 
//     Student() { 
//         sname = "Anonymous"; 
//         marks_array = new int[]{0}; 
 
//         compute(); 
//     } 
 
 
//     void compute() { 
//         total = 0; 
//         for (double i : marks_array) 
//             total += i; 
 
//         avg = total / marks_array.length; 
//     } 
 
 
//     void display() { 
//         System.out.println("Name: "+sname); 
//         System.out.print("Marks: "); 
//         for(int item: marks_array) 
//         { 
//             System.out.print(item+" "); 
//         } 
//         System.out.println("Total: "+total); 
//         System.out.println("Average: "+avg); 
//     } 
// } 
 
 
// public class l4q1 { 
 
//     public static void main(String[] args) { 
//         Scanner sc = new Scanner(System.in); 
//         String name = sc.nextLine(); 
//         System.out.println("Enter the number of subjects: "); 
//         int n = sc.nextInt(); 
//         int[] marks = new int[n]; 
 
//         for(int i = 0; i<n;i++) 
//         { 
//             marks[i]=sc.nextInt(); 
//         } 
 
//         Student student1 = new Student("Charlie Chaplin", new int[]{10,20,30,40,50}); 
//         Student student2 = new Student(); 
//         Student student3 = new Student(name,marks); 
 
//         System.out.println("Details of a Student instance initialized with constructor arguments: "); 
//         student1.display(); 
 
//         System.out.println("\nDetails of a Student instance initialized without constructor arguments: "); 
//         student2.display(); 
 
//         System.out.println("\nDetails of a Student instance initialized without constructor arguments: "); 
//         student3.display(); 
         
//     } 
// }


import java.util.*;

public class l4q1
{
    public static void main ( String[] args)
    {
        one: for(int i = 0; i< 2; i++)
        {
            System.out.print("Pass" + i + ": ");
        }
        for (int j= 0; j<100;j++)
        {
            if(j==10) break one;
            System.out.print(j+" ");
        }
    }
}