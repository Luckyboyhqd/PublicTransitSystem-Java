package com.pub.dao;

import com.pub.entity.PtsConvenience;
import com.pub.entity.PtsConvenienceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PtsConvenienceMapper {
    int countByExample(PtsConvenienceExample example);

    int deleteByExample(PtsConvenienceExample example);

    int insert(PtsConvenience record);

    int insertSelective(PtsConvenience record);

    List<PtsConvenience> selectByExample(PtsConvenienceExample example);

    int updateByExampleSelective(@Param("record") PtsConvenience record, @Param("example") PtsConvenienceExample example);

    int updateByExample(@Param("record") PtsConvenience record, @Param("example") PtsConvenienceExample example);

    /**
     * 查询便捷性
     * @return
     */
    List<PtsConvenience> getPtsConveniences();

    /**
     * 查询记录
     * @param uid
     * @return
     */
    PtsConvenience getConvenienceByUserId(String uid);

    /**
     * 获取全部属性
     * @return
     */
    List<PtsConvenience> getAllAttribute();
}