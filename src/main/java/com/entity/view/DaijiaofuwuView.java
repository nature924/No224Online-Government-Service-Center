package com.entity.view;

import com.entity.DaijiaofuwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 代缴服务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
@TableName("daijiaofuwu")
public class DaijiaofuwuView  extends DaijiaofuwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DaijiaofuwuView(){
	}
 
 	public DaijiaofuwuView(DaijiaofuwuEntity daijiaofuwuEntity){
 	try {
			BeanUtils.copyProperties(this, daijiaofuwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
