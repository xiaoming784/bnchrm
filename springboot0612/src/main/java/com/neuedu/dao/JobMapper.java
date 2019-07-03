package com.neuedu.dao;

import com.neuedu.pojo.Job;
import com.neuedu.pojo.JobExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobMapper {
    long countByExample(JobExample example);

    int deleteByExample(JobExample example);

    int deleteByPrimaryKey(Integer jId);

    int insert(Job record);

    int insertSelective(Job record);

    List<Job> selectByExample(JobExample example);

    Job selectByPrimaryKey(Integer jId);

    int updateByExampleSelective(@Param("record") Job record, @Param("example") JobExample example);

    int updateByExample(@Param("record") Job record, @Param("example") JobExample example);

    int updateByPrimaryKeySelective(Job record);

    int updateByPrimaryKey(Job record);
}