package com.ueop.dao.mapper;

import com.ueop.dao.pojo.SysWidget;
import com.ueop.dao.pojo.SysWidgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysWidgetMapper {
    int countByExample(SysWidgetExample example);

    int deleteByExample(SysWidgetExample example);

    int insert(SysWidget record);

    int insertSelective(SysWidget record);

    List<SysWidget> selectByExample(SysWidgetExample example);

    int updateByExampleSelective(@Param("record") SysWidget record, @Param("example") SysWidgetExample example);

    int updateByExample(@Param("record") SysWidget record, @Param("example") SysWidgetExample example);
}