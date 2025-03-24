package com.dao;

import com.entity.HunqingyuyueEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.HunqingyuyueVO;
import com.entity.view.HunqingyuyueView;


/**
 * 婚庆预约
 * 
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface HunqingyuyueDao extends BaseMapper<HunqingyuyueEntity> {
	
	List<HunqingyuyueVO> selectListVO(@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);
	
	HunqingyuyueVO selectVO(@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);
	
	List<HunqingyuyueView> selectListView(@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);

	List<HunqingyuyueView> selectListView(Pagination page,@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);
	
	HunqingyuyueView selectView(@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);
	

}
