package com.mvk.zjcms.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvk.zjcms.dao.SysWebsiteMenuMapper;
import com.mvk.zjcms.model.SysWebsiteMenu;

@Service
//@Transactional
public class SysWebsiteMenuService {

	@Resource
	private SysWebsiteMenuMapper menuMapper;
	
	public List<SysWebsiteMenu> findListByPublish() {
		return menuMapper.selectByPublish();
	}
	
}
