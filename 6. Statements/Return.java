class Return
{
	static int myMethod(int num)
	{
		return num*num;
	}
	public static void main(String args[])
	{
		int result;
		result=Return.myMethod(10);
		System.out.println("Result :" + result);
	}
}