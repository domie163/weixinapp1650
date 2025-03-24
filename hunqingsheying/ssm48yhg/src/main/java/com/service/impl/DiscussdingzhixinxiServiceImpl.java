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


import com.dao.DiscussdingzhixinxiDao;
import com.entity.DiscussdingzhixinxiEntity;
import com.service.DiscussdingzhixinxiService;
import com.entity.vo.DiscussdingzhixinxiVO;
import com.entity.view.DiscussdingzhixinxiView;

@Service("discussdingzhixinxiService")
public class DiscussdingzhixinxiServiceImpl extends ServiceImpl<DiscussdingzhixinxiDao, DiscussdingzhixinxiEntity> implements DiscussdingzhixinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussdingzhixinxiEntity> page = this.selectPage(
                new Query<DiscussdingzhixinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussdingzhixinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussdingzhixinxiEntity> wrapper) {
		  Page<DiscussdingzhixinxiView> page =new Query<DiscussdingzhixinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussdingzhixinxiVO> selectListVO(Wrapper<DiscussdingzhixinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussdingzhixinxiVO selectVO(Wrapper<DiscussdingzhixinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussdingzhixinxiView> selectListView(Wrapper<DiscussdingzhixinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussdingzhixinxiView selectView(Wrapper<DiscussdingzhixinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
