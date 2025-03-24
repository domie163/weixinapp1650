package com.dao;

import com.entity.DiscusshunshazhaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscusshunshazhaoVO;
import com.entity.view.DiscusshunshazhaoView;


/**
 * 婚纱照评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DiscusshunshazhaoDao extends BaseMapper<DiscusshunshazhaoEntity> {
	
	List<DiscusshunshazhaoVO> selectListVO(@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);
	
	DiscusshunshazhaoVO selectVO(@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);
	
	List<DiscusshunshazhaoView> selectListView(@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);

	List<DiscusshunshazhaoView> selectListView(Pagination page,@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);
	
	DiscusshunshazhaoView selectView(@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);
	

}
