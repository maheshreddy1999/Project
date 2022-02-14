package com.virtusa.dao;


	import java.sql.ResultSet; 
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

	import com.virtusa.beans.*;

	public class GuestMapper implements RowMapper<Guest>{

		@Override
		public Guest mapRow(ResultSet rs, int rowNum)throws SQLException{
	    Guest gus =new Guest();
	    gus.setGid(rs.getInt(1));
	    gus.setDeptName(rs.getString(2));
	    gus.setCaseFile_No(rs.getInt(3));
	    gus.setCaseFile_Type(rs.getString(4));
	    gus.setCase_Status(rs.getString(5));
	    gus.setCase_Desc(rs.getString(6));
			return gus;
		}
}
