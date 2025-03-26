package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShouhouhuifangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShouhouhuifangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShouhouhuifangView;


/**
 * 售后回访
 *
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface ShouhouhuifangService extends IService<ShouhouhuifangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShouhouhuifangVO> selectListVO(Wrapper<ShouhouhuifangEntity> wrapper);
   	
   	ShouhouhuifangVO selectVO(@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);
   	
   	List<ShouhouhuifangView> selectListView(Wrapper<ShouhouhuifangEntity> wrapper);
   	
   	ShouhouhuifangView selectView(@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShouhouhuifangEntity> wrapper);
   	

}

