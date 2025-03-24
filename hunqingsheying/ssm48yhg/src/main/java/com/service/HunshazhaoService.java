package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.HunshazhaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.HunshazhaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.HunshazhaoView;


/**
 * 婚纱照
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface HunshazhaoService extends IService<HunshazhaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<HunshazhaoVO> selectListVO(Wrapper<HunshazhaoEntity> wrapper);
   	
   	HunshazhaoVO selectVO(@Param("ew") Wrapper<HunshazhaoEntity> wrapper);
   	
   	List<HunshazhaoView> selectListView(Wrapper<HunshazhaoEntity> wrapper);
   	
   	HunshazhaoView selectView(@Param("ew") Wrapper<HunshazhaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<HunshazhaoEntity> wrapper);
   	

}

