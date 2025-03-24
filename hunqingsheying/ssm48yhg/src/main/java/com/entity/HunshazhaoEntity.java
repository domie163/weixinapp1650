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
 * 婚纱照
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("hunshazhao")
public class HunshazhaoEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public HunshazhaoEntity() {
		
	}
	
	public HunshazhaoEntity(T t) {
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
	 * 套餐名称
	 */
					
	private String taocanmingcheng;
	
	/**
	 * 套餐封面
	 */
					
	private String taocanfengmian;
	
	/**
	 * 摄影地点
	 */
					
	private String sheyingdidian;
	
	/**
	 * 套餐价格
	 */
					
	private Integer taocanjiage;
	
	/**
	 * 套餐简介
	 */
					
	private String taocanjianjie;
	
	/**
	 * 套餐详情
	 */
					
	private String taocanxiangqing;
	
	/**
	 * 策划账号
	 */
					
	private String cehuazhanghao;
	
	/**
	 * 策划姓名
	 */
					
	private String cehuaxingming;
	
	/**
	 * 联系手机
	 */
					
	private String lianxishouji;
	
	/**
	 * 发布日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date faburiqi;
	
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
	 * 设置：套餐名称
	 */
	public void setTaocanmingcheng(String taocanmingcheng) {
		this.taocanmingcheng = taocanmingcheng;
	}
	/**
	 * 获取：套餐名称
	 */
	public String getTaocanmingcheng() {
		return taocanmingcheng;
	}
	/**
	 * 设置：套餐封面
	 */
	public void setTaocanfengmian(String taocanfengmian) {
		this.taocanfengmian = taocanfengmian;
	}
	/**
	 * 获取：套餐封面
	 */
	public String getTaocanfengmian() {
		return taocanfengmian;
	}
	/**
	 * 设置：摄影地点
	 */
	public void setSheyingdidian(String sheyingdidian) {
		this.sheyingdidian = sheyingdidian;
	}
	/**
	 * 获取：摄影地点
	 */
	public String getSheyingdidian() {
		return sheyingdidian;
	}
	/**
	 * 设置：套餐价格
	 */
	public void setTaocanjiage(Integer taocanjiage) {
		this.taocanjiage = taocanjiage;
	}
	/**
	 * 获取：套餐价格
	 */
	public Integer getTaocanjiage() {
		return taocanjiage;
	}
	/**
	 * 设置：套餐简介
	 */
	public void setTaocanjianjie(String taocanjianjie) {
		this.taocanjianjie = taocanjianjie;
	}
	/**
	 * 获取：套餐简介
	 */
	public String getTaocanjianjie() {
		return taocanjianjie;
	}
	/**
	 * 设置：套餐详情
	 */
	public void setTaocanxiangqing(String taocanxiangqing) {
		this.taocanxiangqing = taocanxiangqing;
	}
	/**
	 * 获取：套餐详情
	 */
	public String getTaocanxiangqing() {
		return taocanxiangqing;
	}
	/**
	 * 设置：策划账号
	 */
	public void setCehuazhanghao(String cehuazhanghao) {
		this.cehuazhanghao = cehuazhanghao;
	}
	/**
	 * 获取：策划账号
	 */
	public String getCehuazhanghao() {
		return cehuazhanghao;
	}
	/**
	 * 设置：策划姓名
	 */
	public void setCehuaxingming(String cehuaxingming) {
		this.cehuaxingming = cehuaxingming;
	}
	/**
	 * 获取：策划姓名
	 */
	public String getCehuaxingming() {
		return cehuaxingming;
	}
	/**
	 * 设置：联系手机
	 */
	public void setLianxishouji(String lianxishouji) {
		this.lianxishouji = lianxishouji;
	}
	/**
	 * 获取：联系手机
	 */
	public String getLianxishouji() {
		return lianxishouji;
	}
	/**
	 * 设置：发布日期
	 */
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
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
