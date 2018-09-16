package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpSmallplacesDevice;
import com.hd.software.dcaamsp.po.DpSmallplacesDeviceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpSmallplacesDeviceMapper {
    int countByExample(DpSmallplacesDeviceExample example);

    int deleteByExample(DpSmallplacesDeviceExample example);

    int insert(DpSmallplacesDevice record);

    int insertSelective(DpSmallplacesDevice record);

    List<DpSmallplacesDevice> selectByExample(DpSmallplacesDeviceExample example);

    int updateByExampleSelective(@Param("record") DpSmallplacesDevice record, @Param("example") DpSmallplacesDeviceExample example);

    int updateByExample(@Param("record") DpSmallplacesDevice record, @Param("example") DpSmallplacesDeviceExample example);
}