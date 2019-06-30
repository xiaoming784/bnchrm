package com.neuedu.dao;

import com.neuedu.pojo.JobTransfer;
import com.neuedu.pojo.JobTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JobTransferMapper {
    long countByExample(JobTransferExample example);

    int deleteByExample(JobTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JobTransfer record);

    int insertSelective(JobTransfer record);

    List<JobTransfer> selectByExample(JobTransferExample example);

    JobTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JobTransfer record, @Param("example") JobTransferExample example);

    int updateByExample(@Param("record") JobTransfer record, @Param("example") JobTransferExample example);

    int updateByPrimaryKeySelective(JobTransfer record);

    int updateByPrimaryKey(JobTransfer record);
}