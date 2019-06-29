package com.neuedu.dao;

import com.neuedu.pojo.Quit;
import com.neuedu.pojo.QuitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface QuitMapper {
    long countByExample(QuitExample example);

    int deleteByExample(QuitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Quit record);

    int insertSelective(Quit record);

    List<Quit> selectByExample(QuitExample example);

    List<Quit> selectByExampleWithEmp(QuitExample example);

    Quit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Quit record, @Param("example") QuitExample example);

    int updateByExample(@Param("record") Quit record, @Param("example") QuitExample example);

    int updateByPrimaryKeySelective(Quit record);

    int updateByPrimaryKey(Quit record);
}