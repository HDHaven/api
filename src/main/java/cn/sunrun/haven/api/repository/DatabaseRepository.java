package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.Database;

public interface DatabaseRepository {

	void insert(Database database);
	
	Database select(String id);
	
	List<Database> select(Database database);
	
	void update(Database database);
	
	void delete(String id);
	
	void delete(Database database);
	
}
