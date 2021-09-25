class MyException extends Exception{
	private static int accno[]= {1001,1002,1003,1004,1005};
	private static String name[]= {"Raja Rao","Rama Rao","Subbha Rao","Appa Rao","Laxmi Devi"};
	private static double balance[]= {10000,12000,5400,999,1100};
	MyException() {
	}
	MyException(String str){
		super(str);
	}
	public static void main(String args[]) {
		try {
			System.out.println("A/C No.\t" + "Name\t" + "Balance");
			for (int i = 0; i < 5; i++) {
				System.out.println(accno[i] +"\t" + name[i] + "\t" + balance[i]);
				if(balance[i]<1000) {
					MyException me=new MyException("Balance is less");
					throw me;
				}
			}
		} catch (MyException me) {
			me.printStackTrace();
		}
//		finally {
//			System.out.println("Thank You");
//		}
	}
}
