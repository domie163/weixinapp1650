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


import com.dao.DiscusshunqingcehuaDao;
import com.entity.DiscusshunqingcehuaEntity;
import com.service.DiscusshunqingcehuaService;
import com.entity.vo.DiscusshunqingcehuaVO;
import com.entity.view.DiscusshunqingcehuaView;

@Service("discusshunqingcehuaService")
public class DiscusshunqingcehuaServiceImpl extends ServiceImpl<DiscusshunqingcehuaDao, DiscusshunqingcehuaEntity> implements DiscusshunqingcehuaService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscusshunqingcehuaEntity> page = this.selectPage(
                new Query<DiscusshunqingcehuaEntity>(params).getPage(),
                new EntityWrapper<DiscusshunqingcehuaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscusshunqingcehuaEntity> wrapper) {
		  Page<DiscusshunqingcehuaView> page =new Query<DiscusshunqingcehuaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscusshunqingcehuaVO> selectListVO(Wrapper<DiscusshunqingcehuaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscusshunqingcehuaVO selectVO(Wrapper<DiscusshunqingcehuaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscusshunqingcehuaView> selectListView(Wrapper<DiscusshunqingcehuaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscusshunqingcehuaView selectView(Wrapper<DiscusshunqingcehuaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
