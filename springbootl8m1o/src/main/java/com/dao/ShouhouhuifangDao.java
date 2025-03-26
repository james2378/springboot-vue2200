package com.dao;

import com.entity.ShouhouhuifangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShouhouhuifangVO;
import com.entity.view.ShouhouhuifangView;


/**
 * 售后回访
 * 
 * @author 
 * @email 
 * @date 2022-02-24 16:58:35
 */
public interface ShouhouhuifangDao extends BaseMapper<ShouhouhuifangEntity> {
	
	List<ShouhouhuifangVO> selectListVO(@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);
	
	ShouhouhuifangVO selectVO(@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);
	
	List<ShouhouhuifangView> selectListView(@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);

	List<ShouhouhuifangView> selectListView(Pagination page,@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);
	
	ShouhouhuifangView selectView(@Param("ew") Wrapper<ShouhouhuifangEntity> wrapper);
	

}
