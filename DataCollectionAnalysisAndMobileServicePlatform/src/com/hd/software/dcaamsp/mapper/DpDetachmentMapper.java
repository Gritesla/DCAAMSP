package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpDetachment;
import com.hd.software.dcaamsp.po.DpDetachmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpDetachmentMapper {
    int countByExample(DpDetachmentExample example);

    int deleteByExample(DpDetachmentExample example);

    int insert(DpDetachment record);

    int insertSelective(DpDetachment record);

    List<DpDetachment> selectByExample(DpDetachmentExample example);

    int updateByExampleSelective(@Param("record") DpDetachment record, @Param("example") DpDetachmentExample example);

    int updateByExample(@Param("record") DpDetachment record, @Param("example") DpDetachmentExample example);
}