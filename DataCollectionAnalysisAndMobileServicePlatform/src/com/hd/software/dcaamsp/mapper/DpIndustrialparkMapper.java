package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpIndustrialpark;
import com.hd.software.dcaamsp.po.DpIndustrialparkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpIndustrialparkMapper {
    int countByExample(DpIndustrialparkExample example);

    int deleteByExample(DpIndustrialparkExample example);

    int insert(DpIndustrialpark record);

    int insertSelective(DpIndustrialpark record);

    List<DpIndustrialpark> selectByExample(DpIndustrialparkExample example);

    int updateByExampleSelective(@Param("record") DpIndustrialpark record, @Param("example") DpIndustrialparkExample example);

    int updateByExample(@Param("record") DpIndustrialpark record, @Param("example") DpIndustrialparkExample example);
}