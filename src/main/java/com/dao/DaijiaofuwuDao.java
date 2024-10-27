package com.dao;

import com.entity.DaijiaofuwuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DaijiaofuwuVO;
import com.entity.view.DaijiaofuwuView;


/**
 * 代缴服务
 * 
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface DaijiaofuwuDao extends BaseMapper<DaijiaofuwuEntity> {
	
	List<DaijiaofuwuVO> selectListVO(@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);
	
	DaijiaofuwuVO selectVO(@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);
	
	List<DaijiaofuwuView> selectListView(@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);

	List<DaijiaofuwuView> selectListView(Pagination page,@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);
	
	DaijiaofuwuView selectView(@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);
	

}
