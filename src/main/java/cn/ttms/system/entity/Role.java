package cn.ttms.system.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Role implements Serializable {

	private static final long serialVersionUID = -4947502179670638712L;

	private Integer id;
	private String name;
	private String note;
	private List<Integer> menuIdList;
	private String createdUser;
	private String modifiedUser;
	private Date coreatedTime;
	private Date modifiedTime;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getModifiedUser() {
		return modifiedUser;
	}
	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}
	public Date getCoreatedTime() {
		return coreatedTime;
	}
	public void setCoreatedTime(Date coreatedTime) {
		this.coreatedTime = coreatedTime;
	}
	public Date getModifiedTime() {
		return modifiedTime;
	}
	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
	public List<Integer> getMenuIdList() {
		return menuIdList;
	}
	public void setMenuIdList(List<Integer> menuIdList) {
		this.menuIdList = menuIdList;
	}
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + ", note=" + note + ", menuIdList=" + menuIdList + ", createdUser="
				+ createdUser + ", modifiedUser=" + modifiedUser + ", coreatedTime=" + coreatedTime + ", modifiedTime="
				+ modifiedTime + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}