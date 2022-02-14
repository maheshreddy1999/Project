package com.virtusa.dao;


	import java.sql.ResultSet;  
	import java.sql.SQLException;

	import org.springframework.jdbc.core.RowMapper;

	import com.virtusa.beans.*;

	public class FacilitiesMapper implements RowMapper<Facilities>{

		@Override
		public Facilities mapRow(ResultSet rs, int rowNum)throws SQLException{
	    Facilities fac =new Facilities();
	    fac.setCaseFile_No(rs.getInt(1));
	    fac.setCaseFile_Type(rs.getString(2));
	    fac.setEvidence(rs.getString(3));
	    fac.setCase_Report(rs.getString(4));
			return fac;
		}
}
