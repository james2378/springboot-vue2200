package com.dao;

import com.entity.ShichanghuodongEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShichanghuodongVO;
import com.entity.view.ShichanghuodongView;


/**
 * 市场活动
 * 
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface ShichanghuodongDao extends BaseMapper<ShichanghuodongEntity> {
	
	List<ShichanghuodongVO> selectListVO(@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);
	
	ShichanghuodongVO selectVO(@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);
	
	List<ShichanghuodongView> selectListView(@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);

	List<ShichanghuodongView> selectListView(Pagination page,@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);
	
	ShichanghuodongView selectView(@Param("ew") Wrapper<ShichanghuodongEntity> wrapper);
	

}
