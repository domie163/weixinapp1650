package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YifudingzhiEntity;
import com.entity.view.YifudingzhiView;

import com.service.YifudingzhiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 衣服定制
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@RestController
@RequestMapping("/yifudingzhi")
public class YifudingzhiController {
    @Autowired
    private YifudingzhiService yifudingzhiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YifudingzhiEntity yifudingzhi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cehuashi")) {
			yifudingzhi.setCehuazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yifudingzhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YifudingzhiEntity> ew = new EntityWrapper<YifudingzhiEntity>();
		PageUtils page = yifudingzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yifudingzhi), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YifudingzhiEntity yifudingzhi, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cehuashi")) {
			yifudingzhi.setCehuazhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			yifudingzhi.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YifudingzhiEntity> ew = new EntityWrapper<YifudingzhiEntity>();
		PageUtils page = yifudingzhiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yifudingzhi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YifudingzhiEntity yifudingzhi){
       	EntityWrapper<YifudingzhiEntity> ew = new EntityWrapper<YifudingzhiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yifudingzhi, "yifudingzhi")); 
        return R.ok().put("data", yifudingzhiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YifudingzhiEntity yifudingzhi){
        EntityWrapper< YifudingzhiEntity> ew = new EntityWrapper< YifudingzhiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yifudingzhi, "yifudingzhi")); 
		YifudingzhiView yifudingzhiView =  yifudingzhiService.selectView(ew);
		return R.ok("查询衣服定制成功").put("data", yifudingzhiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YifudingzhiEntity yifudingzhi = yifudingzhiService.selectById(id);
        return R.ok().put("data", yifudingzhi);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YifudingzhiEntity yifudingzhi = yifudingzhiService.selectById(id);
        return R.ok().put("data", yifudingzhi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YifudingzhiEntity yifudingzhi, HttpServletRequest request){
    	yifudingzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yifudingzhi);

        yifudingzhiService.insert(yifudingzhi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YifudingzhiEntity yifudingzhi, HttpServletRequest request){
    	yifudingzhi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yifudingzhi);
    	yifudingzhi.setUserid((Long)request.getSession().getAttribute("userId"));

        yifudingzhiService.insert(yifudingzhi);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YifudingzhiEntity yifudingzhi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yifudingzhi);
        yifudingzhiService.updateById(yifudingzhi);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yifudingzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YifudingzhiEntity> wrapper = new EntityWrapper<YifudingzhiEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cehuashi")) {
			wrapper.eq("cehuazhanghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yonghu")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yifudingzhiService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
