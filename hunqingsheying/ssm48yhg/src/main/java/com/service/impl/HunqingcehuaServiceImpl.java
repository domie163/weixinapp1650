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


import com.dao.HunqingcehuaDao;
import com.entity.HunqingcehuaEntity;
import com.service.HunqingcehuaService;
import com.entity.vo.HunqingcehuaVO;
import com.entity.view.HunqingcehuaView;

@Service("hunqingcehuaService")
public class HunqingcehuaServiceImpl extends ServiceImpl<HunqingcehuaDao, HunqingcehuaEntity> implements HunqingcehuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<HunqingcehuaEntity> page = this.selectPage(
                new Query<HunqingcehuaEntity>(params).getPage(),
                new EntityWrapper<HunqingcehuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<HunqingcehuaEntity> wrapper) {
		  Page<HunqingcehuaView> page =new Query<HunqingcehuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<HunqingcehuaVO> selectListVO(Wrapper<HunqingcehuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public HunqingcehuaVO selectVO(Wrapper<HunqingcehuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<HunqingcehuaView> selectListView(Wrapper<HunqingcehuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public HunqingcehuaView selectView(Wrapper<HunqingcehuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
