package HomeogeneousandHetrogeneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List l=new ArrayList();
		Scanner sc=new Scanner(System.in);
		for(int i=1;i<=3;i++)
		{
			Student s=new Student();
			
			
			System.out.println("Enter rollno");
			s.setRollno(sc.nextInt());
			System.out.println("Enter name");
			s.setName(sc.next());
			
			Address a=new Address();
			System.out.println("Enter city name");
			a.setCityname(sc.next());
			System.out.println("Enter city Pincode");
			a.setPincode(sc.nextInt());
			
			s.setAdr(a);
			l.add(s);
		}
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Student ss=(Student) itr.next();
			System.out.println(ss.getRollno());
			System.out.println(ss.getName());
			System.out.println(ss.getAdr().getCityname());
			System.out.println(ss.getAdr().getPincode());
		}
		

	}

}
