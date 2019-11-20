package com.uxun.epay.jobexecutor.dao;

import com.uxun.epay.jobexecutor.entity.AgreePaySignTemp;

public interface AgreePaySignTempMapper {
    int deleteByPrimaryKey(String userId);

    int insert(AgreePaySignTemp record);

    int insertSelective(AgreePaySignTemp record);

    AgreePaySignTemp selectByPrimaryKey(String userId);

    int updateByPrimaryKeySelective(AgreePaySignTemp record);

    int updateByPrimaryKey(AgreePaySignTemp record);
}