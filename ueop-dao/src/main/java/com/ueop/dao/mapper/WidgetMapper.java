package com.ueop.dao.mapper;

import com.ueop.dao.pojo.Widget;
import com.ueop.dao.pojo.WidgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WidgetMapper {
    int countByExample(WidgetExample example);

    int deleteByExample(WidgetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Widget record);

    int insertSelective(Widget record);

    List<Widget> selectByExample(WidgetExample example);

    Widget selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Widget record, @Param("example") WidgetExample example);

    int updateByExample(@Param("record") Widget record, @Param("example") WidgetExample example);

    int updateByPrimaryKeySelective(Widget record);

    int updateByPrimaryKey(Widget record);
}