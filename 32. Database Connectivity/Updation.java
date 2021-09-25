import java.sql.*;
class Updation
{
	public static void main(String args[]) throws Exception
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","vijjuoracle");
		Statement stmt=con.createStatement();
		int norows=stmt.executeUpdate("update emptab set sal=20000 where eno>2");
		System.out.println("No. of Rows Updated: "+norows);
		System.out.println("Press a key to continue...");
		System.in.read();
		norows=stmt.executeUpdate("delete emptab where eno>4");
		System.out.println("No. of Rows Deleted: "+norows);
		con.close();
	}
}