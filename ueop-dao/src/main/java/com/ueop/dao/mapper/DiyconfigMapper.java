package com.ueop.dao.mapper;

import com.ueop.dao.pojo.Diyconfig;
import com.ueop.dao.pojo.DiyconfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DiyconfigMapper {
    int countByExample(DiyconfigExample example);

    int deleteByExample(DiyconfigExample example);

    int insert(Diyconfig record);

    int insertSelective(Diyconfig record);

    List<Diyconfig> selectByExample(DiyconfigExample example);

    int updateByExampleSelective(@Param("record") Diyconfig record, @Param("example") DiyconfigExample example);

    int updateByExample(@Param("record") Diyconfig record, @Param("example") DiyconfigExample example);
}