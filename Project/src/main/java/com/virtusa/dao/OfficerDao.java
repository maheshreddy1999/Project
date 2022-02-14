package com.virtusa.dao;


	//import org.hibernate.Session;
	//import org.hibernate.SessionFactory;
	//import org.hibernate.Transaction;
	import com.virtusa.beans.*; 
	import com.virtusa.dao.OfficerMapper;
	//import org.hibernate.cfg.Configuration;		
		import java.util.List;
		import org.springframework.jdbc.core.JdbcTemplate;
		public class OfficerDao {
			  
			JdbcTemplate template;
			public void setTemplate(JdbcTemplate template){
				this.template=template;
			}
			public int insert(Officer off){
				String sql="insert into Officer(Off_id,CaseFile_No,CaseFile_Type,Case_Status,Case_Desc)values(?,?,?,?,?)";
				int ans=template.update(sql,off.getOff_id(),off.getCaseFile_No(),off.getCaseFile_Type(),off.getCase_Status(),off.getCase_Desc());
				return ans;
			}

			public int update(Officer off){
				String sql="update Officer set CaseFile_No=?, CaseFile_Type=? ,Case_Status=?, Case_Desc=? where Off_id=?";
				int ans=template.update(sql,off.getCaseFile_No(),off.getCaseFile_Type(),off.getCase_Status(),off.getCase_Desc(),off.getOff_id());
				return ans;
			}
			public int delete(int Off_id){
				String sql="delete from Officer where Off_id=?";
				return template.update(sql,Off_id);
			}
			public Officer getoffOff_id(int Off_id){
				String sql="select * from Officer where Off_id=?";
				Officer off=template.queryForObject(sql,new Object[]{Off_id},new OfficerMapper());
				
				return off;
			}
			
			public List<Officer> getOfficerDetails(){
				String sql="select * from Officer";
				List<Officer>offList=template.query(sql,new OfficerMapper());
				return offList;
			}
			
			
			
		}





