package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DingzhixinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DingzhixinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DingzhixinxiView;


/**
 * 定制信息
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface DingzhixinxiService extends IService<DingzhixinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DingzhixinxiVO> selectListVO(Wrapper<DingzhixinxiEntity> wrapper);
   	
   	DingzhixinxiVO selectVO(@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);
   	
   	List<DingzhixinxiView> selectListView(Wrapper<DingzhixinxiEntity> wrapper);
   	
   	DingzhixinxiView selectView(@Param("ew") Wrapper<DingzhixinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DingzhixinxiEntity> wrapper);
   	

}

