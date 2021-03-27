package com.laptrinhjavaweb.model;

public class userModel extends abstractModel<userModel> {
	private String userName;
	private String fullName;
	private String password;
	private int status;
	private Long roleId;
	private Long[] Ids;
	private roleModel role;
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public Long[] getIds() {
		return Ids;
	}

	public void setIds(Long[] ids) {
		Ids = ids;
	}

	public roleModel getRole() {
		return role;
	}

	public void setRole(roleModel role) {
		this.role = role;
	}

}
