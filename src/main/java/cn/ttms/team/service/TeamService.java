package cn.ttms.team.service;

import java.util.List;
import java.util.Map;

import cn.ttms.team.entity.Team;
import cn.ttms.util.PageObject;

public interface TeamService {
	Map<String,Object> findObjects(Team entity,PageObject pageObject);
	void saveObject(Team entity);	
	void updateObject(Team entity);
	Map<String,Object> findObjectById(Integer id);
    void validById(String ids,Integer valid);
    
    List<Map<String, Object>>  findProjectOptions();
}
