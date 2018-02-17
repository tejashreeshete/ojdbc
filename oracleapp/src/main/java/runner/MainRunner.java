package runner;

import java.sql.Connection;
import java.sql.SQLException;

import connections.OracleConn;

public class MainRunner {
	public static void main()
	{
		OracleConn oracleConn=new OracleConn();
		Connection conn=oracleConn.getConn();
		if(conn!=null)
		{
			try {
				conn.close();
				System.out.println("connection closed");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace(System.err);
			}
		}
	}

}
