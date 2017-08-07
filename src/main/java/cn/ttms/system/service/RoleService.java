package cn.ttms.system.service;

import java.util.List;
import java.util.Map;

import cn.ttms.system.entity.Role;
import cn.ttms.util.PageObject;

public interface RoleService {

	Map<String, Object> findObjects(Role role, PageObject pageObj);

	List<Map<String, Object>> loadMenuTree();

	void save(Role role);

	Role findRoleById(Integer roleId);

	void updateRole(Role role);

}
