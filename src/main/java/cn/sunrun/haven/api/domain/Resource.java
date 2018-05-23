package cn.sunrun.haven.api.domain;

import java.io.Serializable;

public class Resource implements Serializable {
	private static final long serialVersionUID = -8571523141690214047L;

	private String id;
	private String name;
	private String description;
	private String method;
	private String url;
	private String params;
	private String retdata;
	private String protocol;
	
	public Resource() {}

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

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getParams() {
		return params;
	}

	public void setParams(String params) {
		this.params = params;
	}

	public String getRetdata() {
		return retdata;
	}

	public void setRetdata(String retdata) {
		this.retdata = retdata;
	}

	public String getProtocol() {
		return protocol;
	}

	public void setProtocol(String protocol) {
		this.protocol = protocol;
	}

	@Override
	public String toString() {
		return "Resource [id=" + id + ", name=" + name + ", description=" + description + ", method=" + method
				+ ", url=" + url + ", params=" + params + ", retdata=" + retdata + ", protocol=" + protocol + "]";
	}
	
}
