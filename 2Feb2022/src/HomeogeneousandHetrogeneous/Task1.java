package HomeogeneousandHetrogeneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter data here");
		List l=new ArrayList();
		l.add(sc.next());
		l.add(sc.nextInt());
		l.add(sc.next());
		l.add(sc.next().charAt(0));
		l.add(sc.nextInt());
		l.add(sc.next().charAt(0));
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object x=itr.next();
			if(x instanceof Integer)
			{
				int i=(int) x;
				System.out.println(i);
			}
			else if(x instanceof String)
			{
				String s=(String) x;
				System.out.println(s);
			}
			else if(x instanceof Character)
			{
				char c=(char) x;
				System.out.println(c);
			}
		}
		System.out.println(l);

	}

}
