package com.jl.mapper;

import com.jl.pojo.JlUser;
import com.jl.pojo.JlUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JlUserMapper {
    int countByExample(JlUserExample example);

    int deleteByExample(JlUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JlUser record);

    int insertSelective(JlUser record);

    List<JlUser> selectByExample(JlUserExample example);

    JlUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JlUser record, @Param("example") JlUserExample example);

    int updateByExample(@Param("record") JlUser record, @Param("example") JlUserExample example);

    int updateByPrimaryKeySelective(JlUser record);

    int updateByPrimaryKey(JlUser record);
}