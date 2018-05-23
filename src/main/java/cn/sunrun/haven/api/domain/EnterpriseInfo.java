package cn.sunrun.haven.api.domain;

import java.io.Serializable;
import java.util.List;

public class EnterpriseInfo implements Serializable {
	private static final long serialVersionUID = 9006763446277993405L;

	private String id;
	private String username;
	private String password;
	private String description;
	private List<Role> roleList;
	
	public EnterpriseInfo() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public String toString() {
		return "EnterpriseInfo [id=" + id + ", username=" + username + ", password=" + password + ", description="
				+ description + "]";
	}
	
}
