package Package1;

public class Student 
{
	int age;
	int rollno;

   public void display1()
   {
	   System.out.println("Welcome to all of you");
}	
	
   public void display2()
   {
	   System.out.println("Automation is very easy");   
	}
   public static void main(String[] args) {
	
	   Student ob=new Student();
	   ob.age = 155;
	   ob.rollno = 35;
	   ob.display1();
	   ob.display2();
	   
	   System.out.println("age is " + ob.age);
	   System.out.println("rollno is " + ob.rollno);
			   
}
	}	
