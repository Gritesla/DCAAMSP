package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpSmallplaces;
import com.hd.software.dcaamsp.po.DpSmallplacesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpSmallplacesMapper {
    int countByExample(DpSmallplacesExample example);

    int deleteByExample(DpSmallplacesExample example);

    int insert(DpSmallplaces record);

    int insertSelective(DpSmallplaces record);

    List<DpSmallplaces> selectByExample(DpSmallplacesExample example);

    int updateByExampleSelective(@Param("record") DpSmallplaces record, @Param("example") DpSmallplacesExample example);

    int updateByExample(@Param("record") DpSmallplaces record, @Param("example") DpSmallplacesExample example);
}