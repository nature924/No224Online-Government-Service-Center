package com.dao;

import com.entity.JiaoyupeixunEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaoyupeixunVO;
import com.entity.view.JiaoyupeixunView;


/**
 * 教育培训
 * 
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface JiaoyupeixunDao extends BaseMapper<JiaoyupeixunEntity> {
	
	List<JiaoyupeixunVO> selectListVO(@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);
	
	JiaoyupeixunVO selectVO(@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);
	
	List<JiaoyupeixunView> selectListView(@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);

	List<JiaoyupeixunView> selectListView(Pagination page,@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);
	
	JiaoyupeixunView selectView(@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);
	

}
