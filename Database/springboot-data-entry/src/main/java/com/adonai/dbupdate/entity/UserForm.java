package com.adonai.dbupdate.entity;

public class UserForm {
	
	private String username;

    private String password;
    
    private String passwordConfirm;
    
    private String[] roles;
    
	/*
	 * private List<RoleWrapper> roles = new ArrayList<>();
	 * 
	 * public UserForm(List<RoleWrapper> roles) { this.roles = roles; }
	 * 
	 * public List<RoleWrapper> getRoles() { return roles; }
	 * 
	 * public void setRoles(List<RoleWrapper> roles) { this.roles = roles; }
	 */
    
    public UserForm() {
    	
    }
    
    public UserForm(String[] roleList) {
    	this.roles = roleList;
    }

	public String[] getRoles() {
    	return this.roles;
    }
    
    public void setRoles(String[] roles) {
    	this.roles = roles;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }
	
}
