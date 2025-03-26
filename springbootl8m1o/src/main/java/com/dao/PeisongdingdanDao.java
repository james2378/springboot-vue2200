package com.dao;

import com.entity.PeisongdingdanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.PeisongdingdanVO;
import com.entity.view.PeisongdingdanView;


/**
 * 配送订单
 * 
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface PeisongdingdanDao extends BaseMapper<PeisongdingdanEntity> {
	
	List<PeisongdingdanVO> selectListVO(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	
	PeisongdingdanVO selectVO(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	
	List<PeisongdingdanView> selectListView(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);

	List<PeisongdingdanView> selectListView(Pagination page,@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	
	PeisongdingdanView selectView(@Param("ew") Wrapper<PeisongdingdanEntity> wrapper);
	

}
