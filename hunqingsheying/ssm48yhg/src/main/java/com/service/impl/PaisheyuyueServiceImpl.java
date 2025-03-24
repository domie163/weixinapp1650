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


import com.dao.PaisheyuyueDao;
import com.entity.PaisheyuyueEntity;
import com.service.PaisheyuyueService;
import com.entity.vo.PaisheyuyueVO;
import com.entity.view.PaisheyuyueView;

@Service("paisheyuyueService")
public class PaisheyuyueServiceImpl extends ServiceImpl<PaisheyuyueDao, PaisheyuyueEntity> implements PaisheyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PaisheyuyueEntity> page = this.selectPage(
                new Query<PaisheyuyueEntity>(params).getPage(),
                new EntityWrapper<PaisheyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PaisheyuyueEntity> wrapper) {
		  Page<PaisheyuyueView> page =new Query<PaisheyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PaisheyuyueVO> selectListVO(Wrapper<PaisheyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PaisheyuyueVO selectVO(Wrapper<PaisheyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PaisheyuyueView> selectListView(Wrapper<PaisheyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PaisheyuyueView selectView(Wrapper<PaisheyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
