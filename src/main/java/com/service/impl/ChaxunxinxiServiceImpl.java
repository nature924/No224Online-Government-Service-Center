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


import com.dao.ChaxunxinxiDao;
import com.entity.ChaxunxinxiEntity;
import com.service.ChaxunxinxiService;
import com.entity.vo.ChaxunxinxiVO;
import com.entity.view.ChaxunxinxiView;

@Service("chaxunxinxiService")
public class ChaxunxinxiServiceImpl extends ServiceImpl<ChaxunxinxiDao, ChaxunxinxiEntity> implements ChaxunxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChaxunxinxiEntity> page = this.selectPage(
                new Query<ChaxunxinxiEntity>(params).getPage(),
                new EntityWrapper<ChaxunxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChaxunxinxiEntity> wrapper) {
		  Page<ChaxunxinxiView> page =new Query<ChaxunxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChaxunxinxiVO> selectListVO(Wrapper<ChaxunxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChaxunxinxiVO selectVO(Wrapper<ChaxunxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChaxunxinxiView> selectListView(Wrapper<ChaxunxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChaxunxinxiView selectView(Wrapper<ChaxunxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
