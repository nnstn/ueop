package com.ueop.dao.mapper;

import com.ueop.dao.pojo.SysComponent;
import com.ueop.dao.pojo.SysComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysComponentMapper {
    int countByExample(SysComponentExample example);

    int deleteByExample(SysComponentExample example);

    int insert(SysComponent record);

    int insertSelective(SysComponent record);

    List<SysComponent> selectByExample(SysComponentExample example);

    int updateByExampleSelective(@Param("record") SysComponent record, @Param("example") SysComponentExample example);

    int updateByExample(@Param("record") SysComponent record, @Param("example") SysComponentExample example);
}