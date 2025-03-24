package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HunqingcehuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HunqingcehuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HunqingcehuaView;


/**
 * 婚庆策划
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface HunqingcehuaService extends IService<HunqingcehuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HunqingcehuaVO> selectListVO(Wrapper<HunqingcehuaEntity> wrapper);
   	
   	HunqingcehuaVO selectVO(@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);
   	
   	List<HunqingcehuaView> selectListView(Wrapper<HunqingcehuaEntity> wrapper);
   	
   	HunqingcehuaView selectView(@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HunqingcehuaEntity> wrapper);
   	

}

