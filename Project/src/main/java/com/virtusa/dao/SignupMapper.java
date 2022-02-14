package com.virtusa.dao;


	import java.sql.ResultSet;  
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

	import com.virtusa.beans.*;

	public class SignupMapper implements RowMapper<Signup>{

		@Override
		public Signup mapRow(ResultSet rs, int rowNum)throws SQLException{
	    Signup sin =new Signup();
	    sin.setFullName(rs.getString(1));
	    sin.setEmail(rs.getString(2));
	    sin.setUserName(rs.getString(3));
	    sin.setPassword(rs.getString(4));
	    sin.setConfirm_Password(rs.getString(5));
			return sin;
		}
}
