package exTwitter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;


public class DBManager {
	private Connection con;
	private Statement smt;
	private ResultSet rs;

	public void getConnection(){
		String url      = "jdbc:mysql://localhost/excite";
		String user     = "root";
		String password = "excite";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url,user, password);
		}catch(Exception e){
			throw new IllegalStateException(e);
		}
	}
	
	public ResultSet getResultSet(String qry){
		try {
		smt  = con.createStatement();
		rs = smt.executeQuery(qry);
		
		}catch (Exception e){
			System.err.println("Select_Error");
		}
		return rs;
	}
	
	public int exeUpdate(String qry){
		int update_count = 0;
		try {
			smt = con.createStatement();
			update_count = smt.executeUpdate(qry);
		}catch (Exception e){
			System.err.println("Update_Error");
		}
		return update_count;
		
	}
	

	
	public void closeConnection(){
		try {
			rs.close();
			smt.close();
			con.close();
		}catch (Exception e){
			System.err.println("Close_Error");
		}
	}
	
	
	
	
	
	public static void main(String[] args){
		try {
			DBManager DBM = new DBManager();
			DBM.getConnection();
			
			Date date = new Date();
			java.sql.Date now = new java.sql.Date(date.getTime());
			System.out.println(now);
			ResultSet rs = DBM.getResultSet("select * from once");
			while(rs.next()){
				System.out.println("once_id\t"+rs.getInt("once_id"));
				System.out.println("text\t"+rs.getString("text"));
				System.out.print("reserve_time\t"+rs.getDate("reserve_time"));
				System.out.println(" "+rs.getTime("reserve_time"));
				System.out.println("posted\t"+rs.getInt("posted"));
				System.out.println();
			}
			DBM.closeConnection();	
		}catch(Exception e){
			System.err.println("失敗しました");
		}
		
	}

}
