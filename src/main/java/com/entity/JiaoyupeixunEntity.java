package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 教育培训
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
@TableName("jiaoyupeixun")
public class JiaoyupeixunEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public JiaoyupeixunEntity() {
		
	}
	
	public JiaoyupeixunEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 认证标题
	 */
					
	private String renzhengbiaoti;
	
	/**
	 * 封面
	 */
					
	private String fengmian;
	
	/**
	 * 服务时间
	 */
					
	private String fuwushijian;
	
	/**
	 * 认证要求
	 */
					
	private String renzhengyaoqiu;
	
	/**
	 * 认证详情
	 */
					
	private String renzhengxiangqing;
	
	/**
	 * 更新时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date gengxinshijian;
	
	/**
	 * 最近点击时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date clicktime;
	
	/**
	 * 点击次数
	 */
					
	private Integer clicknum;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：认证标题
	 */
	public void setRenzhengbiaoti(String renzhengbiaoti) {
		this.renzhengbiaoti = renzhengbiaoti;
	}
	/**
	 * 获取：认证标题
	 */
	public String getRenzhengbiaoti() {
		return renzhengbiaoti;
	}
	/**
	 * 设置：封面
	 */
	public void setFengmian(String fengmian) {
		this.fengmian = fengmian;
	}
	/**
	 * 获取：封面
	 */
	public String getFengmian() {
		return fengmian;
	}
	/**
	 * 设置：服务时间
	 */
	public void setFuwushijian(String fuwushijian) {
		this.fuwushijian = fuwushijian;
	}
	/**
	 * 获取：服务时间
	 */
	public String getFuwushijian() {
		return fuwushijian;
	}
	/**
	 * 设置：认证要求
	 */
	public void setRenzhengyaoqiu(String renzhengyaoqiu) {
		this.renzhengyaoqiu = renzhengyaoqiu;
	}
	/**
	 * 获取：认证要求
	 */
	public String getRenzhengyaoqiu() {
		return renzhengyaoqiu;
	}
	/**
	 * 设置：认证详情
	 */
	public void setRenzhengxiangqing(String renzhengxiangqing) {
		this.renzhengxiangqing = renzhengxiangqing;
	}
	/**
	 * 获取：认证详情
	 */
	public String getRenzhengxiangqing() {
		return renzhengxiangqing;
	}
	/**
	 * 设置：更新时间
	 */
	public void setGengxinshijian(Date gengxinshijian) {
		this.gengxinshijian = gengxinshijian;
	}
	/**
	 * 获取：更新时间
	 */
	public Date getGengxinshijian() {
		return gengxinshijian;
	}
	/**
	 * 设置：最近点击时间
	 */
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
	/**
	 * 设置：点击次数
	 */
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}

}
