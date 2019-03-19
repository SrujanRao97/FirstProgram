package p1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListEx3 
{

	public static void main(String[] args)
	{
		List<Integer> l1=new ArrayList<>();
		l1.add(50);
		l1.add(30);
		l1.add(10);
		System.out.println(l1);
		for(Object ob:l1)
			System.out.println(ob);
		ListIterator<Integer>l2=l1.listIterator();
		while(l2.hasNext())
			System.out.println(l2.next());

	}

}
