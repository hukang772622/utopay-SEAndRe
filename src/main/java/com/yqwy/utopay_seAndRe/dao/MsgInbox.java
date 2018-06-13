package com.yqwy.utopay_seAndRe.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.inject.Inject;
import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/6/12.
 */
@Component
public class MsgInbox {

    @Autowired
    private JdbcOperations jdbcOperations;

    public List<Map<String, Object>> find() {
        List<Map<String, Object>> objectList = jdbcOperations.queryForList("SELECT * FROM MSG_Inbox WHERE id = 1");
        return objectList;
    }
}
