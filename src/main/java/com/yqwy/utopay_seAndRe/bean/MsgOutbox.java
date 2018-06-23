package com.yqwy.utopay_seAndRe.bean;

import java.util.Date;

public class MsgOutbox {
    private Integer msgid;

    private Integer expresslevel;

    private String sender;

    private String receiver;

    private Integer msgtype;

    private String msgtitle;

    private String mmscontentlocation;

    private Date sendtime;

    private Integer commport;

    public Integer getMsgid() {
        return msgid;
    }

    public void setMsgid(Integer msgid) {
        this.msgid = msgid;
    }

    public Integer getExpresslevel() {
        return expresslevel;
    }

    public void setExpresslevel(Integer expresslevel) {
        this.expresslevel = expresslevel;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public Integer getMsgtype() {
        return msgtype;
    }

    public void setMsgtype(Integer msgtype) {
        this.msgtype = msgtype;
    }

    public String getMsgtitle() {
        return msgtitle;
    }

    public void setMsgtitle(String msgtitle) {
        this.msgtitle = msgtitle == null ? null : msgtitle.trim();
    }

    public String getMmscontentlocation() {
        return mmscontentlocation;
    }

    public void setMmscontentlocation(String mmscontentlocation) {
        this.mmscontentlocation = mmscontentlocation == null ? null : mmscontentlocation.trim();
    }

    public Date getSendtime() {
        return sendtime;
    }

    public void setSendtime(Date sendtime) {
        this.sendtime = sendtime;
    }

    public Integer getCommport() {
        return commport;
    }

    public void setCommport(Integer commport) {
        this.commport = commport;
    }
}