package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class RolePermissionRel implements Serializable {
	private static final long serialVersionUID = -2871089051034449952L;

	private String roleId;
	private String permissionId;
	private String description;
	
	public RolePermissionRel() {}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RolePermissionRel [roleId=" + roleId + ", permissionId=" + permissionId + ", description=" + description
				+ "]";
	}
	
}
