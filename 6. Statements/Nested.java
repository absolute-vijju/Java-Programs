class Nested
{
	public static void main(String args[])
	{
		int i,j;
		i=1;
		lp1:while(i<=3)
		{
			System.out.print(i);
			lp2:for(j=1;j<=5;j++)
			{
				System.out.println("\t" + j);
				if(j==3)
				{
					i++;
					continue lp1;
				}
			}
			i++;
			System.out.println("----------");
		}
	}
}