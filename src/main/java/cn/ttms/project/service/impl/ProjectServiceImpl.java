package cn.ttms.project.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.ttms.project.dao.ProjectDao;
import cn.ttms.project.entity.Project;
import cn.ttms.project.service.ProjectService;
import cn.ttms.util.PageObject;

@Service
public class ProjectServiceImpl implements ProjectService {
   
	@Resource
    private ProjectDao projectDao;

	public Map<String, Object> findObjects(Project entity, PageObject pageObject) {
		// TODO Auto-generated method stub
		 List<Map<String,Object>> list=projectDao.findObjects(entity, pageObject);
		 pageObject.setRowCount(projectDao.getRowCounts(entity));
		 Map<String,Object> map=new HashMap<String,Object>();
		 map.put("list", list);
		 map.put("pageObject",pageObject);
		 return map;
	}
	@Override
	public int saveObject(Project entity) {
		int result=projectDao.save(entity);
		if(result==-1)throw new RuntimeException("save error");
		return result;
	}
	@Override
	public int updateObject(Project entity) {
		int result=projectDao.updateObject(entity);
		if(result==-1)throw new RuntimeException("update error");
		return result;
	}

	@Override
	public Map<String, Object> findObjectById(Integer id) {
		if(id==null)throw new RuntimeException("id can be null");
		return projectDao.findObjectById(id);
	}
	
	@Override
	public void validById(String ids, Integer valid) {
		if(ids==null)throw new RuntimeException("必须选中id");
		String[] idArray=ids.split(",");
		int result=projectDao.validById(idArray, valid);
		if(result<0){
			throw new RuntimeException("更新失败");
		}
	}

}
