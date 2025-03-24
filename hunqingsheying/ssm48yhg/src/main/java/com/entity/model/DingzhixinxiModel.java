package com.entity.model;

import com.entity.DingzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 定制信息
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public class DingzhixinxiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
