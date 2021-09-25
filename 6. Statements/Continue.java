class Continue
{
	public static void main(String args[])
	{
		for(int a=10;a>=1;a--)
		{
			if(a>5)
				continue;
			System.out.print(a+"\t");
		}
	}
}