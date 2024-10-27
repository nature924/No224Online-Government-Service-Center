package com.entity.view;

import com.entity.ChaxunxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 查询信息
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
@TableName("chaxunxinxi")
public class ChaxunxinxiView  extends ChaxunxinxiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChaxunxinxiView(){
	}
 
 	public ChaxunxinxiView(ChaxunxinxiEntity chaxunxinxiEntity){
 	try {
			BeanUtils.copyProperties(this, chaxunxinxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
