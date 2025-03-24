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


import com.dao.CehuashiDao;
import com.entity.CehuashiEntity;
import com.service.CehuashiService;
import com.entity.vo.CehuashiVO;
import com.entity.view.CehuashiView;

@Service("cehuashiService")
public class CehuashiServiceImpl extends ServiceImpl<CehuashiDao, CehuashiEntity> implements CehuashiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CehuashiEntity> page = this.selectPage(
                new Query<CehuashiEntity>(params).getPage(),
                new EntityWrapper<CehuashiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CehuashiEntity> wrapper) {
		  Page<CehuashiView> page =new Query<CehuashiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CehuashiVO> selectListVO(Wrapper<CehuashiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CehuashiVO selectVO(Wrapper<CehuashiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CehuashiView> selectListView(Wrapper<CehuashiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CehuashiView selectView(Wrapper<CehuashiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
