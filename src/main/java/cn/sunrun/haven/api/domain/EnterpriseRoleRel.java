package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class EnterpriseRoleRel implements Serializable {
	private static final long serialVersionUID = 903327893719109513L;

	private String roleId;
	private String enterpriseId;
	private String description;
	
	public EnterpriseRoleRel() {}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getEnterpriseId() {
		return enterpriseId;
	}

	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "RoleEnterpriseRel [roleId=" + roleId + ", enterpriseId=" + enterpriseId + ", description=" + description
				+ "]";
	}
	
}
