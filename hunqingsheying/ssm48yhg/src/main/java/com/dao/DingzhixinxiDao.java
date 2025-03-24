package com.dao;

import com.entity.DingzhixinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DingzhixinxiVO;
import com.entity.view.DingzhixinxiView;


/**
 * 定制信息
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DingzhixinxiDao extends BaseMapper<DingzhixinxiEntity> {
	
	List<DingzhixinxiVO> selectListVO(@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);
	
	DingzhixinxiVO selectVO(@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);
	
	List<DingzhixinxiView> selectListView(@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);

	List<DingzhixinxiView> selectListView(Pagination page,@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);
	
	DingzhixinxiView selectView(@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);
	

}
