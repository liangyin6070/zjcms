package com.mvk.zjcms.dao;

import java.util.List;

import com.mvk.zjcms.model.SysWebsiteMenu;

public interface SysWebsiteMenuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SysWebsiteMenu record);

    int insertSelective(SysWebsiteMenu record);

    SysWebsiteMenu selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SysWebsiteMenu record);

    int updateByPrimaryKey(SysWebsiteMenu record);
    
    List<SysWebsiteMenu> selectByPublish();
}