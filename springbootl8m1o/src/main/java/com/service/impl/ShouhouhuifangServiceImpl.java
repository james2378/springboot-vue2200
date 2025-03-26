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


import com.dao.ShouhouhuifangDao;
import com.entity.ShouhouhuifangEntity;
import com.service.ShouhouhuifangService;
import com.entity.vo.ShouhouhuifangVO;
import com.entity.view.ShouhouhuifangView;

@Service("shouhouhuifangService")
public class ShouhouhuifangServiceImpl extends ServiceImpl<ShouhouhuifangDao, ShouhouhuifangEntity> implements ShouhouhuifangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShouhouhuifangEntity> page = this.selectPage(
                new Query<ShouhouhuifangEntity>(params).getPage(),
                new EntityWrapper<ShouhouhuifangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShouhouhuifangEntity> wrapper) {
		  Page<ShouhouhuifangView> page =new Query<ShouhouhuifangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShouhouhuifangVO> selectListVO(Wrapper<ShouhouhuifangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShouhouhuifangVO selectVO(Wrapper<ShouhouhuifangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShouhouhuifangView> selectListView(Wrapper<ShouhouhuifangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShouhouhuifangView selectView(Wrapper<ShouhouhuifangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
