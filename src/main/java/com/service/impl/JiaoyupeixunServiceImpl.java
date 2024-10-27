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


import com.dao.JiaoyupeixunDao;
import com.entity.JiaoyupeixunEntity;
import com.service.JiaoyupeixunService;
import com.entity.vo.JiaoyupeixunVO;
import com.entity.view.JiaoyupeixunView;

@Service("jiaoyupeixunService")
public class JiaoyupeixunServiceImpl extends ServiceImpl<JiaoyupeixunDao, JiaoyupeixunEntity> implements JiaoyupeixunService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaoyupeixunEntity> page = this.selectPage(
                new Query<JiaoyupeixunEntity>(params).getPage(),
                new EntityWrapper<JiaoyupeixunEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaoyupeixunEntity> wrapper) {
		  Page<JiaoyupeixunView> page =new Query<JiaoyupeixunView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaoyupeixunVO> selectListVO(Wrapper<JiaoyupeixunEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaoyupeixunVO selectVO(Wrapper<JiaoyupeixunEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaoyupeixunView> selectListView(Wrapper<JiaoyupeixunEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaoyupeixunView selectView(Wrapper<JiaoyupeixunEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
