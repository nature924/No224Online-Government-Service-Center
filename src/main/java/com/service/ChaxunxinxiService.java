package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChaxunxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChaxunxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChaxunxinxiView;


/**
 * 查询信息
 *
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
public interface ChaxunxinxiService extends IService<ChaxunxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChaxunxinxiVO> selectListVO(Wrapper<ChaxunxinxiEntity> wrapper);
   	
   	ChaxunxinxiVO selectVO(@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);
   	
   	List<ChaxunxinxiView> selectListView(Wrapper<ChaxunxinxiEntity> wrapper);
   	
   	ChaxunxinxiView selectView(@Param("ew") Wrapper<ChaxunxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChaxunxinxiEntity> wrapper);
   	

}

