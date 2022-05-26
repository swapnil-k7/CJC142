package UsingReturnType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	
	public List setdetails()
	{
		for(int i=1;i<=3;i++)
		{
		Employee e=new Employee();
		System.out.println("Enter Employee Id");
		e.setEmpid(sc.nextInt());
		System.out.println("Enter Employee Name");
		e.setEmpname(sc.next());
		System.out.println("Enter Employee Salary");
		e.setSalary(sc.nextDouble());
		System.out.println("Enter Employee Mobile NUmber");
		e.setMobno(sc.nextLong());
		l.add(e);
		
		
		
		}
		return l;
		
	}
	
	public static void main(String[] args) {
		
		Test t=new Test();
		List l=t.setdetails();
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Employee ee=(Employee) itr.next();
			System.out.println(ee.getEmpid());
			System.out.println(ee.getEmpname());
			System.out.println(ee.getSalary());
			System.out.println(ee.getMobno());
		}
		
		
	}

}
