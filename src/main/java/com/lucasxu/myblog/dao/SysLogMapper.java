package com.lucasxu.myblog.dao;

import com.lucasxu.myblog.entity.SysLog;
import com.lucasxu.myblog.entity.SysLogExample;
import java.util.List;

public interface SysLogMapper {
    int insert(SysLog record);

    int insertSelective(SysLog record);

    List<SysLog> selectByExample(SysLogExample example);
}