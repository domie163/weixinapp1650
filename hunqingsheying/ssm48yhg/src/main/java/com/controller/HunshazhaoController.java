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

import com.entity.HunshazhaoEntity;
import com.entity.view.HunshazhaoView;

import com.service.HunshazhaoService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import com.service.StoreupService;
import com.entity.StoreupEntity;

/**
 * 婚纱照
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-06 15:30:36
 */
@RestController
@RequestMapping("/hunshazhao")
public class HunshazhaoController {
    @Autowired
    private HunshazhaoService hunshazhaoService;


    @Autowired
    private StoreupService storeupService;

    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,HunshazhaoEntity hunshazhao, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("cehuashi")) {
			hunshazhao.setCehuazhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<HunshazhaoEntity> ew = new EntityWrapper<HunshazhaoEntity>();
		PageUtils page = hunshazhaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hunshazhao), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,HunshazhaoEntity hunshazhao, 
		HttpServletRequest request){
        EntityWrapper<HunshazhaoEntity> ew = new EntityWrapper<HunshazhaoEntity>();
		PageUtils page = hunshazhaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hunshazhao), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( HunshazhaoEntity hunshazhao){
       	EntityWrapper<HunshazhaoEntity> ew = new EntityWrapper<HunshazhaoEntity>();
      	ew.allEq(MPUtil.allEQMapPre( hunshazhao, "hunshazhao")); 
        return R.ok().put("data", hunshazhaoService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(HunshazhaoEntity hunshazhao){
        EntityWrapper< HunshazhaoEntity> ew = new EntityWrapper< HunshazhaoEntity>();
 		ew.allEq(MPUtil.allEQMapPre( hunshazhao, "hunshazhao")); 
		HunshazhaoView hunshazhaoView =  hunshazhaoService.selectView(ew);
		return R.ok("查询婚纱照成功").put("data", hunshazhaoView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        HunshazhaoEntity hunshazhao = hunshazhaoService.selectById(id);
		hunshazhao.setClicknum(hunshazhao.getClicknum()+1);
		hunshazhao.setClicktime(new Date());
		hunshazhaoService.updateById(hunshazhao);
        return R.ok().put("data", hunshazhao);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        HunshazhaoEntity hunshazhao = hunshazhaoService.selectById(id);
		hunshazhao.setClicknum(hunshazhao.getClicknum()+1);
		hunshazhao.setClicktime(new Date());
		hunshazhaoService.updateById(hunshazhao);
        return R.ok().put("data", hunshazhao);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody HunshazhaoEntity hunshazhao, HttpServletRequest request){
    	hunshazhao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hunshazhao);

        hunshazhaoService.insert(hunshazhao);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody HunshazhaoEntity hunshazhao, HttpServletRequest request){
    	hunshazhao.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(hunshazhao);

        hunshazhaoService.insert(hunshazhao);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody HunshazhaoEntity hunshazhao, HttpServletRequest request){
        //ValidatorUtils.validateEntity(hunshazhao);
        hunshazhaoService.updateById(hunshazhao);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        hunshazhaoService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<HunshazhaoEntity> wrapper = new EntityWrapper<HunshazhaoEntity>();
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

		int count = hunshazhaoService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	
	/**
     * 前端智能排序
     */
	@IgnoreAuth
    @RequestMapping("/autoSort")
    public R autoSort(@RequestParam Map<String, Object> params,HunshazhaoEntity hunshazhao, HttpServletRequest request,String pre){
        EntityWrapper<HunshazhaoEntity> ew = new EntityWrapper<HunshazhaoEntity>();
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
		PageUtils page = hunshazhaoService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, hunshazhao), params), params));
        return R.ok().put("data", page);
    }







}
