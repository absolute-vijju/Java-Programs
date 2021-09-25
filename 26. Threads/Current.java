class Current
{
	public static void main(String args[])
	{
		System.out.println("Let's Find Current Thread");
		Thread t=Thread.currentThread();
		System.out.println("Current Thread: "+t);
		System.out.println("It's Name: "+t.getName());
	}
}