package HomeogeneousandHetrogeneous;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		List l=new ArrayList();
		System.out.println("Enter Float value here");
		l.add(sc.nextFloat());
		System.out.println("Enter Double value here");
		l.add(sc.nextDouble());
		System.out.println("Enter Integer Value here");
		l.add(sc.nextInt());
		System.out.println("Enter Double value here");
		l.add(sc.nextDouble());
		System.out.println("Enter Float value here");
		l.add(sc.nextFloat());
		System.out.println("Enter Double value here");
		l.add(sc.nextDouble());
		
		Iterator itr=l.iterator();
		while(itr.hasNext())
		{
			Object x=itr.next();
			if(x instanceof Double)
			{
				double d=(double) x;
				System.out.println(d);
			}
			else if(x instanceof Float)
			{
				float f=(float) x;
				System.out.println(f);
			}
			else if(x instanceof Integer)
			{
				int i=(int)x;
				System.out.println(i);
			}
		}
		
	}

}
