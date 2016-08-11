package com.ueop.dao.mapper;

import com.ueop.dao.pojo.Commoncss;
import com.ueop.dao.pojo.CommoncssExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommoncssMapper {
    int countByExample(CommoncssExample example);

    int deleteByExample(CommoncssExample example);

    int insert(Commoncss record);

    int insertSelective(Commoncss record);

    List<Commoncss> selectByExample(CommoncssExample example);

    int updateByExampleSelective(@Param("record") Commoncss record, @Param("example") CommoncssExample example);

    int updateByExample(@Param("record") Commoncss record, @Param("example") CommoncssExample example);
}