package com.dao;

import com.entity.ChaxunxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChaxunxinxiVO;
import com.entity.view.ChaxunxinxiView;


/**
 * 查询信息
 * 
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface ChaxunxinxiDao extends BaseMapper<ChaxunxinxiEntity> {
	
	List<ChaxunxinxiVO> selectListVO(@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);
	
	ChaxunxinxiVO selectVO(@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);
	
	List<ChaxunxinxiView> selectListView(@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);

	List<ChaxunxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);
	
	ChaxunxinxiView selectView(@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);
	

}
