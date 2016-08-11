package com.ueop.dao.mapper;

import com.ueop.dao.pojo.Model;
import com.ueop.dao.pojo.ModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ModelMapper {
    int countByExample(ModelExample example);

    int deleteByExample(ModelExample example);

    int insert(Model record);

    int insertSelective(Model record);

    List<Model> selectByExampleWithBLOBs(ModelExample example);

    List<Model> selectByExample(ModelExample example);

    int updateByExampleSelective(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExampleWithBLOBs(@Param("record") Model record, @Param("example") ModelExample example);

    int updateByExample(@Param("record") Model record, @Param("example") ModelExample example);
}