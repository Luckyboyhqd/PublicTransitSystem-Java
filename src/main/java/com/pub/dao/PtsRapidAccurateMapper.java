package com.pub.dao;

import com.pub.entity.PtsRapidAccurate;
import com.pub.entity.PtsRapidAccurateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtsRapidAccurateMapper {
    int countByExample(PtsRapidAccurateExample example);

    int deleteByExample(PtsRapidAccurateExample example);

    int insert(PtsRapidAccurate record);

    int insertSelective(PtsRapidAccurate record);

    List<PtsRapidAccurate> selectByExample(PtsRapidAccurateExample example);

    int updateByExampleSelective(@Param("record") PtsRapidAccurate record, @Param("example") PtsRapidAccurateExample example);

    int updateByExample(@Param("record") PtsRapidAccurate record, @Param("example") PtsRapidAccurateExample example);

    /**
     * 获取信息
     * @return
     */
    List<PtsRapidAccurate> getPtsRapidAccurate();

    /**
     * 查询记录
     * @param uid
     * @return
     */
    PtsRapidAccurate getRapidByUserId(String uid);
}