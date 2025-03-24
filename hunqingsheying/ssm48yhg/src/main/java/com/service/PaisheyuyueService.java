package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PaisheyuyueEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PaisheyuyueVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PaisheyuyueView;


/**
 * 拍摄预约
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface PaisheyuyueService extends IService<PaisheyuyueEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PaisheyuyueVO> selectListVO(Wrapper<PaisheyuyueEntity> wrapper);
   	
   	PaisheyuyueVO selectVO(@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);
   	
   	List<PaisheyuyueView> selectListView(Wrapper<PaisheyuyueEntity> wrapper);
   	
   	PaisheyuyueView selectView(@Param("ew") Wrapper<PaisheyuyueEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PaisheyuyueEntity> wrapper);
   	

}

