package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.Role;
import cn.sunrun.haven.api.domain.RolePermissionRel;

public interface RoleRepository {

	/* 对Role表的操作 */
	
	void insert(Role role);
	
	Role selectById(String id);
	
	List<Role> selectByCondition(Role role);
	
	void update(Role role);
	
	void deleteById(String id);
	
	void deleteByCondition(Role role);
	
	/* 对RolePermissionRel表的操作 */
	
	void insertRel(RolePermissionRel rolePermissionRel);
	
	List<RolePermissionRel> selectRel(RolePermissionRel rolePermissionRel);
	
	void deleteRel(RolePermissionRel rolePermissionRel);
	
}
