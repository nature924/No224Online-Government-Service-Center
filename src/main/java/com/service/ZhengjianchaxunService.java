package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhengjianchaxunEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhengjianchaxunVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhengjianchaxunView;


/**
 * 证件查询
 *
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface ZhengjianchaxunService extends IService<ZhengjianchaxunEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhengjianchaxunVO> selectListVO(Wrapper<ZhengjianchaxunEntity> wrapper);
   	
   	ZhengjianchaxunVO selectVO(@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);
   	
   	List<ZhengjianchaxunView> selectListView(Wrapper<ZhengjianchaxunEntity> wrapper);
   	
   	ZhengjianchaxunView selectView(@Param("ew") Wrapper<ZhengjianchaxunEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhengjianchaxunEntity> wrapper);
   	

}

