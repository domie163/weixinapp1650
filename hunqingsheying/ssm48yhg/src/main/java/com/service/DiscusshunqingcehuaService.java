package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshunqingcehuaEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshunqingcehuaVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshunqingcehuaView;


/**
 * 婚庆策划评论表
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DiscusshunqingcehuaService extends IService<DiscusshunqingcehuaEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshunqingcehuaVO> selectListVO(Wrapper<DiscusshunqingcehuaEntity> wrapper);
   	
   	DiscusshunqingcehuaVO selectVO(@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);
   	
   	List<DiscusshunqingcehuaView> selectListView(Wrapper<DiscusshunqingcehuaEntity> wrapper);
   	
   	DiscusshunqingcehuaView selectView(@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshunqingcehuaEntity> wrapper);
   	

}

