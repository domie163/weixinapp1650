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


import com.dao.DingzhixinxiDao;
import com.entity.DingzhixinxiEntity;
import com.service.DingzhixinxiService;
import com.entity.vo.DingzhixinxiVO;
import com.entity.view.DingzhixinxiView;

@Service("dingzhixinxiService")
public class DingzhixinxiServiceImpl extends ServiceImpl<DingzhixinxiDao, DingzhixinxiEntity> implements DingzhixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DingzhixinxiEntity> page = this.selectPage(
                new Query<DingzhixinxiEntity>(params).getPage(),
                new EntityWrapper<DingzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DingzhixinxiEntity> wrapper) {
		  Page<DingzhixinxiView> page =new Query<DingzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DingzhixinxiVO> selectListVO(Wrapper<DingzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DingzhixinxiVO selectVO(Wrapper<DingzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DingzhixinxiView> selectListView(Wrapper<DingzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DingzhixinxiView selectView(Wrapper<DingzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
