package com.virtusa.dao;



	import java.sql.ResultSet;  
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

	import com.virtusa.beans.*;

	public class AdminMapper implements RowMapper<Admin>{

		@Override
		public Admin mapRow(ResultSet rs, int rowNum)throws SQLException{
	    Admin adm =new Admin();
	    adm.setUserId(rs.getInt(1));
	    adm.setUserType(rs.getString(2));
	    adm.setUserName(rs.getString(3));
	    adm.setPassword(rs.getString(4));
			return adm;
		}
}
