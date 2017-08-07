package cn.ttms.system.dao;

import java.util.List;
import java.util.Map;

import cn.ttms.common.dao.BaseDao;
import cn.ttms.system.entity.Menu;


public interface MenuDao extends BaseDao<Menu> {
	List<Map<String, Object>> findTreeData();
	int hasChild(Integer menuId);
}
