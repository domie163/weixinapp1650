package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.YifudingzhiDao;
import com.entity.YifudingzhiEntity;
import com.service.YifudingzhiService;
import com.entity.vo.YifudingzhiVO;
import com.entity.view.YifudingzhiView;

@Service("yifudingzhiService")
public class YifudingzhiServiceImpl extends ServiceImpl<YifudingzhiDao, YifudingzhiEntity> implements YifudingzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YifudingzhiEntity> page = this.selectPage(
                new Query<YifudingzhiEntity>(params).getPage(),
                new EntityWrapper<YifudingzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YifudingzhiEntity> wrapper) {
		  Page<YifudingzhiView> page =new Query<YifudingzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YifudingzhiVO> selectListVO(Wrapper<YifudingzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YifudingzhiVO selectVO(Wrapper<YifudingzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YifudingzhiView> selectListView(Wrapper<YifudingzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YifudingzhiView selectView(Wrapper<YifudingzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
