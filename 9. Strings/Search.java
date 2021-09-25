import java.io.*;
class Search
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many Strings? ");
		int n=Integer.parseInt(br.readLine());
		String str[]=new String[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter String: ");
			str[i]=br.readLine();
		}
		System.out.print("Enter String to Search: ");
		String search=br.readLine();
		boolean found=false;
		if(int i=0;i<n;i++)
		{
			if(search.equalsIgnoreCase(str[i]))
			{
				System.out.println("Found at position: " + (i+1));
				found=true;
			}
		}
		if(!found)
			System.out.println("Not found in group.");
	}
}