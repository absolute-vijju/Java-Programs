import java.io.*;
class Sort
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("How many Elements? ");
		int n=Integer.parseInt(br.readLine());
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter Integer: ");
			arr[i]=Integer.parseInt(br.readLine());
		}
		int limit=n-1;
		boolean flag=false;
		int temp;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<limit-i;j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=true;
				}
			}
			if(flag==false)break;
			else flag=false;
		}
		System.out.println("The Sorted Array is: ");
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
	}
}