package com.yqwy.utopay_seAndRe.controller;

import com.yqwy.utopay_seAndRe.dao.MsgInbox;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/12.
 */
@Controller
public class TestController {

    @Autowired
    private MsgInbox msgInbox;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public void find() {
        List<Map<String, Object>> o = msgInbox.find();
        System.out.println(o);
    }
}
