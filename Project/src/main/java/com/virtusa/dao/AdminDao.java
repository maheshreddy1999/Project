package com.virtusa.dao;



	//import org.hibernate.Session;
	//import org.hibernate.SessionFactory;
	//import org.hibernate.Transaction;
	import com.virtusa.beans.*;    
	import com.virtusa.dao.AdminMapper;
	//import org.hibernate.cfg.Configuration;		
		import java.util.List;
		import org.springframework.jdbc.core.JdbcTemplate;
		public class AdminDao {
			  
			JdbcTemplate template;
			public void setTemplate(JdbcTemplate template){
				this.template=template;
			}
			public int insert(Admin adm){
				String sql="insert into Admin(UserId,UserType,UserName,Password)values(?,?,?,?)";
				int ans=template.update(sql,adm.getUserId(),adm.getUserType(),adm.getUserName(),adm.getPassword());
				return ans;
			}

			public int update(Admin adm){
				String sql="update Admin set UserType=?, UserName=?, Password=? where UserId=?" ;
				int ans=template.update(sql,adm.getUserType(),adm.getUserName(),adm.getPassword(),adm.getUserId());
				return ans;
			}
			public int delete(int UserId){
				String sql="delete from Admin where UserId=?";
				return template.update(sql,UserId);
			}
			public Admin getadmUserId(int UserId){
				String sql="select * from Admin where UserId=?";
				Admin adm=template.queryForObject(sql,new Object[]{UserId},new AdminMapper());
				
				return adm;
			}
			
			public List<Admin> getAdminDetails(){
				String sql="select * from Admin";
				List<Admin>admList=template.query(sql,new AdminMapper());
				return admList;
			}
			
			
			
		}





