package com.entity.view;

import com.entity.YifudingzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 衣服定制
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("yifudingzhi")
public class YifudingzhiView  extends YifudingzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YifudingzhiView(){
	}
 
 	public YifudingzhiView(YifudingzhiEntity yifudingzhiEntity){
 	try {
			BeanUtils.copyProperties(this, yifudingzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
