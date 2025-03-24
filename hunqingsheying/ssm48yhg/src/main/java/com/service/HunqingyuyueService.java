package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HunqingyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HunqingyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HunqingyuyueView;


/**
 * 婚庆预约
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface HunqingyuyueService extends IService<HunqingyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HunqingyuyueVO> selectListVO(Wrapper<HunqingyuyueEntity> wrapper);
   	
   	HunqingyuyueVO selectVO(@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);
   	
   	List<HunqingyuyueView> selectListView(Wrapper<HunqingyuyueEntity> wrapper);
   	
   	HunqingyuyueView selectView(@Param("ew") Wrapper<HunqingyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HunqingyuyueEntity> wrapper);
   	

}

