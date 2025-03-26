package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShichanghuodongDao;
import com.entity.ShichanghuodongEntity;
import com.service.ShichanghuodongService;
import com.entity.vo.ShichanghuodongVO;
import com.entity.view.ShichanghuodongView;

@Service("shichanghuodongService")
public class ShichanghuodongServiceImpl extends ServiceImpl<ShichanghuodongDao, ShichanghuodongEntity> implements ShichanghuodongService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShichanghuodongEntity> page = this.selectPage(
                new Query<ShichanghuodongEntity>(params).getPage(),
                new EntityWrapper<ShichanghuodongEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShichanghuodongEntity> wrapper) {
		  Page<ShichanghuodongView> page =new Query<ShichanghuodongView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShichanghuodongVO> selectListVO(Wrapper<ShichanghuodongEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShichanghuodongVO selectVO(Wrapper<ShichanghuodongEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShichanghuodongView> selectListView(Wrapper<ShichanghuodongEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShichanghuodongView selectView(Wrapper<ShichanghuodongEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
