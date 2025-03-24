package com.dao;

import com.entity.YifudingzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YifudingzhiVO;
import com.entity.view.YifudingzhiView;


/**
 * 衣服定制
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface YifudingzhiDao extends BaseMapper<YifudingzhiEntity> {
	
	List<YifudingzhiVO> selectListVO(@Param("ew") Wrapper<YifudingzhiEntity> wrapper);
	
	YifudingzhiVO selectVO(@Param("ew") Wrapper<YifudingzhiEntity> wrapper);
	
	List<YifudingzhiView> selectListView(@Param("ew") Wrapper<YifudingzhiEntity> wrapper);

	List<YifudingzhiView> selectListView(Pagination page,@Param("ew") Wrapper<YifudingzhiEntity> wrapper);
	
	YifudingzhiView selectView(@Param("ew") Wrapper<YifudingzhiEntity> wrapper);
	

}
