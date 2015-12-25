package com.socket.xueyi.domain;

import com.google.gson.annotations.Expose;
import com.socket.xueyi.enums.StatusEnum;

import java.util.Date;


/**
 * 就业指南
 * @author ChenTao
 * @date 2015年11月19日上午1:45:33
 */

public class StudyGuide  {

	private static final long serialVersionUID = -6158949383481295192L;


	@Expose
	private String id;

	/**
	 * 状态StatusEnum
	 */
	@Expose private StatusEnum status;

	/**
	 * 创建时间
	 */
	@Expose private Date createTime;

	/**
	 * 浙师大网站的创建时间
	 */
	@Expose private Date originalTime;

	/**
	 * 标题
	 */
	@Expose private String title;

	/**
	 * 内容
	 */
	@Expose private String content;

	/**
	 * 工作城市
	 */
	@Expose private String workCity;

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getOriginalTime() {
		return originalTime;
	}

	public void setOriginalTime(Date originalTime) {
		this.originalTime = originalTime;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWorkCity() {
		return workCity;
	}

	public void setWorkCity(String workCity) {
		this.workCity = workCity;
	}
}
