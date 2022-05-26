package UsingReturnType;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Bollywood {
	
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	
	public List setdata()
	{
		for(int i=1;i<=2;i++)
		{
			Address adr=new Address();
			System.out.println("Enter City Name");
			adr.setCityname(sc.next());
			System.out.println("Enter city pincode");
			adr.setCitypincode(sc.nextInt());
			
			Actor a=new Actor();
			System.out.println("Enter Actor age");
			a.setAge(sc.nextInt());
			System.out.println("Enter Actor name");
			a.setName(sc.next());
			System.out.println("Enter Actor mobno");
			a.setMobno(sc.nextLong());
			System.out.println("Enter Actor Moviename");
			a.setMoviename(sc.next());
			a.setAdr(adr);
			l.add(a);
	    }
		return l;
}
	public void getdata(List l)
	{
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Actor aa=(Actor) itr.next();
			System.out.println(aa.getAge());
			System.out.println(aa.getName());
			System.out.println(aa.getMobno());
			System.out.println(aa.getMoviename());
			System.out.println(aa.getAdr().getCityname());
			System.out.println(aa.getAdr().getCitypincode());
			
		}
	}
}
