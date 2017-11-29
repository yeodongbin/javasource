//1.JDBC 드라이버 로딩(Class.forName() 클래스)
//2.Connection 클래스
//3.SQL 실행(Statement 클래스)(select * from emp)
//4.ResultSet 클래스
//5.Close()

package jdbc;

import java.sql.*;

public class FirstExample {
	
	static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//MySQL : com.mysql.jdbc.Driver
	static final String DB_URL = "jdbc:oracle:thin:"
							   + "@127.0.0.1:1521:orcl";
	//jdbc:oracle:thin:@[ip]:[port]:[SID]
	static final String DB_USER = "ora_user";
	static final String DB_PW = "yeo";
	

	public static void main(String[] args) {
		Connection conn =null; //연결
		Statement stmt =null;  //SQL
		
		try {
		//1.JDBC 드라이버 로딩(Class.forName() 클래스)
		Class.forName(JDBC_DRIVER);
		
		//2.Connection 클래스
		conn = DriverManager.getConnection(DB_URL, DB_USER,DB_PW);
		
		//3.SQL 실행(Statement 클래스)(select * from emp)
		String sql = "SELECT empno FROM EMP";
		stmt = conn.createStatement(); //statement
		ResultSet rs = stmt.executeQuery(sql); 
		
		//4.ResultSet 클래스
		while (rs.next()) {
			int empno = rs.getInt("empno");
			
			System.out.println("empno = " + empno);
		}
		
		//5.Close()
		rs.close();
		stmt.close();
		conn.close();
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(stmt !=null) {
					stmt.close();
				}
			} catch (SQLException se) {}
			
			try {
				if(conn !=null) {
					conn.close();
				}
			} catch (SQLException se) {}
		}
	}// main-end
}
