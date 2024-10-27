package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DaijiaofuwuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DaijiaofuwuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DaijiaofuwuView;


/**
 * 代缴服务
 *
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface DaijiaofuwuService extends IService<DaijiaofuwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DaijiaofuwuVO> selectListVO(Wrapper<DaijiaofuwuEntity> wrapper);
   	
   	DaijiaofuwuVO selectVO(@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);
   	
   	List<DaijiaofuwuView> selectListView(Wrapper<DaijiaofuwuEntity> wrapper);
   	
   	DaijiaofuwuView selectView(@Param("ew") Wrapper<DaijiaofuwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DaijiaofuwuEntity> wrapper);
   	

}

