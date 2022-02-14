package com.virtusa.dao;


	//import org.hibernate.Session; 
	//import org.hibernate.SessionFactory;
	//import org.hibernate.Transaction;
	import com.virtusa.beans.*;     
	import com.virtusa.dao.FacilitiesMapper;
	//import org.hibernate.cfg.Configuration;		
		import java.util.List;
		import org.springframework.jdbc.core.JdbcTemplate;
		public class FacilitiesDao {
			  
			JdbcTemplate template;
			public void setTemplate(JdbcTemplate template){
				this.template=template;
			}
			public int insert(Facilities fac){
				String sql="insert into Facilities(CaseFile_No,CaseFile_Type,Evidence,Case_Report)values(?,?,?,?)";
				int ans=template.update(sql,fac.getCaseFile_No(),fac.getCaseFile_Type(),fac.getEvidence(),fac.getCase_Report());
				return ans;
			}

			public int update(Facilities fac){
				String sql="update Facilities set CaseFile_Type=?, Evidence=?, Case_Report=? where CaseFile_No=?";
				int ans=template.update(sql,fac.getCaseFile_Type(),fac.getEvidence(),fac.getCase_Report(),fac.getCaseFile_No());
				return ans;
			}
			public int delete(int CaseFile_No){
				String sql="delete from Facilities where CaseFile_No=?";
				return template.update(sql,CaseFile_No);
			}
			public Facilities getfacCaseFile_No(int CaseFile_No){
				String sql="select * from Facilities where CaseFile_No=?";
				Facilities fac=template.queryForObject(sql,new Object[]{CaseFile_No},new FacilitiesMapper());
				
				return fac;
			}
			
			public List<Facilities> getFacilitiesDetails(){
				String sql="select * from Facilities";
				List<Facilities>facList=template.query(sql,new FacilitiesMapper());
				return facList;
			}
			
			
			
		}





