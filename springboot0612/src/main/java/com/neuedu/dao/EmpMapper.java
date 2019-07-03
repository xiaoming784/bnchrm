package com.neuedu.dao;

import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpExample;
import java.util.List;

import com.neuedu.pojo.EmpWang;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    long countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer eId);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    List<Emp> selectByExampleWithDept(EmpExample example);

    List<Emp> selectByProbation(EmpExample example);

    List<Emp> selectByMob(EmpExample example);

    List<Emp> selectByDeptMob(EmpExample example);

    List<Emp> selectByJobMob(EmpExample example);

    Emp selectByPrimaryKeyTang(Integer eId);

    Emp selectTransferByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    int updateResults(@Param("eId") int id,@Param("commentsResults") int results);

    int updateDept(@Param("eId") int id,@Param("deptId") int dept);

    int updateJob(@Param("eId") int id,@Param("jobId") int job);

    Emp selectByPrimaryKey(Integer eId);

    EmpWang selectByPrimaryKeyWang(Integer eId);

    int updateByPrimaryKeySelectiveWang(EmpWang emp2);

    int insertSelectiveWang(EmpWang emp2);
}