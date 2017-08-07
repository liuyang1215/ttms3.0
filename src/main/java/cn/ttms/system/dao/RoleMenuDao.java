package cn.ttms.system.dao;


import java.util.List;

import cn.ttms.common.dao.BaseDao;
import cn.ttms.system.entity.RoleMenu;

public interface RoleMenuDao extends BaseDao<RoleMenu> {
	List<Integer> findMenuIdListByRoleId(Integer roleId);
}
