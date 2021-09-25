class MyClass extends Thread
{
	int count=0;
	public void run()
	{
		for(int i=1;i<=10000;i++)
			count++;
		System.out.println("Completed Thread: "+Thread.currentThread().getName());
		System.out.println("It's Priority: "+Thread.currentThread().getPriority());
	}
}
class Prior
{
	public static void main(String args[])
	{
		MyClass obj=new MyClass();
		Thread t1=new Thread(obj,"One");
		Thread t2=new Thread(obj,"Two");
		t1.setPriority(2);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.start();
		t2.start();
	}
}