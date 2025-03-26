package com.entity.view;

import com.entity.PeisongdingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 配送订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
@TableName("peisongdingdan")
public class PeisongdingdanView  extends PeisongdingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public PeisongdingdanView(){
	}
 
 	public PeisongdingdanView(PeisongdingdanEntity peisongdingdanEntity){
 	try {
			BeanUtils.copyProperties(this, peisongdingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
