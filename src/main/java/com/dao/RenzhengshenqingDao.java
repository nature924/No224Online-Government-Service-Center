package com.dao;

import com.entity.RenzhengshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenzhengshenqingVO;
import com.entity.view.RenzhengshenqingView;


/**
 * 认证申请
 * 
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface RenzhengshenqingDao extends BaseMapper<RenzhengshenqingEntity> {
	
	List<RenzhengshenqingVO> selectListVO(@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);
	
	RenzhengshenqingVO selectVO(@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);
	
	List<RenzhengshenqingView> selectListView(@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);

	List<RenzhengshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);
	
	RenzhengshenqingView selectView(@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);
	

}
