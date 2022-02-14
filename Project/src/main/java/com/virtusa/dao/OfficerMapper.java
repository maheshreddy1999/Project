package com.virtusa.dao;


	import java.sql.ResultSet;
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

	import com.virtusa.beans.*;

	public class OfficerMapper implements RowMapper<Officer>{

		@Override
		public Officer mapRow(ResultSet rs, int rowNum)throws SQLException{
	  Officer off =new Officer();
	    off.setOff_id(rs.getInt(1));
	    off.setCaseFile_No(rs.getInt(2));
	    off.setCaseFile_Type(rs.getString(3));
	    off.setCase_Status(rs.getString(4));
	    off.setCase_Desc(rs.getString(5));
	    
	    
			return off;
		}
}
