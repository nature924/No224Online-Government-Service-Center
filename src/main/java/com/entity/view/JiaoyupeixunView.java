package com.entity.view;

import com.entity.JiaoyupeixunEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 教育培训
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-25 19:16:54
 */
@TableName("jiaoyupeixun")
public class JiaoyupeixunView  extends JiaoyupeixunEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiaoyupeixunView(){
	}
 
 	public JiaoyupeixunView(JiaoyupeixunEntity jiaoyupeixunEntity){
 	try {
			BeanUtils.copyProperties(this, jiaoyupeixunEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
