package com.neuedu.dao;

import com.neuedu.pojo.DeptTransfer;
import com.neuedu.pojo.DeptTransferExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptTransferMapper {
    long countByExample(DeptTransferExample example);

    int deleteByExample(DeptTransferExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeptTransfer record);

    int insertSelective(DeptTransfer record);

    List<DeptTransfer> selectByExample(DeptTransferExample example);

    List<DeptTransfer> selectByExampleWithEmp(DeptTransferExample example);

    List<DeptTransfer> selectByExampleWithEmpAfter(DeptTransferExample example);

    DeptTransfer selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeptTransfer record, @Param("example") DeptTransferExample example);

    int updateByExample(@Param("record") DeptTransfer record, @Param("example") DeptTransferExample example);

    int updateByPrimaryKeySelective(DeptTransfer record);

    int updateByPrimaryKey(DeptTransfer record);
}