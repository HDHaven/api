package cn.sunrun.haven.api.repository;

import java.util.List;

import cn.sunrun.haven.api.domain.EnterpriseInfo;
import cn.sunrun.haven.api.domain.EnterpriseRoleRel;

public interface EnterpriseRepository {

	/* 对Enterprise表的操作 */
	
	void insert(EnterpriseInfo enterpriseInfo);
	
	EnterpriseInfo selectById(String id);
	
	List<EnterpriseInfo> selectByCondition(EnterpriseInfo enterpriseInfo);
	
	void update(EnterpriseInfo enterpriseInfo);
	
	void deleteById(String id);
	
	void deleteByCondition(EnterpriseInfo enterpriseInfo);
	
	/* 对EnterpriseRoleRel表的操作 */
	
	void insertRel(EnterpriseRoleRel enterpriseRoleRel);
	
	List<EnterpriseRoleRel> selectRel(EnterpriseRoleRel enterpriseRoleRel);
	
	void deleteRel(EnterpriseRoleRel enterpriseRoleRel);
	
}
