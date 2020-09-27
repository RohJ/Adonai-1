package com.adonai.dbupdate.entity;

public class RoleWrapper {

	public long id;
	public String roleName;
	public boolean selected;
	
	public RoleWrapper(long id, String roleName, boolean selected) {
		this.id = id; this.roleName = roleName; this.selected = selected;
	}
	
	public long getId() {
		return id;
	}
	
	public String getRoleName() {
		return roleName;
	}
	
	public boolean getSelected() {
		return selected;
	}
}
