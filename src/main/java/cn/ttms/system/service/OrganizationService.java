package cn.ttms.system.service;

import java.util.Map;

import cn.ttms.system.entity.Organization;
import cn.ttms.util.PageObject;

public interface OrganizationService {
	Map<String,Object> findObjects(Organization entity,PageObject pageObject);
	void saveObject(Organization entity);	
	void updateObject(Organization entity);
	Map<String,Object> findObjectById(Integer id);
    void validById(String ids,Integer valid);
}
