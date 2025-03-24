package com.dao;

import com.entity.DiscusshunqingcehuaEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshunqingcehuaVO;
import com.entity.view.DiscusshunqingcehuaView;


/**
 * 婚庆策划评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DiscusshunqingcehuaDao extends BaseMapper<DiscusshunqingcehuaEntity> {
	
	List<DiscusshunqingcehuaVO> selectListVO(@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);
	
	DiscusshunqingcehuaVO selectVO(@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);
	
	List<DiscusshunqingcehuaView> selectListView(@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);

	List<DiscusshunqingcehuaView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);
	
	DiscusshunqingcehuaView selectView(@Param("ew") Wrapper<DiscusshunqingcehuaEntity> wrapper);
	

}
