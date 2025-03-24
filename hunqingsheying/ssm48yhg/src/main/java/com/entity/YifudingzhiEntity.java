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
 * 衣服定制
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("yifudingzhi")
public class YifudingzhiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public YifudingzhiEntity() {
		
	}
	
	public YifudingzhiEntity(T t) {
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
	 * 数量
	 */
					
	private Integer shuliang;
	
	/**
	 * 金额
	 */
					
	private Integer jine;
	
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
	 * 下单日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiadanriqi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 账号
	 */
					
	private String zhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机号码
	 */
					
	private String shoujihaoma;
	
	/**
	 * 是否审核
	 */
					
	private String sfsh;
	
	/**
	 * 审核回复
	 */
					
	private String shhf;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	/**
	 * 用户id
	 */
					
	private Long userid;
	
	
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
	 * 设置：数量
	 */
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
	/**
	 * 设置：金额
	 */
	public void setJine(Integer jine) {
		this.jine = jine;
	}
	/**
	 * 获取：金额
	 */
	public Integer getJine() {
		return jine;
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
	 * 设置：下单日期
	 */
	public void setXiadanriqi(Date xiadanriqi) {
		this.xiadanriqi = xiadanriqi;
	}
	/**
	 * 获取：下单日期
	 */
	public Date getXiadanriqi() {
		return xiadanriqi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：账号
	 */
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机号码
	 */
	public void setShoujihaoma(String shoujihaoma) {
		this.shoujihaoma = shoujihaoma;
	}
	/**
	 * 获取：手机号码
	 */
	public String getShoujihaoma() {
		return shoujihaoma;
	}
	/**
	 * 设置：是否审核
	 */
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
	/**
	 * 设置：审核回复
	 */
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
	/**
	 * 设置：用户id
	 */
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}

}
