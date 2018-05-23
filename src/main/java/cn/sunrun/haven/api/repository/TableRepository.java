package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.Table;

public interface TableRepository {

	void insert(Table table);
	
	Table select(String id);
	
	List<Table> select(Table table);
	
	void update(Table table);
	
	void delete(String id);
	
	void delete(Table table);
	
}
