package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PeisongdingdanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PeisongdingdanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PeisongdingdanView;


/**
 * 配送订单
 *
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface PeisongdingdanService extends IService<PeisongdingdanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PeisongdingdanVO> selectListVO(Wrapper<PeisongdingdanEntity> wrapper);
   	
   	PeisongdingdanVO selectVO(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
   	
   	List<PeisongdingdanView> selectListView(Wrapper<PeisongdingdanEntity> wrapper);
   	
   	PeisongdingdanView selectView(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PeisongdingdanEntity> wrapper);
   	

}

