package cn.ttms.project.dao;


import java.util.List;
import java.util.Map;

import cn.ttms.common.dao.BaseDao;
import cn.ttms.project.entity.Project;

public interface ProjectDao extends BaseDao<Project>{
	
	List<Map<String,Object>> findOptions();
}
