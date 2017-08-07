package cn.ttms.project.service;

import java.util.Map;

import cn.ttms.project.entity.Project;
import cn.ttms.util.PageObject;

public interface ProjectService {
	Map<String,Object> findObjects(Project entity,PageObject pageObject);
	int saveObject(Project entity);	
	int updateObject(Project entity);
	Map<String,Object> findObjectById(Integer id);
    void validById(String ids,Integer valid);
}
