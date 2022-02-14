package com.virtusa.dao;


	//import org.hibernate.Session;
	//import org.hibernate.SessionFactory;
	//import org.hibernate.Transaction;
	import com.virtusa.beans.*;   
	import com.virtusa.dao.GuestMapper;
	//import org.hibernate.cfg.Configuration;		
		import java.util.List;
		import org.springframework.jdbc.core.JdbcTemplate;
		public class GuestDao {
			  
			JdbcTemplate template;
			public void setTemplate(JdbcTemplate template){
				this.template=template;
			}
			public int insert(Guest gus){
				String sql="insert into Guest(Gid,DeptName,CaseFile_No,CaseFile_Type,Case_Status,Case_Desc)values(?,?,?,?,?,?)";
				int ans=template.update(sql,gus.getGid(),gus.getDeptName(),gus.getCaseFile_No(),gus.getCaseFile_Type(),gus.getCase_Status(),gus.getCase_Desc());
				return ans;
			}

			public int update(Guest gus){
				String sql="update Guest set DeptName=?, CaseFile_No=?, CaseFile_Type=?, Case_Status=?,Case_Desc=? where Gid=?";
				int ans=template.update(sql,gus.getDeptName(),gus.getCaseFile_No(),gus.getCaseFile_Type(),gus.getCase_Status(),gus.getCase_Desc(),gus.getGid());
				return ans;
			}
			public int delete(int Gid){
				String sql="delete from Guest where Gid=?";
				return template.update(sql,Gid);
			}
			public Guest getgusGid(int Gid){
				String sql="select * from Guest where Gid=?";
				Guest gus=template.queryForObject(sql,new Object[]{Gid},new GuestMapper());
				
				return gus;
			}
			
			public List<Guest> getGuestDetails(){
				String sql="select * from Guest";
				List<Guest>gusList=template.query(sql,new GuestMapper());
				return gusList;
			}
			
			
			
		}





