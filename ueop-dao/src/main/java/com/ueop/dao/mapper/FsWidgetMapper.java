package com.ueop.dao.mapper;

import com.ueop.dao.pojo.FsWidget;
import com.ueop.dao.pojo.FsWidgetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsWidgetMapper {
    int countByExample(FsWidgetExample example);

    int deleteByExample(FsWidgetExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FsWidget record);

    int insertSelective(FsWidget record);

    List<FsWidget> selectByExample(FsWidgetExample example);

    FsWidget selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FsWidget record, @Param("example") FsWidgetExample example);

    int updateByExample(@Param("record") FsWidget record, @Param("example") FsWidgetExample example);

    int updateByPrimaryKeySelective(FsWidget record);

    int updateByPrimaryKey(FsWidget record);
}