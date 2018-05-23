package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class Permission implements Serializable {
	private static final long serialVersionUID = 6913534072113131339L;

	private String id;
	private String name;
	private String description;
	private String dbId;
	private String tableId;
	private String fieldIds;
	
	public Permission() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDbId() {
		return dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getFieldIds() {
		return fieldIds;
	}

	public void setFieldIds(String fieldIds) {
		this.fieldIds = fieldIds;
	}

	@Override
	public String toString() {
		return "Permission [id=" + id + ", name=" + name + ", description=" + description + ", dbId=" + dbId
				+ ", tableId=" + tableId + ", fieldIds=" + fieldIds + "]";
	}
	
}
