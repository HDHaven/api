package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.Resource;

public interface ResourceRepository {

	void insert(Resource resource);
	
	Resource select(String id);
	
	List<Resource> select(Resource resource);
	
	void update(Resource resource);
	
	void delete(String id);
	
	void delete(Resource resource);
	
}
