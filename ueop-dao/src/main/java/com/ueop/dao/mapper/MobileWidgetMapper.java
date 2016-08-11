package com.ueop.dao.mapper;

import com.ueop.dao.pojo.MobileWidget;
import com.ueop.dao.pojo.MobileWidgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MobileWidgetMapper {
    int countByExample(MobileWidgetExample example);

    int deleteByExample(MobileWidgetExample example);

    int insert(MobileWidget record);

    int insertSelective(MobileWidget record);

    List<MobileWidget> selectByExample(MobileWidgetExample example);

    int updateByExampleSelective(@Param("record") MobileWidget record, @Param("example") MobileWidgetExample example);

    int updateByExample(@Param("record") MobileWidget record, @Param("example") MobileWidgetExample example);
}