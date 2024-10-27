package com.dao;

import com.entity.ZhengjianchaxunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhengjianchaxunVO;
import com.entity.view.ZhengjianchaxunView;


/**
 * 证件查询
 * 
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface ZhengjianchaxunDao extends BaseMapper<ZhengjianchaxunEntity> {
	
	List<ZhengjianchaxunVO> selectListVO(@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);
	
	ZhengjianchaxunVO selectVO(@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);
	
	List<ZhengjianchaxunView> selectListView(@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);

	List<ZhengjianchaxunView> selectListView(Pagination page,@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);
	
	ZhengjianchaxunView selectView(@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);
	

}
