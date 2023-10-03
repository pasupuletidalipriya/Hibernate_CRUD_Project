package anudip.com;

//importing required packages
import java.util.List;

public class Main 
{
   public static void main(String args[])
   {
	   StudentRepo student=new StudentRepoImpl();
	   
	   //creating objects and assigning values
	   
	   Student s1=new Student();
	   s1.setSid(101);
	   s1.setSname("Priya");
	   s1.setAge(21);
	   s1.setCourse("Bsc");
	   student.insertStudent(s1);
	   
	   Student s2=new Student();
	   s2.setSid(102);
	   s2.setSname("Vijji");
	   s2.setAge(23);
	   s2.setCourse("BCom");
	   student.insertStudent(s2);
	   
	   Student s3=new Student();
	   s3.setSid(103);
	   s3.setSname("Vijaya");
	   s3.setAge(23);
	   s3.setCourse("BZC");
	   student.insertStudent(s3);
	   
	   student.updateStudent(s1);
	   
	   student.selectStudent();
   }
}
