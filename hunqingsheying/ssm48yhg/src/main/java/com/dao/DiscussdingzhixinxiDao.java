package com.dao;

import com.entity.DiscussdingzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussdingzhixinxiVO;
import com.entity.view.DiscussdingzhixinxiView;


/**
 * 定制信息评论表
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DiscussdingzhixinxiDao extends BaseMapper<DiscussdingzhixinxiEntity> {
	
	List<DiscussdingzhixinxiVO> selectListVO(@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);
	
	DiscussdingzhixinxiVO selectVO(@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);
	
	List<DiscussdingzhixinxiView> selectListView(@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);

	List<DiscussdingzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);
	
	DiscussdingzhixinxiView selectView(@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);
	

}
