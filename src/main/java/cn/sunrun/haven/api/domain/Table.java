package cn.sunrun.haven.api.domain;

import java.io.Serializable;
import java.util.List;

public class Table implements Serializable {
	private static final long serialVersionUID = -482374652025297528L;

	private String id;
	private String tableName;
	private String description;
	private Boolean enable;
	private String dbId;
	private List<Column> columnList;
	
	public Table() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
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

	public String getDbId() {
		return dbId;
	}

	public void setDbId(String dbId) {
		this.dbId = dbId;
	}

	public List<Column> getColumnList() {
		return columnList;
	}

	public void setColumnList(List<Column> columnList) {
		this.columnList = columnList;
	}

	@Override
	public String toString() {
		return "Table [id=" + id + ", tableName=" + tableName + ", description=" + description + ", enable=" + enable
				+ ", dbId=" + dbId + "]";
	}
	
}
