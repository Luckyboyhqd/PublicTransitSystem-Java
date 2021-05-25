package com.pub.dao;

import com.pub.entity.PtsServiceLevel;
import com.pub.entity.PtsServiceLevelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtsServiceLevelMapper {
    int countByExample(PtsServiceLevelExample example);

    int deleteByExample(PtsServiceLevelExample example);

    int insert(PtsServiceLevel record);

    int insertSelective(PtsServiceLevel record);

    List<PtsServiceLevel> selectByExample(PtsServiceLevelExample example);

    int updateByExampleSelective(@Param("record") PtsServiceLevel record, @Param("example") PtsServiceLevelExample example);

    int updateByExample(@Param("record") PtsServiceLevel record, @Param("example") PtsServiceLevelExample example);

    /**
     * 查询记录是否存在
     * @param userId
     * @return
     */
    PtsServiceLevel getServiceLevelByUserId(String userId);
}