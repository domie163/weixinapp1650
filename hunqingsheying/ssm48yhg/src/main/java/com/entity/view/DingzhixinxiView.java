package com.entity.view;

import com.entity.DingzhixinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 定制信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("dingzhixinxi")
public class DingzhixinxiView  extends DingzhixinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DingzhixinxiView(){
	}
 
 	public DingzhixinxiView(DingzhixinxiEntity dingzhixinxiEntity){
 	try {
			BeanUtils.copyProperties(this, dingzhixinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
