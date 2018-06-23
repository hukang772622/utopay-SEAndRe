package com.yqwy.utopay_seAndRe.service;

import com.yqwy.utopay_seAndRe.bean.MsgInbox;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/6/14.
 */
public interface MsgInboxService {

    List<MsgInbox> query(String sender, String msgarrivedtime, Integer time, Integer commport) throws Exception;
}
