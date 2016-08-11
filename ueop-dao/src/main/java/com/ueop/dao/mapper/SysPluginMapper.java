package com.ueop.dao.mapper;

import com.ueop.dao.pojo.SysPlugin;
import com.ueop.dao.pojo.SysPluginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysPluginMapper {
    int countByExample(SysPluginExample example);

    int deleteByExample(SysPluginExample example);

    int insert(SysPlugin record);

    int insertSelective(SysPlugin record);

    List<SysPlugin> selectByExample(SysPluginExample example);

    int updateByExampleSelective(@Param("record") SysPlugin record, @Param("example") SysPluginExample example);

    int updateByExample(@Param("record") SysPlugin record, @Param("example") SysPluginExample example);
}