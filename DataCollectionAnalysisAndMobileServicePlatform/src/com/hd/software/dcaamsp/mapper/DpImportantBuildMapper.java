package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpImportantBuild;
import com.hd.software.dcaamsp.po.DpImportantBuildExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpImportantBuildMapper {
    int countByExample(DpImportantBuildExample example);

    int deleteByExample(DpImportantBuildExample example);

    int insert(DpImportantBuild record);

    int insertSelective(DpImportantBuild record);

    List<DpImportantBuild> selectByExample(DpImportantBuildExample example);

    int updateByExampleSelective(@Param("record") DpImportantBuild record, @Param("example") DpImportantBuildExample example);

    int updateByExample(@Param("record") DpImportantBuild record, @Param("example") DpImportantBuildExample example);
}