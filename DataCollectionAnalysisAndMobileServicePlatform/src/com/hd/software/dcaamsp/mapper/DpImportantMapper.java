package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpImportant;
import com.hd.software.dcaamsp.po.DpImportantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpImportantMapper {
    int countByExample(DpImportantExample example);

    int deleteByExample(DpImportantExample example);

    int insert(DpImportant record);

    int insertSelective(DpImportant record);

    List<DpImportant> selectByExample(DpImportantExample example);

    int updateByExampleSelective(@Param("record") DpImportant record, @Param("example") DpImportantExample example);

    int updateByExample(@Param("record") DpImportant record, @Param("example") DpImportantExample example);
}