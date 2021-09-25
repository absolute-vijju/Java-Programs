import java.io.*;
import java.util.*;
class StackDemo
{
	public static void main(String args[]) throws IOException
	{
		Stack<Integer> st=new Stack<Integer>();
		int choice=0;
		int position,element;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		while(choice<4)
		{
			System.out.println("- - - - - STACK OPERATION - - - - -");
			System.out.println("\t1 for Push an element");
			System.out.println("\t2 for Pop an element");
			System.out.println("\t3 for Search an element");
			System.out.println("\t4 for Exit");
			System.out.print("\tYour Choice: ");
			choice=Integer.parseInt(br.readLine());
			switch(choice)
			{
				case 1:
				System.out.print("Enter Element: ");
				element=Integer.parseInt(br.readLine());
				st.push(element);
				break;
				case 2:
				Integer obj=st.pop();
				System.out.println("Popped: "+obj);
				break;
				case 3:
				System.out.print("Which Element? ");
				element=Integer.parseInt(br.readLine());
				position=st.search(element);
				if(position==-1)
					System.out.println("Element not found");
				else
					System.out.println("Position: "+position);
				break;
				default:
				return;
			}
			System.out.println("Stack Contents: "+st);
		}
	}
}