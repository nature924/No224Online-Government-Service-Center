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

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.DaijiaofuwuEntity;
import com.entity.view.DaijiaofuwuView;

import com.service.DaijiaofuwuService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 代缴服务
 * 后端接口
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
@RestController
@RequestMapping("/daijiaofuwu")
public class DaijiaofuwuController {
    @Autowired
    private DaijiaofuwuService daijiaofuwuService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,DaijiaofuwuEntity daijiaofuwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			daijiaofuwu.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<DaijiaofuwuEntity> ew = new EntityWrapper<DaijiaofuwuEntity>();

		PageUtils page = daijiaofuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daijiaofuwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,DaijiaofuwuEntity daijiaofuwu, 
		HttpServletRequest request){
        EntityWrapper<DaijiaofuwuEntity> ew = new EntityWrapper<DaijiaofuwuEntity>();

		PageUtils page = daijiaofuwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, daijiaofuwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( DaijiaofuwuEntity daijiaofuwu){
       	EntityWrapper<DaijiaofuwuEntity> ew = new EntityWrapper<DaijiaofuwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( daijiaofuwu, "daijiaofuwu")); 
        return R.ok().put("data", daijiaofuwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(DaijiaofuwuEntity daijiaofuwu){
        EntityWrapper< DaijiaofuwuEntity> ew = new EntityWrapper< DaijiaofuwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( daijiaofuwu, "daijiaofuwu")); 
		DaijiaofuwuView daijiaofuwuView =  daijiaofuwuService.selectView(ew);
		return R.ok("查询代缴服务成功").put("data", daijiaofuwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        DaijiaofuwuEntity daijiaofuwu = daijiaofuwuService.selectById(id);
        return R.ok().put("data", daijiaofuwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        DaijiaofuwuEntity daijiaofuwu = daijiaofuwuService.selectById(id);
        return R.ok().put("data", daijiaofuwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody DaijiaofuwuEntity daijiaofuwu, HttpServletRequest request){
    	daijiaofuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daijiaofuwu);
        daijiaofuwuService.insert(daijiaofuwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody DaijiaofuwuEntity daijiaofuwu, HttpServletRequest request){
    	daijiaofuwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(daijiaofuwu);
        daijiaofuwuService.insert(daijiaofuwu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody DaijiaofuwuEntity daijiaofuwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(daijiaofuwu);
        daijiaofuwuService.updateById(daijiaofuwu);//全部更新
        return R.ok();
    }


    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        daijiaofuwuService.deleteBatchIds(Arrays.asList(ids));
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
		
		Wrapper<DaijiaofuwuEntity> wrapper = new EntityWrapper<DaijiaofuwuEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuzhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = daijiaofuwuService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	









}
