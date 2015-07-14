package exTwitter;

import java.sql.ResultSet;

public class User {
	public Boolean checkUser(String user_name,String password){
		Boolean bool = Boolean.FALSE;
		String qry = "SELECT * from user where " +
				"(user_name = '"+ user_name +"' " +
						"&& password = '"+password+"')";
		try{
			DBManager DBM = new DBManager();
			DBM.getConnection();
			ResultSet rs = DBM.getResultSet(qry);
			if (rs.next()){
				System.err.println(rs.getInt("user_id"));
				bool= Boolean.TRUE;
			}
		}catch (Exception e){
			System.err.println("User Check Error");
		}
		return bool;
	}
	
	
	//以下サンプル
	public static void main(String[] args){
		User us = new User();
		if (us.checkUser("ゴミ", "pass1230")){
			System.out.println("いたぞ！やつだ！！");
		}else{
			System.err.println("...なかにだれもいませんよ");
		}
		
		
	}

}
