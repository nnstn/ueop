package com.ueop.dao.mapper;

import com.ueop.dao.pojo.FsComponent;
import com.ueop.dao.pojo.FsComponentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FsComponentMapper {
    int countByExample(FsComponentExample example);

    int deleteByExample(FsComponentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FsComponent record);

    int insertSelective(FsComponent record);

    List<FsComponent> selectByExample(FsComponentExample example);

    FsComponent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FsComponent record, @Param("example") FsComponentExample example);

    int updateByExample(@Param("record") FsComponent record, @Param("example") FsComponentExample example);

    int updateByPrimaryKeySelective(FsComponent record);

    int updateByPrimaryKey(FsComponent record);
}