package com.entity.vo;

import com.entity.KehuxinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 客户信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public class KehuxinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 客户地址
	 */
	
	private String kehudizhi;
		
	/**
	 * 负责人
	 */
	
	private String fuzeren;
		
	/**
	 * 客户来源
	 */
	
	private String kehulaiyuan;
		
	/**
	 * 行业
	 */
	
	private String xingye;
		
	/**
	 * 国家地区
	 */
	
	private String guojiadiqu;
		
	/**
	 * 电话
	 */
	
	private String dianhua;
		
	/**
	 * 邮件
	 */
	
	private String youjian;
				
	
	/**
	 * 设置：客户地址
	 */
	 
	public void setKehudizhi(String kehudizhi) {
		this.kehudizhi = kehudizhi;
	}
	
	/**
	 * 获取：客户地址
	 */
	public String getKehudizhi() {
		return kehudizhi;
	}
				
	
	/**
	 * 设置：负责人
	 */
	 
	public void setFuzeren(String fuzeren) {
		this.fuzeren = fuzeren;
	}
	
	/**
	 * 获取：负责人
	 */
	public String getFuzeren() {
		return fuzeren;
	}
				
	
	/**
	 * 设置：客户来源
	 */
	 
	public void setKehulaiyuan(String kehulaiyuan) {
		this.kehulaiyuan = kehulaiyuan;
	}
	
	/**
	 * 获取：客户来源
	 */
	public String getKehulaiyuan() {
		return kehulaiyuan;
	}
				
	
	/**
	 * 设置：行业
	 */
	 
	public void setXingye(String xingye) {
		this.xingye = xingye;
	}
	
	/**
	 * 获取：行业
	 */
	public String getXingye() {
		return xingye;
	}
				
	
	/**
	 * 设置：国家地区
	 */
	 
	public void setGuojiadiqu(String guojiadiqu) {
		this.guojiadiqu = guojiadiqu;
	}
	
	/**
	 * 获取：国家地区
	 */
	public String getGuojiadiqu() {
		return guojiadiqu;
	}
				
	
	/**
	 * 设置：电话
	 */
	 
	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}
	
	/**
	 * 获取：电话
	 */
	public String getDianhua() {
		return dianhua;
	}
				
	
	/**
	 * 设置：邮件
	 */
	 
	public void setYoujian(String youjian) {
		this.youjian = youjian;
	}
	
	/**
	 * 获取：邮件
	 */
	public String getYoujian() {
		return youjian;
	}
			
}
