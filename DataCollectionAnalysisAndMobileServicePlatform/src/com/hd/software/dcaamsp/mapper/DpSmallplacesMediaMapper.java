package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpSmallplacesMedia;
import com.hd.software.dcaamsp.po.DpSmallplacesMediaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpSmallplacesMediaMapper {
    int countByExample(DpSmallplacesMediaExample example);

    int deleteByExample(DpSmallplacesMediaExample example);

    int insert(DpSmallplacesMedia record);

    int insertSelective(DpSmallplacesMedia record);

    List<DpSmallplacesMedia> selectByExample(DpSmallplacesMediaExample example);

    int updateByExampleSelective(@Param("record") DpSmallplacesMedia record, @Param("example") DpSmallplacesMediaExample example);

    int updateByExample(@Param("record") DpSmallplacesMedia record, @Param("example") DpSmallplacesMediaExample example);
}