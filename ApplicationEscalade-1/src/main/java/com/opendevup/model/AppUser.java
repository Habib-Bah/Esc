package com.opendevup.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Entity
@Table(name = "app_user", schema = "public")
public class AppUser {
	
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private Long userId;
		
		@Column(name = "user_name")
		@NotNull
		@Size(min=2, max=10) 
	    private String userName;
		
		@Column(name = "encryted_password")
		@NotNull
		@Size(max=255) 
	    private String encrytedPassword;
		
		@Column(name = "role")
		@NotNull
		private String role;
		
		@Column(name = "enabled")
		@NotNull
		private int enabled;
	 
	    public AppUser() {
	
	    	this.role = "ROLE_ADMIN";
	        this.enabled = 1;
	    }
	 
	    public AppUser(String userName, String encrytedPassword) {
	        
	        this.userName = userName;
	        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(); 
	        this.encrytedPassword = encoder.encode(encrytedPassword);
	        this.role = "ROLE_ADMIN";
	        this.enabled = 1;
	        
	    }
	 
	    public Long getUserId() {
	        return userId;
	    }
	 
	    public void setUserId(Long userId) {
	        this.userId = userId;
	    }
	 
	    public String getUserName() {
	        return userName;
	    }
	 
	    public void setUserName(String userName) {
	        this.userName = userName;
	    }
	 
	    public String getEncrytedPassword() {
	        return encrytedPassword;
	    }
	 
	    public void setEncrytedPassword(String encrytedPassword) {
	        this.encrytedPassword = encrytedPassword;
	    }
	    
	    
	 
	    public String getRole() {
			return role;
		}

		public void setRole(String role) {
			this.role = role;
		}

		public int getEnabled() {
			return enabled;
		}

		public void setEnabled(int enabled) {
			this.enabled = enabled;
		}

		@Override
	    public String toString() {
	        return this.userName + "/" + this.encrytedPassword;
	    }
	   
}
