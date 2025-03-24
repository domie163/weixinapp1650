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


import com.dao.HunshazhaoDao;
import com.entity.HunshazhaoEntity;
import com.service.HunshazhaoService;
import com.entity.vo.HunshazhaoVO;
import com.entity.view.HunshazhaoView;

@Service("hunshazhaoService")
public class HunshazhaoServiceImpl extends ServiceImpl<HunshazhaoDao, HunshazhaoEntity> implements HunshazhaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HunshazhaoEntity> page = this.selectPage(
                new Query<HunshazhaoEntity>(params).getPage(),
                new EntityWrapper<HunshazhaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HunshazhaoEntity> wrapper) {
		  Page<HunshazhaoView> page =new Query<HunshazhaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HunshazhaoVO> selectListVO(Wrapper<HunshazhaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HunshazhaoVO selectVO(Wrapper<HunshazhaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HunshazhaoView> selectListView(Wrapper<HunshazhaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HunshazhaoView selectView(Wrapper<HunshazhaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
