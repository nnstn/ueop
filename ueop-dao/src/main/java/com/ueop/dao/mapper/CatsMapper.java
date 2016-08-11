package com.ueop.dao.mapper;

import com.ueop.dao.pojo.Cats;
import com.ueop.dao.pojo.CatsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CatsMapper {
    int countByExample(CatsExample example);

    int deleteByExample(CatsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Cats record);

    int insertSelective(Cats record);

    List<Cats> selectByExample(CatsExample example);

    Cats selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Cats record, @Param("example") CatsExample example);

    int updateByExample(@Param("record") Cats record, @Param("example") CatsExample example);

    int updateByPrimaryKeySelective(Cats record);

    int updateByPrimaryKey(Cats record);
}