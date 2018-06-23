package com.yqwy.utopay_seAndRe.service.impl;

import com.yqwy.utopay_seAndRe.bean.MsgInbox;
import com.yqwy.utopay_seAndRe.bean.MsgInboxExample;
import com.yqwy.utopay_seAndRe.mapper.MsgInboxMapper;
import com.yqwy.utopay_seAndRe.service.MsgInboxService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/6/14.
 */
@Service
public class MsgInboxServiceImpl implements MsgInboxService{

    @Autowired
    private MsgInboxMapper msgInboxMapper;

    @Override
    public List<MsgInbox> query(String sender, String msgarrivedtime, Integer time, Integer commport) throws Exception{

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");

        MsgInboxExample msgInboxExample = new MsgInboxExample();
        MsgInboxExample.Criteria criteria = msgInboxExample.createCriteria();
        if (StringUtils.isNotBlank(sender)) {
            criteria.andSenderLike(sender + "%");
        }
        if (msgarrivedtime != null) {
            if (time != null && time != 0) {
                Date dateStart = sdf.parse(msgarrivedtime);
                Date dateEnd = new Date(dateStart.getTime() + time);
                criteria.andMsgarrivedtimeBetween(dateStart, dateEnd);
            }
        }
        if (commport != null) {
            criteria.andCommportEqualTo(commport);
        }
        return msgInboxMapper.selectByExample(msgInboxExample);
    }
}
