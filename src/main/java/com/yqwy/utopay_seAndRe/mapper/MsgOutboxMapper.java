package com.yqwy.utopay_seAndRe.mapper;

import com.yqwy.utopay_seAndRe.bean.MsgOutbox;

public interface MsgOutboxMapper {
    int deleteByPrimaryKey(Integer msgid);

    int insert(MsgOutbox record);

    int insertSelective(MsgOutbox record);

    MsgOutbox selectByPrimaryKey(Integer msgid);

    int updateByPrimaryKeySelective(MsgOutbox record);

    int updateByPrimaryKey(MsgOutbox record);
}