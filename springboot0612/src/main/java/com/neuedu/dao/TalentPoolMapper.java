package com.neuedu.dao;

import com.neuedu.pojo.TalentPool;
import com.neuedu.pojo.TalentPoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TalentPoolMapper {
    long countByExample(TalentPoolExample example);

    int deleteByExample(TalentPoolExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TalentPool record);

    int insertSelective(TalentPool record);

    List<TalentPool> selectByExample(TalentPoolExample example);

    TalentPool selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TalentPool record, @Param("example") TalentPoolExample example);

    int updateByExample(@Param("record") TalentPool record, @Param("example") TalentPoolExample example);

    int updateByPrimaryKeySelective(TalentPool record);

    int updateByPrimaryKey(TalentPool record);
}