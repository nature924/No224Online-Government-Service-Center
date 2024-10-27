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


import com.dao.DaijiaofuwuDao;
import com.entity.DaijiaofuwuEntity;
import com.service.DaijiaofuwuService;
import com.entity.vo.DaijiaofuwuVO;
import com.entity.view.DaijiaofuwuView;

@Service("daijiaofuwuService")
public class DaijiaofuwuServiceImpl extends ServiceImpl<DaijiaofuwuDao, DaijiaofuwuEntity> implements DaijiaofuwuService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DaijiaofuwuEntity> page = this.selectPage(
                new Query<DaijiaofuwuEntity>(params).getPage(),
                new EntityWrapper<DaijiaofuwuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DaijiaofuwuEntity> wrapper) {
		  Page<DaijiaofuwuView> page =new Query<DaijiaofuwuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DaijiaofuwuVO> selectListVO(Wrapper<DaijiaofuwuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DaijiaofuwuVO selectVO(Wrapper<DaijiaofuwuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DaijiaofuwuView> selectListView(Wrapper<DaijiaofuwuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DaijiaofuwuView selectView(Wrapper<DaijiaofuwuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
