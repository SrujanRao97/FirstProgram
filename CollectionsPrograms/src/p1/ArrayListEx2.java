package p1;
//import java.awt.List;
import java.util.*;

public class ArrayListEx2
{

	public static void main(String[] args) 
	{
		List<Integer>l1=new ArrayList<>();
		l1.add(20);
		l1.add(30);
		l1.add(45);
		l1.add(105);
		System.out.println(l1);
		System.out.println("The Size of List is : "+l1.size());
		//remove() is used to delete the index contained data
		System.out.println(l1.remove(3));
		System.out.println(l1);
		//clear() is used to clear entire list
		l1.clear();
		System.out.println(l1);
		
		

	}

}
