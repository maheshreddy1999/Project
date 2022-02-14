package com.virtusa.dao;


	//import org.hibernate.Session;
	//import org.hibernate.SessionFactory;
	//import org.hibernate.Transaction;
	import com.virtusa.beans.*;    
	import com.virtusa.dao.SignupMapper;
	//import org.hibernate.cfg.Configuration;		
		import java.util.List;
		import org.springframework.jdbc.core.JdbcTemplate;
		public class SignupDao {
			  
			JdbcTemplate template;
			public void setTemplate(JdbcTemplate template){
				this.template=template;
			}
			public int insert(Signup sin){
				String sql="insert into Signup(FullName,Email,UserName,Password,Confirm_Password)values(?,?,?,?,?)";
				int ans=template.update(sql,sin.getFullName(),sin.getEmail(),sin.getUserName(),sin.getPassword(),sin.getConfirm_Password());
				return ans;
			}

			/*public int update(Signup sin){
				String sql="update Signup set FullName=?, Email=?, UserName=?, where Password=?";
				int ans=template.update(sql,sin.getFullName(),sin.getEmail(),sin.getUserName(),sin.getPasword());
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
			
			public List<Signup> getSignupDetails(){
				String sql="select * from Sinup";
				List<Signup>sinList=template.query(sql,new SignupMapper());
				return sinList;
			}*/
			
			
			
		}





