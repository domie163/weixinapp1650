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


import com.dao.DiscusshunshazhaoDao;
import com.entity.DiscusshunshazhaoEntity;
import com.service.DiscusshunshazhaoService;
import com.entity.vo.DiscusshunshazhaoVO;
import com.entity.view.DiscusshunshazhaoView;

@Service("discusshunshazhaoService")
public class DiscusshunshazhaoServiceImpl extends ServiceImpl<DiscusshunshazhaoDao, DiscusshunshazhaoEntity> implements DiscusshunshazhaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshunshazhaoEntity> page = this.selectPage(
                new Query<DiscusshunshazhaoEntity>(params).getPage(),
                new EntityWrapper<DiscusshunshazhaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshunshazhaoEntity> wrapper) {
		  Page<DiscusshunshazhaoView> page =new Query<DiscusshunshazhaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshunshazhaoVO> selectListVO(Wrapper<DiscusshunshazhaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshunshazhaoVO selectVO(Wrapper<DiscusshunshazhaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshunshazhaoView> selectListView(Wrapper<DiscusshunshazhaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshunshazhaoView selectView(Wrapper<DiscusshunshazhaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
