package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscusshunshazhaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscusshunshazhaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscusshunshazhaoView;


/**
 * 婚纱照评论表
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DiscusshunshazhaoService extends IService<DiscusshunshazhaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscusshunshazhaoVO> selectListVO(Wrapper<DiscusshunshazhaoEntity> wrapper);
   	
   	DiscusshunshazhaoVO selectVO(@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);
   	
   	List<DiscusshunshazhaoView> selectListView(Wrapper<DiscusshunshazhaoEntity> wrapper);
   	
   	DiscusshunshazhaoView selectView(@Param("ew") Wrapper<DiscusshunshazhaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscusshunshazhaoEntity> wrapper);
   	

}

