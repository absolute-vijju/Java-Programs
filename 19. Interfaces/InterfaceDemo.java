interface MyInter
{
	void connect();
	void disconnect();
}
class OracleDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Oracle database . . . ");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Oracle");
	}
}
class SybaseDB implements MyInter
{
	public void connect()
	{
		System.out.println("Connecting to Sybase database . . . ");
	}
	public void disconnect()
	{
		System.out.println("Disconnected from Sybase");
	}
}
class InterfaceDemo
{
	public static void main(String args[]) throws Exception
	{
		Class c=Class.forName(args[0]);
		MyInter mi=(MyInter)c.newInstance();
		mi.connect();
		mi.disconnect();
	}
}