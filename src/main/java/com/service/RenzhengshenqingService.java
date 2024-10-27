package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenzhengshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenzhengshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenzhengshenqingView;


/**
 * 认证申请
 *
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface RenzhengshenqingService extends IService<RenzhengshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenzhengshenqingVO> selectListVO(Wrapper<RenzhengshenqingEntity> wrapper);
   	
   	RenzhengshenqingVO selectVO(@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);
   	
   	List<RenzhengshenqingView> selectListView(Wrapper<RenzhengshenqingEntity> wrapper);
   	
   	RenzhengshenqingView selectView(@Param("ew") Wrapper<RenzhengshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenzhengshenqingEntity> wrapper);
   	

}

