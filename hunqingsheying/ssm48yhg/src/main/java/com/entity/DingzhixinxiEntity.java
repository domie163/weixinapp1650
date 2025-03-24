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
 * 定制信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("dingzhixinxi")
public class DingzhixinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public DingzhixinxiEntity() {
		
	}
	
	public DingzhixinxiEntity(T t) {
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
	 * 定制名称
	 */
					
	private String dingzhimingcheng;
	
	/**
	 * 定制效果
	 */
					
	private String dingzhixiaoguo;
	
	/**
	 * 定制类型
	 */
					
	private String dingzhileixing;
	
	/**
	 * 定制价格
	 */
					
	private Integer dingzhijiage;
	
	/**
	 * 定制详情
	 */
					
	private String dingzhixiangqing;
	
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
	 * 设置：定制名称
	 */
	public void setDingzhimingcheng(String dingzhimingcheng) {
		this.dingzhimingcheng = dingzhimingcheng;
	}
	/**
	 * 获取：定制名称
	 */
	public String getDingzhimingcheng() {
		return dingzhimingcheng;
	}
	/**
	 * 设置：定制效果
	 */
	public void setDingzhixiaoguo(String dingzhixiaoguo) {
		this.dingzhixiaoguo = dingzhixiaoguo;
	}
	/**
	 * 获取：定制效果
	 */
	public String getDingzhixiaoguo() {
		return dingzhixiaoguo;
	}
	/**
	 * 设置：定制类型
	 */
	public void setDingzhileixing(String dingzhileixing) {
		this.dingzhileixing = dingzhileixing;
	}
	/**
	 * 获取：定制类型
	 */
	public String getDingzhileixing() {
		return dingzhileixing;
	}
	/**
	 * 设置：定制价格
	 */
	public void setDingzhijiage(Integer dingzhijiage) {
		this.dingzhijiage = dingzhijiage;
	}
	/**
	 * 获取：定制价格
	 */
	public Integer getDingzhijiage() {
		return dingzhijiage;
	}
	/**
	 * 设置：定制详情
	 */
	public void setDingzhixiangqing(String dingzhixiangqing) {
		this.dingzhixiangqing = dingzhixiangqing;
	}
	/**
	 * 获取：定制详情
	 */
	public String getDingzhixiangqing() {
		return dingzhixiangqing;
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
