package com.entity.vo;

import com.entity.PaisheyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 拍摄预约
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public class PaisheyuyueVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
	 * 下单时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiadanshijian;
		
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
	 * 设置：下单时间
	 */
	 
	public void setXiadanshijian(Date xiadanshijian) {
		this.xiadanshijian = xiadanshijian;
	}
	
	/**
	 * 获取：下单时间
	 */
	public Date getXiadanshijian() {
		return xiadanshijian;
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
