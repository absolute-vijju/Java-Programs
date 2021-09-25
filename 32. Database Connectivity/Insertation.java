import java.sql.*;
class Insertation
{
	public static void main(String args[]) throws Exception
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","vijjuoracle");
		Statement stmt=con.createStatement();
		int norows=stmt.executeUpdate("insert into emptab(eno) values(5)");
		System.out.println("No. of Rows Affected: "+norows);
		norows=stmt.executeUpdate("insert into emptab values(5,'Karan',5000.00)");
		System.out.println("No. of Rows Affected: "+norows);
		con.close();
	}
}