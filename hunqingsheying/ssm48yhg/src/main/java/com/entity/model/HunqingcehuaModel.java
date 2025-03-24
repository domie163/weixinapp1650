package com.entity.model;

import com.entity.HunqingcehuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 婚庆策划
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public class HunqingcehuaModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 婚庆封面
	 */
	
	private String hunqingfengmian;
		
	/**
	 * 类型
	 */
	
	private String leixing;
		
	/**
	 * 地址
	 */
	
	private String dizhi;
		
	/**
	 * 费用
	 */
	
	private Integer feiyong;
		
	/**
	 * 流程简介
	 */
	
	private String liuchengjianjie;
		
	/**
	 * 婚庆详情
	 */
	
	private String hunqingxiangqing;
		
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
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
				
	
	/**
	 * 设置：婚庆封面
	 */
	 
	public void setHunqingfengmian(String hunqingfengmian) {
		this.hunqingfengmian = hunqingfengmian;
	}
	
	/**
	 * 获取：婚庆封面
	 */
	public String getHunqingfengmian() {
		return hunqingfengmian;
	}
				
	
	/**
	 * 设置：类型
	 */
	 
	public void setLeixing(String leixing) {
		this.leixing = leixing;
	}
	
	/**
	 * 获取：类型
	 */
	public String getLeixing() {
		return leixing;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	
	/**
	 * 获取：地址
	 */
	public String getDizhi() {
		return dizhi;
	}
				
	
	/**
	 * 设置：费用
	 */
	 
	public void setFeiyong(Integer feiyong) {
		this.feiyong = feiyong;
	}
	
	/**
	 * 获取：费用
	 */
	public Integer getFeiyong() {
		return feiyong;
	}
				
	
	/**
	 * 设置：流程简介
	 */
	 
	public void setLiuchengjianjie(String liuchengjianjie) {
		this.liuchengjianjie = liuchengjianjie;
	}
	
	/**
	 * 获取：流程简介
	 */
	public String getLiuchengjianjie() {
		return liuchengjianjie;
	}
				
	
	/**
	 * 设置：婚庆详情
	 */
	 
	public void setHunqingxiangqing(String hunqingxiangqing) {
		this.hunqingxiangqing = hunqingxiangqing;
	}
	
	/**
	 * 获取：婚庆详情
	 */
	public String getHunqingxiangqing() {
		return hunqingxiangqing;
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
