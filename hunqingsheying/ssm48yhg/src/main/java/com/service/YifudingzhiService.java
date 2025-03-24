package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YifudingzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YifudingzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YifudingzhiView;


/**
 * 衣服定制
 *
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
public interface YifudingzhiService extends IService<YifudingzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YifudingzhiVO> selectListVO(Wrapper<YifudingzhiEntity> wrapper);
   	
   	YifudingzhiVO selectVO(@Param("ew") Wrapper<YifudingzhiEntity> wrapper);
   	
   	List<YifudingzhiView> selectListView(Wrapper<YifudingzhiEntity> wrapper);
   	
   	YifudingzhiView selectView(@Param("ew") Wrapper<YifudingzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YifudingzhiEntity> wrapper);
   	

}

