package com.august.mapper;

import com.august.entity.SiteCode;
import com.august.entity.SiteCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SiteCodeMapper {
    long countByExample(SiteCodeExample example);

    int deleteByExample(SiteCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SiteCode record);

    int insertSelective(SiteCode record);

    List<SiteCode> selectByExample(SiteCodeExample example);

    SiteCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SiteCode record, @Param("example") SiteCodeExample example);

    int updateByExample(@Param("record") SiteCode record, @Param("example") SiteCodeExample example);

    int updateByPrimaryKeySelective(SiteCode record);

    int updateByPrimaryKey(SiteCode record);
}