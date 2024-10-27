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


import com.dao.RenzhengshenqingDao;
import com.entity.RenzhengshenqingEntity;
import com.service.RenzhengshenqingService;
import com.entity.vo.RenzhengshenqingVO;
import com.entity.view.RenzhengshenqingView;

@Service("renzhengshenqingService")
public class RenzhengshenqingServiceImpl extends ServiceImpl<RenzhengshenqingDao, RenzhengshenqingEntity> implements RenzhengshenqingService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenzhengshenqingEntity> page = this.selectPage(
                new Query<RenzhengshenqingEntity>(params).getPage(),
                new EntityWrapper<RenzhengshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenzhengshenqingEntity> wrapper) {
		  Page<RenzhengshenqingView> page =new Query<RenzhengshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenzhengshenqingVO> selectListVO(Wrapper<RenzhengshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenzhengshenqingVO selectVO(Wrapper<RenzhengshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenzhengshenqingView> selectListView(Wrapper<RenzhengshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenzhengshenqingView selectView(Wrapper<RenzhengshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
