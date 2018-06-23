package com.yqwy.utopay_seAndRe.controller;

import com.yqwy.utopay_seAndRe.bean.MsgInbox;
import com.yqwy.utopay_seAndRe.exception.PermissionException;
import com.yqwy.utopay_seAndRe.service.MsgInboxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.*;

/**
 * Created by Administrator on 2018/6/14.
 */
@Controller
@RequestMapping("/receiver")
public class ReceiverController {

    @Autowired
    private MsgInboxService msgInboxService;

    /**
     *
     * @param uuid 安全验证
     * @param time 多少秒;如果msgarrivedtime不为空,则必传
     * @param msgarrivedtime 收到短信的时间
     * @param commport 接收短信的端口
     * @param sender 短信发送号
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public Map<String, Object> receiver(@RequestParam String uuid,
                                         @RequestParam() String msgarrivedtime, @RequestParam() Integer time,
                                        @RequestParam(required = false) Integer commport, @RequestParam(required = false) String sender) throws Exception{
        if ("300C888180FB4717BFD11E0EAE651D43".equals(uuid)) {
            Map<String, Object> map = new HashMap<>();
            List<MsgInbox> msgInboxes = msgInboxService.query(sender,msgarrivedtime, time,commport);
            map.put("messages", msgInboxes);
            return map;
        } else {
            throw new PermissionException("权限不足");
        }
    }
}
