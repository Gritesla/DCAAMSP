package com.hd.software.dcaamsp.mapper;

import com.hd.software.dcaamsp.po.DpDetachmentDetail;
import com.hd.software.dcaamsp.po.DpDetachmentDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DpDetachmentDetailMapper {
    int countByExample(DpDetachmentDetailExample example);

    int deleteByExample(DpDetachmentDetailExample example);

    int insert(DpDetachmentDetail record);

    int insertSelective(DpDetachmentDetail record);

    List<DpDetachmentDetail> selectByExample(DpDetachmentDetailExample example);

    int updateByExampleSelective(@Param("record") DpDetachmentDetail record, @Param("example") DpDetachmentDetailExample example);

    int updateByExample(@Param("record") DpDetachmentDetail record, @Param("example") DpDetachmentDetailExample example);
}