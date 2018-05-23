package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.Permission;
import cn.sunrun.haven.api.domain.PermissionResourceRel;

public interface PermissionRepository {

	/* 对Permission表的操作 */
	
	void insert(Permission permission);
	
	Permission selectById(String id);
	
	List<Permission> selectByCondition(Permission permission);
	
	void update(Permission permission);
	
	void deleteById(String id);
	
	void deleteByCondition(Permission permission);
	
	/* 对PermissionResourceRel表的操作 */
	
	void insertRel(PermissionResourceRel permissionResourceRel);
	
	List<PermissionResourceRel> selectRel(PermissionResourceRel permissionResourceRel);
	
	void deleteRel(PermissionResourceRel permissionResourceRel);
	
}
