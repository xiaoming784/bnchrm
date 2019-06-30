package com.neuedu.dao;

import com.neuedu.pojo.Emp;
import com.neuedu.pojo.EmpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmpMapper {
    long countByExample(EmpExample example);

    int deleteByExample(EmpExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Emp record);

    int insertSelective(Emp record);

    List<Emp> selectByExample(EmpExample example);

    List<Emp> selectByProbation(EmpExample example);

    List<Emp> selectByMob(EmpExample example);

    List<Emp> selectByDeptMob(EmpExample example);

    List<Emp> selectByJobMob(EmpExample example);

    Emp selectByPrimaryKey(Integer id);

    Emp selectTransferByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByExample(@Param("record") Emp record, @Param("example") EmpExample example);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);

    int updateResults(@Param("id") int id,@Param("results") int results);

    int updateDept(@Param("id") int id,@Param("dept") int dept);

    int updateJob(@Param("id") int id,@Param("job") int job);
}