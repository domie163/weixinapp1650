package com.dao;

import com.entity.PaisheyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PaisheyuyueVO;
import com.entity.view.PaisheyuyueView;


/**
 * 拍摄预约
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface PaisheyuyueDao extends BaseMapper<PaisheyuyueEntity> {
	
	List<PaisheyuyueVO> selectListVO(@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);
	
	PaisheyuyueVO selectVO(@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);
	
	List<PaisheyuyueView> selectListView(@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);

	List<PaisheyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);
	
	PaisheyuyueView selectView(@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);
	

}
