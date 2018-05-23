package cn.sunrun.haven.api.domain;

import java.io.Serializable;
import java.util.List;

public class Database implements Serializable {
	private static final long serialVersionUID = -775707531348440866L;

	private String id;
	private String dbName;
	private String dbUrl;
	private String dbDriver;
	private String username;
	private String password;
	private String scheme;
	private String host;
	private String port;
	private Boolean enable;
	private List<Table> tableList;
	
	public Database() {}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbUrl() {
		return dbUrl;
	}

	public void setDbUrl(String dbUrl) {
		this.dbUrl = dbUrl;
	}

	public String getDbDriver() {
		return dbDriver;
	}

	public void setDbDriver(String dbDriver) {
		this.dbDriver = dbDriver;
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

	public String getScheme() {
		return scheme;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPort() {
		return port;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public Boolean getEnable() {
		return enable;
	}

	public void setEnable(Boolean enable) {
		this.enable = enable;
	}

	public List<Table> getTableList() {
		return tableList;
	}

	public void setTableList(List<Table> tableList) {
		this.tableList = tableList;
	}

	@Override
	public String toString() {
		return "Database [id=" + id + ", dbName=" + dbName + ", dbUrl=" + dbUrl + ", dbDriver=" + dbDriver
				+ ", username=" + username + ", password=" + password + ", scheme=" + scheme + ", host=" + host
				+ ", port=" + port + ", enable=" + enable + "]";
	}
	
}
