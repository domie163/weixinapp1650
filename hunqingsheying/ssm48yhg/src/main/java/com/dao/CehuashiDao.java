package com.dao;

import com.entity.CehuashiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CehuashiVO;
import com.entity.view.CehuashiView;


/**
 * 策划师
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface CehuashiDao extends BaseMapper<CehuashiEntity> {
	
	List<CehuashiVO> selectListVO(@Param("ew") Wrapper<CehuashiEntity> wrapper);
	
	CehuashiVO selectVO(@Param("ew") Wrapper<CehuashiEntity> wrapper);
	
	List<CehuashiView> selectListView(@Param("ew") Wrapper<CehuashiEntity> wrapper);

	List<CehuashiView> selectListView(Pagination page,@Param("ew") Wrapper<CehuashiEntity> wrapper);
	
	CehuashiView selectView(@Param("ew") Wrapper<CehuashiEntity> wrapper);
	

}
