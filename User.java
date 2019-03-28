package com.db.sys.entity;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable{

	
	
	private static final long serialVersionUID = 3721519741203376344L;

	
	private Integer id;    //用户Id
	private String username;   //姓名
	private String mobile;  //手机号
	private Integer valid;   // 当前转态：  0--禁用，1--正常，默认值为1
	private Integer deptId;   //部门Id
	private Date createdTime;  //创建时间
	private Date updateTime;   //更改时间
	private String createdUser;  //创建用户
	private String updateUser;   //修改用户
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getValid() {
		return valid;
	}
	public void setValid(Integer valid) {
		this.valid = valid;
	}
	public Integer getDeptId() {
		return deptId;
	}
	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	public String getCreatedUser() {
		return createdUser;
	}
	public void setCreatedUser(String createdUser) {
		this.createdUser = createdUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	
	
	
}
