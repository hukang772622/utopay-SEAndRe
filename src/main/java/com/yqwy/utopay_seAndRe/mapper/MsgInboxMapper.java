package com.yqwy.utopay_seAndRe.mapper;

import com.yqwy.utopay_seAndRe.bean.MsgInbox;
import com.yqwy.utopay_seAndRe.bean.MsgInboxExample;
import java.util.List;

public interface MsgInboxMapper {
    long countByExample(MsgInboxExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MsgInbox record);

    int insertSelective(MsgInbox record);

    List<MsgInbox> selectByExample(MsgInboxExample example);

    MsgInbox selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MsgInbox record);

    int updateByPrimaryKey(MsgInbox record);
}