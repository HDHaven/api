package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class Column implements Serializable {
	private static final long serialVersionUID = 3853482176268405406L;

	private String id;
	private String name;
	private String description;
	private Boolean enable;
	private String tableId;
	
	public Column() {}

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

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public String getTableId() {
		return tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	@Override
	public String toString() {
		return "Column [id=" + id + ", name=" + name + ", description=" + description + ", enable=" + enable
				+ ", tableId=" + tableId + "]";
	}
	
}
