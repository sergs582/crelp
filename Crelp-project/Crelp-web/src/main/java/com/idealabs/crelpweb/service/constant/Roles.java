package com.idealabs.crelpweb.service.constant;

public enum Roles {
	
	user(1),
	
	investor(2);
	
	
	private Integer roleId;
	
	private Roles(Integer roleId) {
		this.roleId = roleId;
	}

	public Integer getRoleId() {
		return roleId;
	}

public static Roles getRoleById(Integer id) {
	for(Roles role: values()) {
		if(role.getRoleId().equals(id)) {
			return role;
		}
	}
	
	
	return null;
	
}

	

}
