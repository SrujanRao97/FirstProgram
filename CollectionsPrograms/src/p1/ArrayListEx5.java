package p1;
import java.util.*;

public class ArrayListEx5
{
	public static void showList()
	{
		List<String>list=new ArrayList<>();
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("12334");
		System.out.println("In Forward Direction");
		ListIterator<String>it=list.listIterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("In Backword Direction");
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
	}
	
	public static void main(String[] args) 
	{
		showList();

	}

}
