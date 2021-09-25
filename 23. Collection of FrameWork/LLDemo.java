import java.io.*;
import java.util.*;
class LLDemo
{
	public static void main(String args[]) throws IOException
	{
		LinkedList<String> ll=new LinkedList<String>();
		ll.add("America");
		ll.add("India");
		ll.add("Japan");
		System.out.println("List: "+ll);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String element;
		int position,choice=0;
		while(choice<4)
		{
			System.out.println("\nLINKLIST OPERATION");
			System.out.println("1 for Add an element");
			System.out.println("2 for Remove an element");
			System.out.println("3 for Change an	element");
			System.out.println("4 for Exit");
			System.out.print("Your Choice: ");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
				System.out.print("Enter an element: ");
				element=br.readLine();
				System.out.print("At which position? ");
				position=Integer.parseInt(br.readLine());
				ll.add(position-1,element);
				break;
				case 2:
				System.out.print("Enter position: ");
				position=Integer.parseInt(br.readLine());
				ll.remove(position-1);
				break;
				case 3:
				System.out.print("Enter position: ");
				position=Integer.parseInt(br.readLine());
				System.out.print("Enter new element: ");
				element=br.readLine();
				ll.set(position-1,element);
				break;
				default:
				return;
			}
			System.out.print("List: ");
			Iterator it=ll.iterator();
			while(it.hasNext())
				System.out.print("["+it.next()+"]");
		}
	}
}