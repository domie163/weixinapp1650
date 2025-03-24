package com.dao;

import com.entity.HunshazhaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HunshazhaoVO;
import com.entity.view.HunshazhaoView;


/**
 * 婚纱照
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface HunshazhaoDao extends BaseMapper<HunshazhaoEntity> {
	
	List<HunshazhaoVO> selectListVO(@Param("ew") Wrapper<HunshazhaoEntity> wrapper);
	
	HunshazhaoVO selectVO(@Param("ew") Wrapper<HunshazhaoEntity> wrapper);
	
	List<HunshazhaoView> selectListView(@Param("ew") Wrapper<HunshazhaoEntity> wrapper);

	List<HunshazhaoView> selectListView(Pagination page,@Param("ew") Wrapper<HunshazhaoEntity> wrapper);
	
	HunshazhaoView selectView(@Param("ew") Wrapper<HunshazhaoEntity> wrapper);
	

}
