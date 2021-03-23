import java.util.Map.Entry;
import java.util.TreeMap;

public class Treemapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer , String > set = new TreeMap<Integer, String>();
		set.put(5,"John");
		set.put(2,"Tom");
		set.put(1,"Lee");
		set.put(4,"jhonson");
		for(Entry<Integer, String> p : set.entrySet())
		{
			System.out.println(p.getKey()+" " +p.getValue());		
		}
		System.out.println("Decending Order " +set.descendingMap());
		set.remove(2);
		System.out.println("After removed "+set);
		
		
	}

}
