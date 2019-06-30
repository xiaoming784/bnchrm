package com.neuedu.dao;

import com.neuedu.pojo.ForeignLanguages;
import com.neuedu.pojo.ForeignLanguagesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ForeignLanguagesMapper {
    long countByExample(ForeignLanguagesExample example);

    int deleteByExample(ForeignLanguagesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ForeignLanguages record);

    int insertSelective(ForeignLanguages record);

    List<ForeignLanguages> selectByExample(ForeignLanguagesExample example);

    ForeignLanguages selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ForeignLanguages record, @Param("example") ForeignLanguagesExample example);

    int updateByExample(@Param("record") ForeignLanguages record, @Param("example") ForeignLanguagesExample example);

    int updateByPrimaryKeySelective(ForeignLanguages record);

    int updateByPrimaryKey(ForeignLanguages record);
}