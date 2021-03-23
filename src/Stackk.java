import java.util.Iterator;
import java.util.Stack;

public class Stackk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> s = new Stack <String>();
		s.push("Max");
		s.push("Sam");
		s.push("Tom");
		s.push("John");
		s.push("Jack");
		System.out.println("size of List1 "+s.capacity());
		System.out.println("size of List1 "+s.size());
		System.out.println(s);
		s.pop();
		System.out.println(s);
		Iterator<String> itr = s.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		{
		System.out.println("Contains or Not : "+s.contains("Max"));
		}
		{
		{
		System.out.println("Contains or Not : "+s.contains("Daniel"));
		}
		}
		if(s.isEmpty())
		{
			System.out.println("\nIt is a empty String");
		}else
		{
			System.out.println("It is not a Empty String");
		}
		for(String str : s)
		{
			System.out.println("List1 : "+s);
		}
	}
}
