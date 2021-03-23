import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

enum days {
			Sunday , Monday , Tuesday , Wednesday , Thursday , Friday , saturday
		}
public class Enumm {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnumMap<days, String> map = new EnumMap<days, String>(days.class); 
		Set<days> set1 = EnumSet.allOf(days.class);
		System.out.println("'Days in a Week'");
		

		Set<days> set2 = EnumSet.of(days.Monday);
		Set<days> set3 = EnumSet.of(days.Tuesday);
		Set<days> set4 = EnumSet.of(days.Wednesday);
		Set<days> set9 = EnumSet.of(days.Thursday);
		Set<days> set6 = EnumSet.of(days.Friday);
		Set<days> set7 = EnumSet.of(days.Sunday);
		Set<days> set8 = EnumSet.of(days.saturday);
		Set<days> set = EnumSet.allOf(days.class);
		Iterator<days> itr = set.iterator();
		while(itr.hasNext())
		{
			System.out.println("Day : " +itr.next());
		}
		{
			System.out.println( "Weekends : " +set7 + set8);
			System.out.println( "Week Days : " + set2 + set3 + set4 + set9 +set6 );
		}
	}
}



