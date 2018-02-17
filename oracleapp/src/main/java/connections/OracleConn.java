package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConn {
	public Connection getConn()
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("OracleDriver not found");
			e.printStackTrace();
			return null;
		}
		Connection connection=null;
		try {
			connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","HR","1234");
		}
		catch(SQLException e)
		{
			System.out.println("Connection failed check output console");
			e.printStackTrace();
			return null;
		}
		if(connection!=null)
		{
			System.out.println("connection success");
			return connection;
		}
		else
		{
			System.out.println("Connection failed");
			return null;
		}
		
	}

}
