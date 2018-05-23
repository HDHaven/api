package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class PermissionResourceRel implements Serializable {
	private static final long serialVersionUID = -4206278688276635857L;

	private String resourceId;
	private String permissionId;
	private String Description;
	
	public PermissionResourceRel() {}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	@Override
	public String toString() {
		return "RoleResourceRel [resourceId=" + resourceId + ", permissionId=" + permissionId + ", Description="
				+ Description + "]";
	}

}
