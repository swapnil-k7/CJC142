package LastTask;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Collage {
	
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	public List setdata()
	{
		Course c=new Course();
		System.out.println("Enter Course Id");
		c.setCourseid(sc.nextInt());
		System.out.println("Enter Course Name");
		c.setCoursename(sc.next());
		
		Faculty f=new Faculty();
		System.out.println("Enter Faculty id");
		f.setFid(sc.nextInt());
		System.out.println("Enter Faculty name");
		f.setFname(sc.next());
		f.setCourse(c);
		
		Batch b=new Batch();
		System.out.println("Enter Batch Id");
		b.setBid(sc.nextInt());
		System.out.println("Enter Batch Name");
		b.setBname(sc.next());
		b.setF(f);
		
		Student s=new Student();
		System.out.println("Enter Student rollno");
		s.setRollno(sc.nextInt());
		System.out.println("Enter Student name");
		s.setName(sc.next());
		System.out.println("Enter Student Address");
		s.setAddress(sc.next());
		s.setB(b);
		
		l.add(s);
		
		
		return l;
		
	}
	public static void main(String[] args) {
		
		Collage c1=new Collage();
		List l=c1.setdata();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student stu=(Student) itr.next();
			System.out.println(stu.getRollno());
			System.out.println(stu.getName());
			System.out.println(stu.getAddress());
			System.out.println(stu.getB().getBid());
			System.out.println(stu.getB().getBname());
			System.out.println(stu.getB().getF().getFid());
			System.out.println(stu.getB().getF().getFname());
			System.out.println(stu.getB().getF().getCourse().getCourseid());
			System.out.println(stu.getB().getF().getCourse().getCoursename());
			
			
		}
	}

}
