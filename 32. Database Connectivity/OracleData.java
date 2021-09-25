import java.sql.*;
class OracleData
{
	public static void main(String args[]) throws Exception
	{
		DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","System","vijjuoracle");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("Select * from emptab");
		while(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getFloat(3));
			System.out.println("====================");
		}
		con.close();
	}
}