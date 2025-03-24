package com.entity.view;

import com.entity.HunshazhaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 婚纱照
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("hunshazhao")
public class HunshazhaoView  extends HunshazhaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public HunshazhaoView(){
	}
 
 	public HunshazhaoView(HunshazhaoEntity hunshazhaoEntity){
 	try {
			BeanUtils.copyProperties(this, hunshazhaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
