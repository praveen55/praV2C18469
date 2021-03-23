import java.util.Iterator;
import java.util.Vector;

public class vector1 {
	public static void main(String[] args) {
		Vector<String> a= new Vector<String>();
		a.add("jaguar");
		a.add("Jackal");
		a.add("Blackpanther");
		a.add("Panda");
		a.add("Lynx");
		{
			System.out.println("Capacity before Adding Element : " +a.capacity());
			System.out.println("Size before Adding Element     : " +a.size());
		}

		a.addElement("Peacock");
		a.addElement("Ostrich");
		a.addElement("Penguin");
		a.addElement("Eagle");
		a.addElement("Parrot");
		{
			System.out.println("\nAnimals List " + " " + a );
			System.out.println("\nCapacity after Adding Element : " +a.capacity());
			System.out.println("Size after Adding Element     : " +a.size());
		}
		Iterator<String> itr = a.iterator();
		while(itr.hasNext())
		{
			System.out.println("ANIMAL List  : "+itr.next());
		}
		System.out.println("\nFirst Element in AnimalList : "+a.firstElement());
		System.out.println("Last Element in AnimalList  : "+a.lastElement());
		System.out.println(a.get(2));
		a.remove(8);
		a.insertElementAt("Sparrow", 8);
		System.out.println(a);
		Vector<String> b = new Vector<String>();
		b.add("SeaHorse");
		b.add("Whale");
		b.add("Sharks");
		b.add("Dolphin");
		b.add("Parrot");
		b.add("Octopus");
		b.removeElementAt(3);
		System.out.println(b);
		a.addAll(b);
		System.out.println("\nAdding List1 and List2 : " +a);
		if(b.isEmpty())
		{
			System.out.println("\nIt is a empty String");
		}else
		{
			System.out.println("\nIt is not a Empty String");
		}
		System.out.println("Contains or Not : "+a.contains("Parrot"));
	}
}

