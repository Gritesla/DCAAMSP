package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpFiresquadron;
import com.hd.software.dcaamsp.po.DpFiresquadronExample;
import java.math.BigDecimal;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpFiresquadronMapper {
    int countByExample(DpFiresquadronExample example);

    int deleteByExample(DpFiresquadronExample example);

    int deleteByPrimaryKey(BigDecimal dpRespId);

    int insert(DpFiresquadron record);

    int insertSelective(DpFiresquadron record);

    List<DpFiresquadron> selectByExample(DpFiresquadronExample example);

    DpFiresquadron selectByPrimaryKey(BigDecimal dpRespId);

    int updateByExampleSelective(@Param("record") DpFiresquadron record, @Param("example") DpFiresquadronExample example);

    int updateByExample(@Param("record") DpFiresquadron record, @Param("example") DpFiresquadronExample example);

    int updateByPrimaryKeySelective(DpFiresquadron record);

    int updateByPrimaryKey(DpFiresquadron record);
}