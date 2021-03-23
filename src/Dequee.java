import java.util.ArrayDeque;
import java.util.Iterator;

public class Dequee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque<String> p = new ArrayDeque<String>();
		p.add("sam");
		p.add("tom");
		p.add("john");
		p.add("max");
		p.add("jack");
		System.out.println(p);
		p.pollFirst();
		System.out.println("First Element Removed : "+p);
		p.pollLast();
		System.out.println("Last Element Removed : "+p);
		p.addFirst("Ram");
		System.out.println("Adding FirstElement : "+p);
		p.addLast("Lee");
		System.out.println("Adding LastElement : "+p);
		Iterator<String> itr = p.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}

