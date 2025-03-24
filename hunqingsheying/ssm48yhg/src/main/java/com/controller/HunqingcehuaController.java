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

import com.entity.HunqingcehuaEntity;
import com.entity.view.HunqingcehuaView;

import com.service.HunqingcehuaService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 婚庆策划
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@RestController
@RequestMapping("/hunqingcehua")
public class HunqingcehuaController {
    @Autowired
    private HunqingcehuaService hunqingcehuaService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HunqingcehuaEntity hunqingcehua, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cehuashi")) {
			hunqingcehua.setCehuazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HunqingcehuaEntity> ew = new EntityWrapper<HunqingcehuaEntity>();
		PageUtils page = hunqingcehuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hunqingcehua), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HunqingcehuaEntity hunqingcehua, 
		HttpServletRequest request){
        EntityWrapper<HunqingcehuaEntity> ew = new EntityWrapper<HunqingcehuaEntity>();
		PageUtils page = hunqingcehuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hunqingcehua), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HunqingcehuaEntity hunqingcehua){
       	EntityWrapper<HunqingcehuaEntity> ew = new EntityWrapper<HunqingcehuaEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hunqingcehua, "hunqingcehua")); 
        return R.ok().put("data", hunqingcehuaService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HunqingcehuaEntity hunqingcehua){
        EntityWrapper< HunqingcehuaEntity> ew = new EntityWrapper< HunqingcehuaEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hunqingcehua, "hunqingcehua")); 
		HunqingcehuaView hunqingcehuaView =  hunqingcehuaService.selectView(ew);
		return R.ok("查询婚庆策划成功").put("data", hunqingcehuaView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HunqingcehuaEntity hunqingcehua = hunqingcehuaService.selectById(id);
		hunqingcehua.setClicknum(hunqingcehua.getClicknum()+1);
		hunqingcehua.setClicktime(new Date());
		hunqingcehuaService.updateById(hunqingcehua);
        return R.ok().put("data", hunqingcehua);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HunqingcehuaEntity hunqingcehua = hunqingcehuaService.selectById(id);
		hunqingcehua.setClicknum(hunqingcehua.getClicknum()+1);
		hunqingcehua.setClicktime(new Date());
		hunqingcehuaService.updateById(hunqingcehua);
        return R.ok().put("data", hunqingcehua);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HunqingcehuaEntity hunqingcehua, HttpServletRequest request){
    	hunqingcehua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hunqingcehua);

        hunqingcehuaService.insert(hunqingcehua);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HunqingcehuaEntity hunqingcehua, HttpServletRequest request){
    	hunqingcehua.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hunqingcehua);

        hunqingcehuaService.insert(hunqingcehua);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HunqingcehuaEntity hunqingcehua, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hunqingcehua);
        hunqingcehuaService.updateById(hunqingcehua);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hunqingcehuaService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HunqingcehuaEntity> wrapper = new EntityWrapper<HunqingcehuaEntity>();
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

		int count = hunqingcehuaService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,HunqingcehuaEntity hunqingcehua, HttpServletRequest request,String pre){
        EntityWrapper<HunqingcehuaEntity> ew = new EntityWrapper<HunqingcehuaEntity>();
        Map<String, Object> newMap = new HashMap<String, Object>();
        Map<String, Object> param = new HashMap<String, Object>();
		Iterator<Map.Entry<String, Object>> it = param.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, Object> entry = it.next();
			String key = entry.getKey();
			String newKey = entry.getKey();
			if (pre.endsWith(".")) {
				newMap.put(pre + newKey, entry.getValue());
			} else if (StringUtils.isEmpty(pre)) {
				newMap.put(newKey, entry.getValue());
			} else {
				newMap.put(pre + "." + newKey, entry.getValue());
			}
		}
		params.put("sort", "clicknum");
        
        params.put("order", "desc");
		PageUtils page = hunqingcehuaService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hunqingcehua), params), params));
        return R.ok().put("data", page);
    }







}
