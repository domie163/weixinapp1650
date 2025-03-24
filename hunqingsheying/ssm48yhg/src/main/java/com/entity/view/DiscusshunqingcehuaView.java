package com.entity.view;

import com.entity.DiscusshunqingcehuaEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 婚庆策划评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("discusshunqingcehua")
public class DiscusshunqingcehuaView  extends DiscusshunqingcehuaEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscusshunqingcehuaView(){
	}
 
 	public DiscusshunqingcehuaView(DiscusshunqingcehuaEntity discusshunqingcehuaEntity){
 	try {
			BeanUtils.copyProperties(this, discusshunqingcehuaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
