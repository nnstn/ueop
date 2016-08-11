package com.ueop.dao.mapper;

import com.ueop.dao.pojo.SysCats;
import com.ueop.dao.pojo.SysCatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysCatsMapper {
    int countByExample(SysCatsExample example);

    int deleteByExample(SysCatsExample example);

    int insert(SysCats record);

    int insertSelective(SysCats record);

    List<SysCats> selectByExample(SysCatsExample example);

    int updateByExampleSelective(@Param("record") SysCats record, @Param("example") SysCatsExample example);

    int updateByExample(@Param("record") SysCats record, @Param("example") SysCatsExample example);
}