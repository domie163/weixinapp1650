package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussdingzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussdingzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussdingzhixinxiView;


/**
 * 定制信息评论表
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DiscussdingzhixinxiService extends IService<DiscussdingzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussdingzhixinxiVO> selectListVO(Wrapper<DiscussdingzhixinxiEntity> wrapper);
   	
   	DiscussdingzhixinxiVO selectVO(@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);
   	
   	List<DiscussdingzhixinxiView> selectListView(Wrapper<DiscussdingzhixinxiEntity> wrapper);
   	
   	DiscussdingzhixinxiView selectView(@Param("ew") Wrapper<DiscussdingzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussdingzhixinxiEntity> wrapper);
   	

}

