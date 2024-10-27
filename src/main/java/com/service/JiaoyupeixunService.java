package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaoyupeixunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaoyupeixunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaoyupeixunView;


/**
 * 教育培训
 *
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface JiaoyupeixunService extends IService<JiaoyupeixunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaoyupeixunVO> selectListVO(Wrapper<JiaoyupeixunEntity> wrapper);
   	
   	JiaoyupeixunVO selectVO(@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);
   	
   	List<JiaoyupeixunView> selectListView(Wrapper<JiaoyupeixunEntity> wrapper);
   	
   	JiaoyupeixunView selectView(@Param("ew") Wrapper<JiaoyupeixunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaoyupeixunEntity> wrapper);
   	

}

