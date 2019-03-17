package com.lucasxu.myblog.dao;

import com.lucasxu.myblog.entity.SysView;
import com.lucasxu.myblog.entity.SysViewExample;
import java.util.List;

public interface SysViewMapper {
    int insert(SysView record);

    int insertSelective(SysView record);

    List<SysView> selectByExample(SysViewExample example);
}