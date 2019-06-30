package com.neuedu.dao;

import com.neuedu.pojo.HandleTrial;
import com.neuedu.pojo.HandleTrialExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HandleTrialMapper {
    long countByExample(HandleTrialExample example);

    int deleteByExample(HandleTrialExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HandleTrial record);

    int insertSelective(HandleTrial record);

    List<HandleTrial> selectByExample(HandleTrialExample example);

    HandleTrial selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HandleTrial record, @Param("example") HandleTrialExample example);

    int updateByExample(@Param("record") HandleTrial record, @Param("example") HandleTrialExample example);

    int updateByPrimaryKeySelective(HandleTrial record);

    int updateByPrimaryKey(HandleTrial record);
}