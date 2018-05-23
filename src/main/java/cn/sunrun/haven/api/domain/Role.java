package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class Role implements Serializable {
	private static final long serialVersionUID = 785090675969830591L;

	private String id;
	private String roleName;
	private String roleDescription;
	private Boolean enable;
	
	public Role() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", roleName=" + roleName + ", roleDescription=" + roleDescription + ", enable="
				+ enable + "]";
	}
	
}
