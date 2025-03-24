package com.entity.view;

import com.entity.PaisheyuyueEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 拍摄预约
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@TableName("paisheyuyue")
public class PaisheyuyueView  extends PaisheyuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PaisheyuyueView(){
	}
 
 	public PaisheyuyueView(PaisheyuyueEntity paisheyuyueEntity){
 	try {
			BeanUtils.copyProperties(this, paisheyuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
