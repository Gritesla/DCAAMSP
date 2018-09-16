package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpBasicplan;
import com.hd.software.dcaamsp.po.DpBasicplanExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpBasicplanMapper {
    int countByExample(DpBasicplanExample example);

    int deleteByExample(DpBasicplanExample example);

    int deleteByPrimaryKey(BigDecimal dpRespId);

    int insert(DpBasicplan record);

    int insertSelective(DpBasicplan record);

    List<DpBasicplan> selectByExample(DpBasicplanExample example);

    DpBasicplan selectByPrimaryKey(BigDecimal dpRespId);

    int updateByExampleSelective(@Param("record") DpBasicplan record, @Param("example") DpBasicplanExample example);

    int updateByExample(@Param("record") DpBasicplan record, @Param("example") DpBasicplanExample example);

    int updateByPrimaryKeySelective(DpBasicplan record);

    int updateByPrimaryKey(DpBasicplan record);
}