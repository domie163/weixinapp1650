package com.dao;

import com.entity.HunqingcehuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HunqingcehuaVO;
import com.entity.view.HunqingcehuaView;


/**
 * 婚庆策划
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface HunqingcehuaDao extends BaseMapper<HunqingcehuaEntity> {
	
	List<HunqingcehuaVO> selectListVO(@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);
	
	HunqingcehuaVO selectVO(@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);
	
	List<HunqingcehuaView> selectListView(@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);

	List<HunqingcehuaView> selectListView(Pagination page,@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);
	
	HunqingcehuaView selectView(@Param("ew") Wrapper<HunqingcehuaEntity> wrapper);
	

}
