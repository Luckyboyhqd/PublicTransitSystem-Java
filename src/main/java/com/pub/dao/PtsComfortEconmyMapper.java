package com.pub.dao;

import com.pub.entity.PtsComfortEconmy;
import com.pub.entity.PtsComfortEconmyExample;
import java.util.List;

import com.pub.entity.PtsConvenience;
import org.apache.ibatis.annotations.Param;

public interface PtsComfortEconmyMapper {
    int countByExample(PtsComfortEconmyExample example);

    int deleteByExample(PtsComfortEconmyExample example);

    int insert(PtsComfortEconmy record);

    int insertSelective(PtsComfortEconmy record);

    List<PtsComfortEconmy> selectByExample(PtsComfortEconmyExample example);

    int updateByExampleSelective(@Param("record") PtsComfortEconmy record, @Param("example") PtsComfortEconmyExample example);

    int updateByExample(@Param("record") PtsComfortEconmy record, @Param("example") PtsComfortEconmyExample example);

    /**
     * 查询
     * @return
     */
    List<PtsComfortEconmy> getComfortEconmy();

    /**
     * 是否存在记录
     * @param uid
     * @return
     */
    PtsComfortEconmy getComfortEconmyByUserId(String uid);
}