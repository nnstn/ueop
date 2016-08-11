package com.ueop.dao.mapper;

import com.ueop.dao.pojo.MobileComponent;
import com.ueop.dao.pojo.MobileComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileComponentMapper {
    int countByExample(MobileComponentExample example);

    int deleteByExample(MobileComponentExample example);

    int insert(MobileComponent record);

    int insertSelective(MobileComponent record);

    List<MobileComponent> selectByExample(MobileComponentExample example);

    int updateByExampleSelective(@Param("record") MobileComponent record, @Param("example") MobileComponentExample example);

    int updateByExample(@Param("record") MobileComponent record, @Param("example") MobileComponentExample example);
}