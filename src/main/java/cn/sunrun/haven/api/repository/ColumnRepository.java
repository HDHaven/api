package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.Column;

public interface ColumnRepository {

	void insert(Column column);
	
	Column selectById(String id);
	
	List<Column> selectByCondition(Column column);
	
	void update(Column column);
	
	void deleteById(String id);
	
	void deleteByCondition(Column column);
	
}
