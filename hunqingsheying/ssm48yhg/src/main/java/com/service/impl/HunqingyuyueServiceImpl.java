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


import com.dao.HunqingyuyueDao;
import com.entity.HunqingyuyueEntity;
import com.service.HunqingyuyueService;
import com.entity.vo.HunqingyuyueVO;
import com.entity.view.HunqingyuyueView;

@Service("hunqingyuyueService")
public class HunqingyuyueServiceImpl extends ServiceImpl<HunqingyuyueDao, HunqingyuyueEntity> implements HunqingyuyueService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HunqingyuyueEntity> page = this.selectPage(
                new Query<HunqingyuyueEntity>(params).getPage(),
                new EntityWrapper<HunqingyuyueEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HunqingyuyueEntity> wrapper) {
		  Page<HunqingyuyueView> page =new Query<HunqingyuyueView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HunqingyuyueVO> selectListVO(Wrapper<HunqingyuyueEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HunqingyuyueVO selectVO(Wrapper<HunqingyuyueEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HunqingyuyueView> selectListView(Wrapper<HunqingyuyueEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HunqingyuyueView selectView(Wrapper<HunqingyuyueEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
