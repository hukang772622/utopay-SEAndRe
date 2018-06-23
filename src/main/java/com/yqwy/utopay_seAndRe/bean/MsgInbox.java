package com.yqwy.utopay_seAndRe.bean;

import java.util.Date;

public class MsgInbox {
    private Integer id;

    private Integer msgtype;

    private String msgtitle;

    private String mmsurl;

    private String mmscontentlocation;

    private Date msgarrivedtime;

    private Date mmsdownloadedtime;

    private Integer mmsdownloadedstate;

    private Integer commport;

    private String sender;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getMmsurl() {
        return mmsurl;
    }

    public void setMmsurl(String mmsurl) {
        this.mmsurl = mmsurl == null ? null : mmsurl.trim();
    }

    public String getMmscontentlocation() {
        return mmscontentlocation;
    }

    public void setMmscontentlocation(String mmscontentlocation) {
        this.mmscontentlocation = mmscontentlocation == null ? null : mmscontentlocation.trim();
    }

    public Date getMsgarrivedtime() {
        return msgarrivedtime;
    }

    public void setMsgarrivedtime(Date msgarrivedtime) {
        this.msgarrivedtime = msgarrivedtime;
    }

    public Date getMmsdownloadedtime() {
        return mmsdownloadedtime;
    }

    public void setMmsdownloadedtime(Date mmsdownloadedtime) {
        this.mmsdownloadedtime = mmsdownloadedtime;
    }

    public Integer getMmsdownloadedstate() {
        return mmsdownloadedstate;
    }

    public void setMmsdownloadedstate(Integer mmsdownloadedstate) {
        this.mmsdownloadedstate = mmsdownloadedstate;
    }

    public Integer getCommport() {
        return commport;
    }

    public void setCommport(Integer commport) {
        this.commport = commport;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender == null ? null : sender.trim();
    }
}