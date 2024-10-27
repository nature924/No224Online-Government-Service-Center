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


import com.dao.ZhengjianchaxunDao;
import com.entity.ZhengjianchaxunEntity;
import com.service.ZhengjianchaxunService;
import com.entity.vo.ZhengjianchaxunVO;
import com.entity.view.ZhengjianchaxunView;

@Service("zhengjianchaxunService")
public class ZhengjianchaxunServiceImpl extends ServiceImpl<ZhengjianchaxunDao, ZhengjianchaxunEntity> implements ZhengjianchaxunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhengjianchaxunEntity> page = this.selectPage(
                new Query<ZhengjianchaxunEntity>(params).getPage(),
                new EntityWrapper<ZhengjianchaxunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhengjianchaxunEntity> wrapper) {
		  Page<ZhengjianchaxunView> page =new Query<ZhengjianchaxunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhengjianchaxunVO> selectListVO(Wrapper<ZhengjianchaxunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhengjianchaxunVO selectVO(Wrapper<ZhengjianchaxunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhengjianchaxunView> selectListView(Wrapper<ZhengjianchaxunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhengjianchaxunView selectView(Wrapper<ZhengjianchaxunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
