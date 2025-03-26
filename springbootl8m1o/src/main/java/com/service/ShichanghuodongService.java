package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShichanghuodongEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShichanghuodongVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShichanghuodongView;


/**
 * 市场活动
 *
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface ShichanghuodongService extends IService<ShichanghuodongEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShichanghuodongVO> selectListVO(Wrapper<ShichanghuodongEntity> wrapper);
   	
   	ShichanghuodongVO selectVO(@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);
   	
   	List<ShichanghuodongView> selectListView(Wrapper<ShichanghuodongEntity> wrapper);
   	
   	ShichanghuodongView selectView(@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShichanghuodongEntity> wrapper);
   	

}

