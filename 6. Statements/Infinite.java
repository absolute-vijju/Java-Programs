class Infinite
{
	public static void main(String args[])
	{
		int a=1;
		for(;;)
		{
			System.out.println(a);
			a++;
			if(a>10)
				break;
		}
	}
}