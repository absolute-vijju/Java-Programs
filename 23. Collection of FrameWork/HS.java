import java.util.*;
class HS
{
	public static void main(String args[])
	{
		HashSet<String> hs=new HashSet<String>();
		hs.add("India");
		hs.add("America");
		hs.add("Japan");
		hs.add("China");
		hs.add("America");
		System.out.println("Hash Set= "+hs);
		Iterator it=hs.iterator();
		System.out.println("Elements Using Iterator: ");
		while(it.hasNext())
		{
			String s=(String)it.next();
			System.out.println(s);
		}
	}
}